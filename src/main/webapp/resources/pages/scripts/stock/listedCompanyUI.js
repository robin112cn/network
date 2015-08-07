/**
 * 上市公司
 */
var listedCompanyForm = function(){
	var validator = function(){
		var targetForm = $('#listedCompanyForm');
		var error2 = $('.alert-danger', targetForm);
		var success2 = $('.alert-success', targetForm);
		targetForm.validate({
			errorElement : 'span', 
			errorClass : 'help-block help-block-error',
			focusInvalid : false,
			ignore : "", 
			rules:{stockCodeA:{required : true,maxlength:6}},
			messages:{stockCodeA:{required:"请输入A股代码",maxlength:$.validator.format('菜单编码不能超过{0}个字符')}},
			invalidHandler : function(event, validator) {
				success2.hide();
				error2.show();
				Metronic.scrollTo(error2, -200);
			},
			errorPlacement :function(error, element) { 
				var icon = Metronic.handValidStyle(element);
				icon.removeClass('fa-check').addClass("fa-warning");
				icon.attr("data-original-title", error.text()).tooltip({'container' : '#listedCompanyForm'});
			},
			highlight : function(element) {
				$(element).closest('.form-group').removeClass("has-success").addClass('has-error'); 
			},
			success : function(label, element) {
				var icon = Metronic.handValidStyle(element);
				$(element).closest('.form-group').removeClass('has-error').addClass('has-success'); 
				icon.removeClass("fa-warning").addClass("fa-check");
			}
		});
	}
	function clearFormStatus(){
		// 清除验证css样式
		$('.form-group').removeClass('has-error').removeClass('has-success');
		$('.form-group i').removeClass().addClass('fa');
	};
	return {
		init:function(){
			validator();
		},
		clearFormStatus:function(){
			clearFormStatus();
		}
	}
}();
var listedCompanyUI = function(){
	var grid = new Datatable();
	var validator = listedCompanyForm.init();
	// 创建列表页面中的表格
	var createTable = function(){
		grid.init({
			src : $("#grid"),
			onSuccess : function(grid){},
			onError : function(grid) {},
			onDataLoad : function(grid){
			},
			loadingMessage : 'Loading...',
			dataTable :{
				"bStateSave" : true,
				"lengthMenu" : [[10, 20, 30], [10, 20, 30]],
				"pageLength" : 10,
				"ajax" : {"url" : ctx + "/stockListedCompany/find"},
				"formSearch":'searchForm',
				"columnDefs" :[
					{'name':'stock_code_a','orderable' : true,'targets' : [0]}
					,{'name':'company_short_name','orderable' : true,'targets' : [1]}
					,{'name':'time_to_market','orderable' : true,'targets' : [2]}
					,{'name':'legal_representative','orderable' : true,'targets' : [3]}
					,{'orderable' : false,'targets' : [4]}
				],
				"columns":[{"title":"A股代码","field":"stockCodeA"}, {"title":"公司简称","field":"companyShortName"}, {"title":"上市时间","field":"timeToMarket"}
					, {"title":"法人代表","field":"legalRepresentative"},{"title":"操作","field":"stockCodeA",fieldRender:"getPremission"}
				],
				"order" : [[1, "asc"]]
			}
		});
	};
	// 查询
	var search = function(){
		$("#search").click(function(e) {
			e.preventDefault();
			grid.getDataTable().ajax.reload();
			grid.clearAjaxParams();
		});
	}
	// 重置
	var reload = function() {
		grid.getDataTable().ajax.reload();
		grid.clearAjaxParams();
	}
	// 激活控件
	var activeBootstrapControls = function(){
		// 提示控件配置
		var toastr_options = {"closeButton" : true,"debug" : false,"positionClass" : "toast-top-center","onclick" : null,
			"showDuration" : "1000","hideDuration" : "1000","timeOut" : "3000","extendedTimeOut" : "1000","showEasing" : "swing",
			"hideEasing" : "linear","showMethod" : "fadeIn","hideMethod" : "fadeOut"
		}
		toastr.options = toastr_options;
		// form校验
		validator = $('#listedCompanyForm').validate();
		// 新增
		$('#create').click(function(){
			validator.resetForm();
			listedCompanyForm.clearFormStatus();
			$('#listedCompanyModal').modal('show');
		});
		
		$('#saveListedCompany').click(function(){
			var listedCompanyForm_options = {
				type:'POST',
				dataType:'json',
				url:ctx + '/stockListedCompany/save',
				beforeSerialize:function(){},
				beforeSubmit:function(){
					return validator.form();
				},
				success:function(data){
					if (data.success){
						$('#listedCompanyModal').modal('hide');
						toastr['success']("保存成功！","系统提示");
						listedCompanyUI.callback();
					} else{
						toastr['error'](data.msg,"系统提示");
					}
				},
				error:function(data){
					toastr['error']("获取用户信息失败,请联系管理员！","系统提示");
				}
			};
			$("#listedCompanyForm").ajaxSubmit(listedCompanyForm_options);
		});
	}
	return {
		init:function(){
			// 激活控件
			activeBootstrapControls();
			// 创建表格
			createTable();
			// 查询
			search();
		},
		callback:function(){
			reload();
		}
	}
}();