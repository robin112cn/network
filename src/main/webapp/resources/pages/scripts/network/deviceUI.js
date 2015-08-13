/**
 * 设备信息
 */
var trFlag = 'TR_FLAG';
var trFlagArray;
// form校验
var FormValidation = function() {
	// validation using icons
	var handleValidation2 = function() {
		// for more info visit the official plugin documentation:
		// http://docs.jquery.com/Plugins/Validation
		var form2 = $('#deviceForm');
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
//						trVersion : {
//							maxlength : 32,
//							required : true
//						},
//						trLevel : {
//							maxlength : 128,
//							required : true
//						},
//						trArea : {
//							alphaNum : true,
//							maxlength : 32,
//							required : true
//						},
						remark : {
							maxlength : 64,
							required : true
						}
					},
					messages : {
//						trVersion : {
//							required : "请输入TR版本",
//							maxlength : $.validator.format('TR版本不能超过{0}个字符')
//						},
//						trLevel : {
//							required : "请输入TR授信级别",
//							maxlength : $.validator.format('TR授信级别不能超过{0}个字符')
//						},
//						trArea : {
//							required : "请输入TR隶属区域",
//							maxlength : $.validator.format('TR隶属区域不能超过{0}个字符')
//						},
						remark : {
							required : "请输入备注",
							maxlength : $.validator.format('备注不能超过{0}个字符')
						}
					},

					invalidHandler : function(event, validator) { // display
						// error
						// alert on
						// form
						// submit
						success2.hide();
						error2.show();
						Metronic.scrollTo(error2, -200);
					},

					errorPlacement : function(error, element) { // render error
						// placement for
						// each input
						// type
						var icon = Metronic.handValidStyle(element);
						icon.removeClass('fa-check').addClass("fa-warning");
						icon.attr("data-original-title", error.text()).tooltip({
									'container' : '#trInfoForm'
								});
					},

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
						var icon = Metronic.handValidStyle(element);
						$(element).closest('.form-group').removeClass('has-error').addClass('has-success'); // set
						// success
						// class
						// to the control
						// group
						icon.removeClass("fa-warning").addClass("fa-check");
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
var trInfoUI = function() {
	var grid = new Datatable();
	var validator = FormValidation.init();
	trFlagArray = Fields.getFields(trFlag);
	Fields.initSelect(trFlagArray, $('#trFlagSearch'));
	// 创建表格
	var createTable = function() {
		grid.init({
					src : $("#grid"),
					onSuccess : function(grid) {
						// execute some code after table records loaded
					},
					onError : function(grid) {
						// execute some code on network or other general error
					},
					onDataLoad : function(grid) {
						$(".approve").click(function() {
									setFormStatus("approve");
									var pk = $(this).attr("name");
								/*	$.ajax({
												type : 'POST',
												url : ctx + '/trManage/view',
												data : {
													pk : pk
												},
												dataType : 'json',
												success : function(data) {
													$.each(data, function(name, val) {
																$('#trInfoForm').find("[name='" + name + "']").val(val);
															});
													Metronic.handleFixInputPlaceholderForIE();
													$('#view').modal('show');
												},
												error : function(data) {
													toastr['error']("获取TR信息失败,请联系管理员！", "系统提示");
												}
											});*/
								});
					},
					loadingMessage : 'Loading...',
					dataTable : {
						'bStateSave' : true,
						'lengthMenu' : [[10, 20, 30], [10, 20, 30] // change
						// per
						// page
						// values
						// here
						],
						'pageLength' : 10,
						'ajax' : {
							url : ctx + '/applyManage/find'
						},
						'formSearch' : 'searchForm',
						"columnDefs" : [{
									'orderable' : false,
									'width' : "80px",
									'targets' : [0]
								}, {
									'orderable' : false,
									'width' : "110px",
									'targets' : [1]
								}, {
									'orderable' : false,
									'width' : "80px",
									'targets' : [2]
								}, {
									'orderable' : false,
									'width' : "80px",
									'targets' : [3]
								}, {
									'orderable' : false,
									'width' : "60px",
									'targets' : [4]
								}, {
									'orderable' : false,
									'width' : "120px",
									'targets' : [5]
								}, {
									'orderable' : false,
									'width' : "80px",
									'targets' : [6]
								}, {
									'orderable' : false,
									'width' : "120px",
									'targets' : [7]
								}, {
									'orderable' : false,
									
									'targets' : [8]
								}],
						'columns' : [{
									'title' : '用户姓名',
									'field' : 'userName'
								}, {
									'title' : '用户邮箱',
									'field' : 'userEmail'
								}, {
									'title' : '设备名称',
									'field' : 'deviceName'
								}, {
									'title' : '设备用途',
									'field' : 'deviceUse'
								}, {
									'title' : '操作系统',
									'field' : 'operOs'
								}, {
									'title' : 'MAC',
									'field' : 'deviceMac'
								}, {
									'title' : '设备类型',
									'field' : 'deviceType'
								}, {
									'title' : '截止时间',
									'field' : 'untiTime'
								}, {
									'title' : '操作',
									'field' : 'userId',
									'custom': 'trFlag',
									'fieldRender' : "getPremission"
								}],
						'order' : [[4, "desc"]]
					}
				});
	};
	// 查询
	var search = function() {
		$("#search").click(function(e) {
					e.preventDefault();
					grid.getDataTable().ajax.reload();
					grid.clearAjaxParams();
				});
	};
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
		// 重置
		$("#reset").click(function() {
					$("#trIdSearch").val("");
					$("#trFlagSearch").val("");
					reload();
				});
		// 通过
		$('#pass').click(function() {
					if (!validator.form())
						return false;
					$.ajax({
								type : 'POST',
								url : ctx + '/trManage/pass',
								data : $('#trInfoForm').serialize(),
								dataType : 'json',
								success : function(data) {
									if (data.success) {
										$('#view').modal('hide');
										toastr['success'](data.msg, "系统提示");
										trInfoUI.callback();
									} else {
										toastr['error'](data.msg, "系统提示");
									}
								},
								error : function(data) {
									toastr['error'](data.msg, "系统提示");
								}
							});
				});
		// 不通过
		$('#notpass').click(function() {
					if (!validator.form())
						return false;
					$.ajax({
								type : 'POST',
								url : ctx + '/trManage/notpass',
								data : $('#trInfoForm').serialize(),
								dataType : 'json',
								success : function(data) {
									if (data.success) {
										$('#view').modal('hide');
										toastr['success'](data.msg, "系统提示");
										trInfoUI.callback();
									} else {
										toastr['error'](data.msg, "系统提示");
									}
								},
								error : function(data) {
									toastr['error'](data.msg, "系统提示");
								}
							});
				});
	};
	return {
		init : function() {
			// 激活bootstrap控件相关功能
			activeBootstrapControls();
			// 创建表格
			createTable();
			//
			search();
		},
		callback : function() {
			reload();
		}
	};
}();
function setFormStatus(type) {
	// 清除验证css样式
	$('.form-group').removeClass('has-error').removeClass('has-success');
	$('.form-group i').removeClass().addClass('fa');
	if ("approve" == type) {
		$("#tag").val("approve");
		$("#trId").attr("readOnly", true);
		$("#trVersion").attr("readOnly", true);
		$("#trInfoModalLabel").html("审批");
	}
	$("#trInfoForm")[0].reset();
};

function showTrFlag(val) {
	return Fields.showDisplay(trFlagArray, val);
}