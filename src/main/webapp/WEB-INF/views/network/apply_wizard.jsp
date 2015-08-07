<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]> <html lang="en" class="no-js"> <![endif]-->
    <!-- BEGIN HEAD -->
    <head>
    	<jsp:include page="/WEB-INF/views/include/meta.jsp" />
    	<jsp:include page="/WEB-INF/views/include/taglib.jsp" />
    	<jsp:include page="/WEB-INF/views/include/common-css.jsp" />
    	<jsp:include page="/WEB-INF/views/include/theme-style.jsp" />
		<!-- BEGIN PAGE LEVEL STYLES -->
		<link href="${ctxResources}/global/plugins/select2/select2.css" rel="stylesheet" type="text/css"/>
		<link href="${ctxResources}/pages/css/login-soft.css" rel="stylesheet" type="text/css"/>
		<!-- END PAGE LEVEL STYLES -->
        <title>申请</title>
    </head>
    <body>
    	<div class="content" style="margin-top:30px;">
    		<!-- BEGIN PAGE CONTENT-->
			<div class="row">
				<div class="col-md-1"></div>
				<div class="col-md-10">
					<div class="portlet box blue" id="form_wizard_1">
						<div class="portlet-title">
							<div class="caption">
								<i class="fa fa-gift"></i> 高能所网络申请单 - <span class="step-title">
								Step 1 of 4 </span>
							</div>
							<!-- <div class="tools hidden-xs">
								<a href="javascript:;" class="collapse">
								</a>
								<a href="#portlet-config" data-toggle="modal" class="config">
								</a>
								<a href="javascript:;" class="reload">
								</a>
								<a href="javascript:;" class="remove">
								</a>
							</div> -->
						</div>
						<div class="portlet-body form">
							<form action="#" class="form-horizontal" id="submit_form" method="POST">
								<div class="form-wizard">
									<div class="form-body">
										<ul class="nav nav-pills nav-justified steps">
											<li>
												<a href="#tab1" data-toggle="tab" class="step">
												<span class="number">
												1 </span>
												<span class="desc">
												<i class="fa fa-check"></i> 选择用户类型 </span>
												</a>
											</li>
											<li>
												<a href="#tab2" data-toggle="tab" class="step">
												<span class="number">
												2 </span>
												<span class="desc">
												<i class="fa fa-check"></i> 用户验证 </span>
												</a>
											</li>
											<li>
												<a href="#tab3" data-toggle="tab" class="step active">
												<span class="number">
												3 </span>
												<span class="desc" id="tabdesc">
												<i class="fa fa-check"></i> 添加设备 </span>
												</a>
											</li>
											<li>
												<a href="#tab4" data-toggle="tab" class="step">
												<span class="number">
												4 </span>
												<span class="desc">
												<i class="fa fa-check"></i> 完成申请 </span>
												</a>
											</li>
										</ul>
										<div id="bar" class="progress progress-striped" role="progressbar">
											<div class="progress-bar progress-bar-success">
											</div>
										</div>
										<div class="tab-content">
											<div class="alert alert-danger display-none">
												<button class="close" data-dismiss="alert"></button>
												您填写的表单项有误. 请检查.
											</div>
											<div class="alert alert-success display-none">
												<button class="close" data-dismiss="alert"></button>
												您的申请已提交，请耐心等待审核!
											</div>
											<div class="tab-pane active" id="tab1">
												<h3 class="block">选择用户类型</h3>
												<div class="form-group">
													<label class="control-label col-md-4"></label>
													<div class="col-md-4 block"><a href="#" style="font-size: 18px;">如果有统一认证账号，请点击此链接</a></div>
												</div>
												<div class="form-group">
													<label class="control-label col-md-4"></label>
													<div class="col-md-4 radio-list">
														<label>
														<input type="radio" name="optionsRadios" id="optionsRadios1" value="1" checked> 本所职工与本所学生</label>
														<label>
														<input type="radio" name="optionsRadios" id="optionsRadios2" value="2"> 来访、客座、外聘、联合培养学生 </label>
														<label>
														<input type="radio" name="optionsRadios" id="optionsRadios3" value="3"> 有会议代码 </label>
													</div>
												</div>
											</div>
											<div class="tab-pane" id="tab2">
												<h3 class="block">用户认证</h3>
												
												<div id="user">
													<div class="form-group">
														<label class="control-label col-md-4"></label>
														<div class="col-md-4">
															<label>
															<input type="radio" name="checkAccount" id="checkAccount1" value="1" checked> 已有账号 </label>
															<label>
															<input type="radio" name="checkAccount" id="checkAccount2" value="2"> 注册账号 </label>
															
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3">用户名
														</label>
														<div class="col-md-4">
															<input type="text" class="form-control" name="username"/>
															
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3">密码 
														</label>
														<div class="col-md-4">
															<input type="text" class="form-control" name="password"/>
														</div>
													</div>
													<div id="reg" style="display:none;">
														<div class="form-group">
															<label class="control-label col-md-3">重复密码 
															</label>
															<div class="col-md-4">
																<input type="text" class="form-control" name="rpassword"/>
															</div>
														</div>
														<div class="form-group">
															<div class="col-md-offset-3 col-md-9">
																<button class="btn green" type="submit">注册账号</button>
															</div>
														</div>
													</div>
												</div>
												<div id="meeting">
													<div class="form-group">
														<label class="control-label col-md-3">用户名
														</label>
														<div class="col-md-4">
															<input type="text" class="form-control" name="username"/>
															
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3">会议编号
														</label>
														<div class="col-md-4">
															<input type="text" class="form-control" name="password"/>
														</div>
													</div>
												</div>
											</div>
											<div class="tab-pane" id="tab3">
												<div id="dvc">
												<h3 class="block">设备信息</h3>
												
												<div class="form-group">
												<div class="col-md-offset-1 col-md-10">
													<div class="table-scrollable">
														<table class="table table-hover">
														<thead>
														<tr>
															<th> # </th>
															<th> 设备名称 </th>
															<th> ip </th>
															<th> mac </th>
															<th> 网卡类型 </th>
															<th> 状态 </th>
														</tr>
														</thead>
														<tbody>
														<tr>
															<td>
															<label>
																 <input type="radio" name="selectDevice" value="1"></label>
															</td>
															<td>
																 笔记本
															</td>
															<td>
																 10.10.14.123
															</td>
															<td>
																 78:CC:45:56:67:98
															</td>
															<td>
																 有线
															</td>
															<td>
																<span class="label label-sm label-success">
																在线 </span>
															</td>
														</tr>
														<tr>
															<td>
															<label>
																 <input type="radio" name="selectDevice" value="2"></label>
															</td>
															<td>
																 手机
															</td>
															<td>
																 192.168.33.145
															</td>
															<td>
																 78:CC:45:56:67:98
															</td>
															<td>
																 无线
															</td>
															<td>
																<span class="label label-sm label-danger">
																离线 </span>
															</td>
														</tr>
														</tbody>
														</table>
													</div>
												</div>
												</div>
												<div class="form-group">
													<div class="col-md-offset-3 col-md-9">
														<a id="addDevice" class="btn green" type="button">添加设备</a>
													</div>
												</div>
												<div id="addDevForm" style="display: none;">
													<div class="form-group">
														<label class="control-label col-md-3">设备名称 <span class="required">
														* </span>
														</label>
														<div class="col-md-4">
															<input type="text" class="form-control" name="devicename"/>
															<span class="help-block">
															</span>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3">网卡类型 <span class="required">
														* </span>
														</label>
														<div class="col-md-4">
															<label>
																<input type="radio" name="cardtype" id="cardtype1" value="1" checked> 无线网卡 </label>
																<label>
																<input type="radio" name="cardtype" id="cardtype2" value="2"> 有线网卡 </label>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3">MAC <span class="required">
														* </span>
														</label>
														<div class="col-md-4">
															<input type="text" placeholder="" class="form-control" name="mac"/>
															<span class="help-block">
															</span>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3">设备用途 <span class="required">
														* </span>
														</label>
														<div class="col-md-4">
															<input type="text"  class="form-control" name="deviceuse"/>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3">操作系统 <span class="required">
														* </span>
														</label>
														<div class="col-md-4">
															<input type="text"  class="form-control" name="deviceuse"/>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3">导师或课题组长邮箱： <span class="required">
														* </span>
														</label>
														<div class="col-md-4">
															<input type="text"  class="form-control" name="dsemail"/>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3">截止日期 <span class="required">
														* </span>
														</label>
														<div class="col-md-4">
															<input type="text" placeholder="YYYY/MM/DD"  class="form-control" name="jzrq"/>
															<span class="help-block">
															e.g 2020/12/01 </span>
														</div>
													</div>
													<div class="form-group">
													<div class="col-md-offset-3 col-md-9">
														<a id="addDeviceConfirm" class="btn green" type="button">提交</a>
														<a id="addDeviceReset" class="btn green" type="button">重置</a>
													</div>
												</div>
												</div>
												</div>
												<div id="tab3meet">
													<h3 id="tab3h3" class="block">会议信息</h3>
													<div class="form-group">
														<label class="control-label col-md-3">会议名称:</label>
														<div class="col-md-4">
															<p class="form-control-static" data-display="username">
																XXXX会议
															</p>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3">会议地点:</label>
														<div class="col-md-4">
															<p class="form-control-static" data-display="username">
																XXXX大会堂
															</p>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3">会议时间:</label>
														<div class="col-md-4">
															<p class="form-control-static" data-display="username">
																2015年10月29日
															</p>
														</div>
													</div>
												</div>
											</div>
											<div class="tab-pane" id="tab4">
												<h3 class="block">信息确认</h3>
												<h4 class="form-section">用户信息</h4>
												<div class="form-group">
													<label class="control-label col-md-3">用户名:</label>
													<div class="col-md-4">
														<p class="form-control-static" data-display="username">
															abcd
														</p>
													</div>
												</div>
												<!-- <div class="form-group">
													<label class="control-label col-md-3">邮箱:</label>
													<div class="col-md-4">
														<p class="form-control-static" data-display="email">
														</p>
													</div>
												</div> -->
												<div id="tab4meet">
													<h3 id="tab3h3" class="block">会议信息</h3>
													<div class="form-group">
														<label class="control-label col-md-3">会议名称:</label>
														<div class="col-md-4">
															<p class="form-control-static" data-display="username">
																XXXX会议
															</p>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3">会议地点:</label>
														<div class="col-md-4">
															<p class="form-control-static" data-display="username">
																XXXX大会堂
															</p>
														</div>
													</div>
													<div class="form-group">
														<label class="control-label col-md-3">会议时间:</label>
														<div class="col-md-4">
															<p class="form-control-static" data-display="username">
																2015年10月29日
															</p>
														</div>
													</div>
												</div>
												<div id="tab4dev">
												<h4 class="form-section">设备信息</h4>
												<div class="form-group">
													<label class="control-label col-md-3">设备名称:</label>
													<div class="col-md-4">
														<p class="form-control-static" data-display="devicename">
														  手机
														</p>
													</div>
												</div>
												<div class="form-group">
													<label class="control-label col-md-3">网卡类型:</label>
													<div class="col-md-4">
														<p class="form-control-static" data-display="gender">
														 无线网卡
														</p>
													</div>
												</div>
												<div class="form-group">
													<label class="control-label col-md-3">Mac:</label>
													<div class="col-md-4">
														<p class="form-control-static" data-display="address">
															78:CC:45:56:67:98 
														</p>
													</div>
												</div>
												<div class="form-group">
													<label class="control-label col-md-3">设备用途:</label>
													<div class="col-md-4">
														<p class="form-control-static" data-display="city">
															学习
														</p>
													</div>
												</div>
												<div class="form-group">
													<label class="control-label col-md-3">操作系统:</label>
													<div class="col-md-4">
														<p class="form-control-static" data-display="country">
															WIN7
														</p>
													</div>
												</div>
												<div class="form-group">
													<label class="control-label col-md-3">导师/组长邮箱:</label>
													<div class="col-md-4">
														<p class="form-control-static" data-display="remarks">
															dstest@gmail.com
														</p>
													</div>
												</div>
												<div class="form-group">
													<label class="control-label col-md-3">截止日期:</label>
													<div class="col-md-4">
														<p class="form-control-static" data-display="remarks">
															2015/12/01
														</p>
													</div>
												</div>
												</div>
											</div>
										</div>
									</div>
									<div class="form-actions">
										<div class="row">
											<div class="col-md-offset-3 col-md-9">
												<a href="javascript:;" class="btn default button-previous">
												<i class="m-icon-swapleft"></i> 后退 </a>
												<a href="javascript:;" class="btn blue button-next">
												继续 <i class="m-icon-swapright m-icon-white"></i>
												</a>
												<a href="javascript:;" class="btn green button-submit">
												提交 <i class="m-icon-swapright m-icon-white"></i>
												</a>
											</div>
										</div>
									</div>
								</div>
							</form>
						</div>
					</div>
				</div>
				<div class="col-md-1"></div>
			</div>
			<!-- END PAGE CONTENT-->
		</div>
		
		<jsp:include page="/WEB-INF/views/include/core-plugins.jsp"></jsp:include>
    	<jsp:include page="/WEB-INF/views/include/common-js.jsp"></jsp:include>
    	<!-- page plugins begin-->
    	<script src="${ctxResources}/global/plugins/jquery-validation/js/jquery.validate.min.js"  type="text/javascript"></script>
    	<script src="${ctxResources}/global/plugins/backstretch/jquery.backstretch.min.js" type="text/javascript"></script>
    	<script src="${ctxResources}/global/plugins/select2/select2.min.js" type="text/javascript"></script>
    	<script src="${ctxResources}/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js" type="text/javascript"></script>
		<script type="text/javascript" src="${ctxResources}/global/plugins/jquery-validation/js/additional-methods.min.js"></script>
		<script type="text/javascript" src="${ctxResources}/global/plugins/bootstrap-wizard/jquery.bootstrap.wizard.min.js"></script>
    	
    	<!-- page plugins end-->
    	<script src="${ctxResources}/pages/scripts/form-wizard.js"></script>

    	<script type="text/javascript">
	    	jQuery(document).ready(function() {
	    		var ap = '${ctxResources}/';
	    		Metronic.setAssetsPath(ap);
			  	Metronic.init(); // init metronic core components
				Layout.init(); // init current layout
			  	//Login.init();
			  	LayoutControl.init();
			  	FormWizard.init();
			    // init background slide images
			    $.backstretch([
			       // "${ctxResources}/pages/media/bg/1.jpg",
			       // "${ctxResources}/pages/media/bg/2.jpg",
			       // "${ctxResources}/pages/media/bg/3.jpg",
			       "${ctxResources}/pages/media/bg/login-sft-bg.png"
			        ], {
			          fade: 1000,
			          duration: 8000
			    }
			    );
			});
    	</script>
    </body>
</html>
