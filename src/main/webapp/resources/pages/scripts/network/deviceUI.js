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

					errorPlacement : function(error, element) { // render error
						// placement for
						// each input
						// type
						var icon = Metronic.handValidStyle(element);
						icon.removeClass('fa-check').addClass("fa-warning");
						icon.attr("data-original-title", error.text()).tooltip({
									'container' : '#deviceForm'
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
var deviceUI = function() {
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
						$(".delete").click(function() {
									var pk = $(this).attr("name");
									if (!confirm("您确定要删除此设备信息？")) {
										return false;
									}
									$.ajax({
												type : 'POST',
												url : ctx + '/deviceManage/delete',
												data : {
													deviceId : pk
												},
												dataType : 'json',
												success : function(data) {
													if (data.success){
														toastr['success']("删除成功", "系统提示");
														trInfoUI.callback();
													}else{
														toastr['error'](data.msg, "系统提示");
													}
												},
												error : function(data) {
													toastr['error']("获取设备信息失败,请联系管理员！", "系统提示");
												}
											});
								});
						$(".viewIp").click(function() {
							var pk = $(this).attr("name");
							$.ajax({
								type : 'POST',
								url : ctx + '/deviceManage/viewIp',
								data : {
									deviceId : pk
								},
								dataType : 'json',
								success : function(data) {
									var np1,np2,np3 = false;
									$.each(data, function(name, val) {
										$('#ipViewForm').find("[name='" + name + "View']").val(val);
										if(name == 'np1Type' && val){
											np1 =  true;
										}
										if(name == 'np1Mac' && val){
											np1 =  true ;
										}
										if(name == 'np2Type' && val){
											np2 =  true;
										}
										if(name == 'np2Mac' && val){
											np2 =  true ;
										}
										if(name == 'np3Type' && val){
											np3 =  true;
										}
										if(name == 'np3Mac' && val){
											np3 =  true ;
										}
									});
									if(np1){
										$("#np1View").show();
									}else{
										$("#np1View").hide();
									}
									if(np2){
										$("#np2View").show();
									}else{
										$("#np2View").hide();
									}
									if(np3){
										$("#np3View").show();
									}else{
										$("#np3").hide();
									}
									Metronic.handleFixInputPlaceholderForIE();
									$('#viewIp').modal('show');
								},
								error : function(data) {
									toastr['error']("获取设备信息失败,请联系管理员！", "系统提示");
								}
							});
						});
						$(".update").click(function() {
									setFormStatus("update");
									var pk = $(this).attr("name");
									$.ajax({
												type : 'POST',
												url : ctx + '/deviceManage/view',
												data : {
													deviceId : pk
												},
												dataType : 'json',
												success : function(data) {
													var np1,np2,np3 = false;
													$.each(data, function(name, val) {
														$('#deviceForm').find("[name='" + name + "']").val(val);
														if(name == 'np1Type' && val){
															np1 =  true;
														}
														if(name == 'np1Mac' && val){
															np1 =  true ;
														}
														if(name == 'np2Type' && val){
															np2 =  true;
														}
														if(name == 'np2Mac' && val){
															np2 =  true ;
														}
														if(name == 'np3Type' && val){
															np3 =  true;
														}
														if(name == 'np3Mac' && val){
															np3 =  true ;
														}
													});
													if(np1){
														$("#np1").show();
													}else{
														$("#np1").hide();
													}
													if(np2){
														$("#np2").show();
													}else{
														$("#np2").hide();
													}
													if(np3){
														$("#np3").show();
													}else{
														$("#np3").hide();
													}
													Metronic.handleFixInputPlaceholderForIE();
													$('#view').modal('show');
												},
												error : function(data) {
													toastr['error']("获取设备信息失败,请联系管理员！", "系统提示");
												}
											});
								});
//						$(".regist").click(function() {
//									var pk = $(this).attr("name");
//									if (!confirm("您确定要注册此TR信息？")) {
//										return false;
//									}
//									$.ajax({
//												type : 'POST',
//												url : ctx + '/deviceManage/regist',
//												data : {
//													pk : pk
//												},
//												dataType : 'json',
//												success : function(data) {
//													if (data.success){
//														toastr['success'](data.msg, "系统提示");
//														trInfoUI.callback();
//													}else{
//														toastr['error'](data.msg, "系统提示");
//													}
//												},
//												error : function(data) {
//													toastr['error']("获取TR信息失败,请联系管理员！", "系统提示");
//												}
//											});
//								});
						$(".mailTo").click(function() {
									var pk = $(this).attr("name");
									toastr['success']("邮件已发送，请耐心等待回复", "系统提示");
									deviceUI.callback();
//									$.ajax({
//												type : 'POST',
//												url : ctx + '/deviceManage/viewFlag',
//												data : {
//													deviceId : pk
//												},
//												dataType : 'json',
//												success : function(data) {
//													if (data.success){
//														toastr['success'](data.msg, "系统提示");
//														trInfoUI.callback();
//													}else{
//														toastr['error'](data.msg, "系统提示");
//													}
//												},
//												error : function(data) {
//													toastr['error']("获取设备信息失败,请联系管理员！", "系统提示");
//												}
//											});
								});
//						$(".cancel").click(function() {
//									var pk = $(this).attr("name");
//									if (!confirm("您确定要注销此TR信息？")) {
//										return false;
//									}
//									$.ajax({
//												type : 'POST',
//												url : ctx + '/deviceManage/cancel',
//												data : {
//													pk : pk
//												},
//												dataType : 'json',
//												success : function(data) {
//													if (data.success){
//														toastr['success'](data.msg, "系统提示");
//														trInfoUI.callback();
//													}else{
//														toastr['error'](data.msg, "系统提示");
//													}
//												},
//												error : function(data) {
//													toastr['error']("获取TR信息失败,请联系管理员！", "系统提示");
//												}
//											});
//								});
					},
					loadingMessage : 'Loading...',
					dataTable : {
						'bStateSave' : false,
						'lengthMenu' : [[10, 20, 30], [10, 20, 30] // change
						// per
						// page
						// values
						// here
						],
						'pageLength' : 10,
						'ajax' : {
							url : ctx + '/deviceManage/find'
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
							},{
								'orderable' : false,
								
								'targets' : [4]
							}],
						'columns' : [{
								'title' : '设备名称',
								'field' : 'deviceName'
							}, {
								'title' : '设备类型',
								'field' : 'deviceType'
							}, {
								'title' : '操作系统',
								'field' : 'deviceOs'
							}, {
								'title' : '设备用途',
								'field' : 'devicePurpose'
							}, {
								'title' : '审核状态',
								'field' : 'authStat',
								'fieldRender' : "checkAuthStat"
							}, {
								'title' : 'IP分配状态',
								'field' : 'deviceFlag',
								'fieldRender' : "checkFlagStat"
							},{
								'title' : '操作',
								'field' : 'deviceId',
								'custom': 'deviceFlag',
								'fieldRender' : "getPremission"
							}],
						'order' : [[2, "desc"]]
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
					$("#trFlagSearch").val("");
					reload();
				});
		// 新增
		$('#create').click(function() {
					setFormStatus("add");
					Metronic.handleFixInputPlaceholderForIE();
					$('#view').modal('show');
				});
		// 保存
		$('#addDevice').click(function() {
			if (!validator.form())
				return false;
			$.ajax({
					type : 'POST',
					url : ctx + '/deviceManage/save',
					data : $('#deviceForm').serialize(),
					dataType : 'json',
					success : function(data) {
						if (data.flag>0) {
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
	if ("update" == type) {
		$("#tag").val("update");
		$("#trInfoModalLabel").html("编辑TR信息");
	} else if ("add" == type) {
		$("#tag").val("add");
		$("#trInfoModalLabel").html("新建TR信息");
	}
	$("#deviceForm")[0].reset();
};

function showTrFlag(val) {
	return Fields.showDisplay(trFlagArray, val);
}

var npnum = 1;
function addNetworkAdapter() {
	$("#np"+npnum).show();
	if(npnum>3){
		if($("#np1").is(":hidden")){
			$("#np1").show();
			return;
		}
		if($("#np2").is(":hidden")){
			$("#np2").show();
			return;
		}
		if($("#np3").is(":hidden")){
			$("#np3").show();
			return;
		}
		alert("一个设备最多创建3块网卡");
		return;
	}
	npnum++;
}

function deleteNp(index) {
	$("#np"+index).hide();
	$("#np"+index+"TypeAdd").val('');
	$("#np"+index+"Mac").val('');
}

function checkAuthStat(data){
	if(data=="1"){
		return "已审核";
	}else{
		return "未审核";
	}
}

function checkFlagStat(data){
	if(data=="1"){
		return "已分配";
	}else{
		return "未分配";
	}
}