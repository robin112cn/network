// form校验
var FormValidation = function() {
	// validation using icons
	var handleValidation2 = function() {
		// for more info visit the official plugin documentation:
		// http://docs.jquery.com/Plugins/Validation
		var form2 = $('#addForm');
		var error2 = $('.alert-danger', form2);
		var success2 = $('.alert-success', form2);

		return form2.validate({
					errorElement : 'span', // default input error message
					// container
					errorClass : 'help-block help-block-error', // default input
					// error message
					// class
					focusInvalid : false, // do not focus the last invalid
					// input
					ignore : "", // validate all fields including form hidden
					// input
					rules : {
						userName : {
							maxlength : 20,
							required : true
						},
						userDepartment : {
							maxlength : 40,
							required : true
						},
						userLeader : {
							maxlength : 40,
							required : true,
							email : true
						},
						userPhone : {
							maxlength : 20,
							required : true
						},
						deviceName : {
							maxlength : 20,
							required : true
						},
						deviceType : {
							maxlength : 20,
							required : true
						},
						deviceOs : {
							maxlength : 20,
							required : true
						}
					},
//					messages : {
//						trVersion : {
//							required : "请输入TR版本",
//							minlength : $.validator.format('TR版本必须为{0}个字符'),
//							maxlength : $.validator.format('TR版本必须为{0}个字符')
//						},
//						trLevel : {
//							required : "请输入TR授信级别",
//							minlength : $.validator.format('TR授信级别必须为{0}个字符'),
//							maxlength : $.validator.format('TR授信级别必须为{0}个字符')
//						},
//						trArea : {
//							required : "请输入TR隶属区域",
//							minlength : $.validator.format('TR隶属区域不能少于{0}个字符'),
//							maxlength : $.validator.format('TR隶属区域不能超过{0}个字符')
//						}
//					},

					invalidHandler : function(event, validator) { // display
						// error
						// alert on
						// form
						// submit
						success2.hide();
						error2.show();
						Metronic.scrollTo(error2, -200);
					},

//					errorPlacement : function(error, element) { // render error
//						// placement for
//						// each input
//						// type
//						var icon = Metronic.handValidStyle(element);
//						icon.removeClass('fa-check').addClass("fa-warning");
//						icon.attr("data-original-title", error.text()).tooltip({
//									'container' : '#deviceForm'
//								});
//					},

					highlight : function(element) { // hightlight error inputs
						$(element).closest('.form-group').removeClass("has-success").addClass('has-error'); // set
						// error
						// class
						// to
						// the control group
					},

					unhighlight : function(element) { // revert the change
						// done by hightlight

					},

					success : function(label, element) {
//						var icon = Metronic.handValidStyle(element);
//						$(element).closest('.form-group').removeClass('has-error').addClass('has-success'); // set
//						// success
//						// class
//						// to the control
//						// group
//						icon.removeClass("fa-warning").addClass("fa-check");
						 label
	                        .closest('.form-group').removeClass('has-error'); // set success class to the control group
					},

					submitHandler : function(form) {
						success2.show();
						error2.hide();
						form[0].submit(); // submit the form
					}
				});
	};

	return {
		// main function to initiate the module
		init : function() {
			return handleValidation2();
		}
	};
}();
// 页面信息
var deviceAddUI = function() {
	var validator = FormValidation.init();
	
	// 重置
	var reload = function() {
		grid.getDataTable().ajax.reload();
		grid.clearAjaxParams();
	};
	// 激活bootstrap控件相关功能
	var activeBootstrapControls = function() {
		// 提示控件配置
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
		};
		
		toastr.options = options;
		
//		// 重置
//		$("#reset").click(function() {
//			$("#trFlagSearch").val("");
//			reload();
//		});
		
		// 返回
		$('#backBtn').click(function() {
			window.location.href=ctx + '/deviceManage/show?menu_id=1192';
		});
		
		// 保存
		$('#saveBtn').click(function() {
			if (!validator.form())
				return false;
			
			$.ajax({
					type : 'POST',
					url : ctx + '/deviceManage/save',
					data : $('#addForm').serialize(),
					dataType : 'json',
					success : function(data) {
						alert(data[0]);
						alert(data[1]);
						if (data[0]>0) {
							toastr['success'](data[1], "系统提示");
							
							setTimeout(function(){window.location.href=ctx + '/deviceManage/show?menu_id=1192';}, 500);
							//trInfoUI.callback();
						} else {
							toastr['error'](data[1], "系统提示");
						}
					},
					error : function(data) {
						toastr['error']("保存失败！", "系统提示");
					}
				});
			});
	};
	return {
		init : function() {
			// 激活bootstrap控件相关功能
			activeBootstrapControls();
			// 创建表格
			//createTable();
			//
			///search();
		},
		callback : function() {
			reload();
		}
	};
}();

var npnum = 1;
function addNetworkAdapter() {
	var html = '';
	html += '<div id="npRow'+npnum+'" class="row">';
	html += '<div class="col-md-6">';
	html += '	<div class="form-group">';
	html += '	<label class="control-label col-md-3">MAC<span class="required">*</span></label>';
	html += '<div class="col-md-7">';
	html += '	<input type="text" name="npMac" id="npMac'+npnum+'" placeholder="MAC" class="form-control">';
	html += '</div>';
	html += '<div class="col-md-2" style="margin-top:3px;">';
	html += ' <span class="input-group-btn" >';
	html += '	<a class="btn blue" href="javascript:void(0);" onclick="deleteNp('+npnum+');">删除</a>';
	html += ' </span>';
	html += '</div>';
	html += '</div>';
	html += '</div>';
	html += '<div class="col-md-6">';
	html += '	<div class="form-group">';
	html += '		<label class="control-label col-md-3">网卡类型</label>';
	html += '		<div class="col-md-9">';
	html += '			<select name="npType" id="npType'+npnum+'" class="form-control">';
	html += '				<option value="无线网卡">无线网卡</option>';
	html += '				<option value="有线网卡">有线网卡</option>';
	html += '			</select>';
	html += '		</div>';
	html += '	</div>';
	html += '	</div>';
	html += '</div>';
	$("#addNp").append(html);
	
	npnum++;
}

function deleteNp(index) {
	$("#npRow"+index).hide();
	$("#npMac"+index+"").val('');
	$("#npType"+index+"").val('');
}