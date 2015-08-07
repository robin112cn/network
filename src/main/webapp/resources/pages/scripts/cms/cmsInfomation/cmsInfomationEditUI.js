// jquey validate验证
var InforEditor = function() {
	// validation using icons
	var handleValidation = function() {
		// for more info visit the official plugin documentation:
		// http://docs.jquery.com/Plugins/Validation
		var form = $('#inforForm');
		//var error = $('.alert-danger', form);
		//var success = $('.alert-success', form);

		return form.validate({
			errorElement : 'span', // default input error message container
			errorClass : 'help-block help-block-error', // default input error
														// message class
			focusInvalid : false, // do not focus the last invalid input
			ignore : "", // validate all fields including form hidden input
			rules : {
				shortTitle : {
					maxlength : 20,
					required : true
				},
				longTitle : {
					maxlength : 100,
					required : true
				},
				imgTitle : {
					required : true
				},
				colName : {
					required : true
				},
				infoAbstract : {
					required : true
				},
				content : {
					required : true
				}
			},

			invalidHandler : function(event, validator) { // display error
															// alert on form
															// submit
				//success2.hide();
				toastr['error']("表单验证失败！请检查输入项", "系统提示");
				//Metronic.scrollTo(error2, -200);
			},

			errorPlacement : function(error, element) { // render error
														// placement for each
														// input type
				var icon = Metronic.handValidStyle(element);
				icon.removeClass('fa-check').addClass("fa-warning");
				icon.attr("data-original-title", error.text()).tooltip({
					'container' : '#inforForm'
				});
			},

			highlight : function(element) { // hightlight error inputs
				$(element).closest('.form-group').removeClass("has-success")
						.addClass('has-error'); // set error class to the
												// control group
			},

			unhighlight : function(element) { // revert the change done by
												// hightlight

			},

			success : function(label, element) {
				var icon = Metronic.handValidStyle(element);
				$(element).closest('.form-group').removeClass('has-error')
						.addClass('has-success'); // set success class to the
													// control group
				icon.removeClass("fa-warning").addClass("fa-check");
			},

			submitHandler : function(form) {
				//success2.show();
				//error2.hide();
				form[0].submit(); // submit the form
			}
		});
	}

	handzTreeColumns = function(cols) {
		for(var i = 0 ;i<cols.length;i++){
			var node = '';
			if(cols[i].parentId == '-'){
				node = {
						id:cols[i].columnId,
						pId:1,
						name:cols[i].columnName,
						open:true,
						t:cols[i].columnName,
						click:"clickColumnTree('"+cols[i].columnId+"','"+cols[i].columnName+"');"
					};

			}else{
				node = {
						id:cols[i].columnId,
						pId:cols[i].parentId,
						name:cols[i].columnName,
						open:true,
						t:cols[i].columnName,
						click:"clickColumnTree('"+cols[i].columnId+"','"+cols[i].columnName+"');"
						};

			}
			zNodes.push(node);
		}
	}

	return {
		// main function to initiate the module
		init : function() {
			return handleValidation();
		},
		handzTreeData : function(cols) {
			handzTreeColumns(cols);
		},
		zTreeInit: function() {

			jQuery.fn.zTree.init($("#colTree"), setting, zNodes);
			zTree = jQuery.fn.zTree.getZTreeObj("colTree");
			var node = zTree.getNodeByParam("id","1");
	    	zTree.selectNode(node);
		}
	};
}();
var inforValidator = InforEditor.init();

//ztree内容
var zTree;
var setting = {
	  	data: {
		 	key: { title:"t"},
	  	 	simpleData: { enable: true }
		},
		view: {
	  	 	dblClickExpand: false,
	  	 	showLine: true,
	  	 	selectedMulti: false
		},
	  	 callback: {
			beforeClick: beforeClick
	  	 }
};
var zNodes =[];

//根节点禁止选中
function beforeClick(treeId, treeNode) {
	var check = true;
	if(treeNode.id == 1){
		check = false;
	}
	return check;
}

function clickColumnTree(treeId, treeName) {
	$("#columnIdAdd").val(treeId);
	$("#colNameAdd").val(treeName);
	$('#colTreeModal').modal('hide');
}

$('#colBtn').click(function (e) {
    e.stopPropagation();
    e.preventDefault();
    //alert('1234');
    $('#colTreeModal').modal('show');
});

var options = {
	"closeButton" : true,
	"debug" : false,
	"positionClass" : "toast-top-center",
	"onclick" : null,
	"showDuration" : "1000",
	"hideDuration" : "1000",
	"timeOut" : "3000",
	"extendedTimeOut" : "1000",
	"showEasing" : "swing",
	"hideEasing" : "linear",
	"showMethod" : "fadeIn",
	"hideMethod" : "fadeOut"
}
toastr.options = options;

//创建
$('#addInfo').click(function() {
	// Update textareas with ckeditor content
    for (var i in CKEDITOR.instances) {
        CKEDITOR.instances[i].updateElement();
        $.trim($('#' + i).val());
    }
	if (!inforValidator.form())
		return false;

	var tag = 'add';
	if($("#infoIdAdd").val()) {
		tag = 'edit';
	}
	$.ajax({
		type : "POST",
		url : ctx + "/cmsInformation/save",
		data : {
			tag : tag,
			infoId : $("#infoIdAdd").val(),
			shortTitle : $("#shortTitleAdd").val(),
			longTitle : $("#longTitleAdd").val(),
			imgTitle : $("#imgTitleAdd").val(),
			columnId : $("#columnIdAdd").val(),
			keyworkds : $("#keyworkdsAdd").val(),
			source : $("#sourceAdd").val(),
			author : $("#authorAdd").val(),
			infoAbstract : $("#infoAbstractAdd").val(),
			content : $("#contentAdd").val(),
			readTimes : $("#readTimesAdd").val(),
			url : $("#urlAdd").val()
		},
		dataType : "json",
		success : function(data) {
			if(data.success){
				$("#infoIdAdd").val(data.msg);
				//TODO：返回文章列表
				var url = ctx + "/cmsInformation/show?menu_id=2000_1";
				location.href = url;
			}else{
				toastr['error'](data.msg, "系统提示");
			}
		}
	});
});

var finder;
var api;
$('#picSelect').click(function() {
	// You can use the "CKFinder" class to render CKFinder in a page:
	finder = new CKFinder();
	// The path for the installation of CKFinder (default = "/ckfinder/").
	// The default height is 400.
	// This is a sample function which is called when a file is selected in CKFinder.
	finder.selectActionFunction = showFileInfo;
	finder.basePath = "../";
	api = finder.popup( {width: 960,  height : 600, popupTitle : '选择图片标题', popupFeatures : 'menubar=yes,modal=yes' } );
});


function showFileInfo( fileUrl, data, allFiles )
{
	$("#imgTitleAdd").val(decodeURIComponent(fileUrl));
	if(api)	api.closePopup();

}

$('#back').click(function() {
	var url = ctx + "/cmsInformation/show?menu_id=2000_1";
	location.href = url;
});

