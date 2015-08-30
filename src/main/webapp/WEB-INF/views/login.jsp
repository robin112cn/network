<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
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
        <title><spring:message code="login.title"/></title>
    </head>
    <div><a href="${ctx}/setLang?langType=zh">中文</a> &nbsp;|&nbsp; <a href="${ctx}/setLang?langType=en">English</a></div>
    <body class="login">
    	<div class="logo" style="margin-top:100px;">
			<a href="#">
				<img src="${ctxResources}/layout/img/logo.png" alt="logo"/>
			</a>
		</div>
		<div class="content" style="margin-top:30px;">
						${errorMsg }
			<div class="tabbable-custom nav-justified">
				<ul class="nav nav-tabs nav-justified">
					<li class="active">
						<a href="#tab_1" id="li_a_1" data-toggle="tab">
						本所人员  </a>
					</li>
					<li>
						<a href="#tab_2" id="li_a_2" data-toggle="tab">
						来访人员 </a>
					</li>
					<li>
						<a href="#tab_3" id="li_a_3" data-toggle="tab">
						与会人员 </a>
					</li>
				</ul>
				<div class="tab-pane active" id="tab_1" style="display: block;">
					<form class="login-form" id="loginForm1" action="${ctx}/login" method="post" style="margin-top:30px;">
						<input id="usertype" name="usertype" type="hidden" value="1"/>
						<div class="alert alert-danger display-hide">
							<button class="close" data-close="alert"></button>
							<span>
								请输入用户邮箱和密码.
							</span>
						</div>
						<div class="form-group">
							<div class="input-icon right">
								<i class="fa fa-user"></i>
								<input class="form-control" type="text" autocomplete="off" placeholder="用户邮箱" id="username" name="username"/>
							</div>
						<!--
							<div class="row">
								<div class="col-md-3">
									<label class="control-label visible-ie8 visible-ie9" style="color:#666666;text-align:right">用户名</label>
								</div>
								<div class="col-md-9">
		
								</div>
							</div>
							ie8, ie9 does not support html5 placeholder, so we just show field title for that-->
		
		
						</div>
						<div class="form-group">
							<!--<label class="control-label visible-ie8 visible-ie9" style="color:#666666">密码</label>-->
							<div class="input-icon right">
								<i class="fa fa-lock"></i>
								<input class="form-control" type="password" autocomplete="off" placeholder="密码" id="password" name="password"/>
							</div>
						</div>
		
						<div class="form-actions">
							<button class="btn btn-primary btn-block uppercase" type="submit"><spring:message code="login.title" /><i class="m-icon-swapright m-icon-white"></i></button>
						</div>
						<div class="create-account">
							<p style="color: black;">
								<!--  Don't have an account yet ?&nbsp;  -->
								还没有创建账号？<a href="javascript:;" id="register-btn">
								<!-- Create an account --> 创建账号</a>
							</p>
						</div>
					</form>
				</div>
				<div class="tab-pane" id="tab_2" style="display: none;">
					<form class="login-form" id="loginForm2" action="${ctx}/login" method="post" style="margin-top:30px;">
						<input id="usertype" name="usertype" type="hidden" value="2"/>
						<div class="alert alert-danger display-hide">
							<button class="close" data-close="alert"></button>
							<span>
								请输入用户名和密码.
							</span>
						</div>
						<div class="form-group">
							<div class="input-icon right">
								<i class="fa fa-user"></i>
								<input class="form-control" type="text" autocomplete="off" placeholder="用户名" id="username" name="username"/>
							</div>
						<!--
							<div class="row">
								<div class="col-md-3">
									<label class="control-label visible-ie8 visible-ie9" style="color:#666666;text-align:right">用户名</label>
								</div>
								<div class="col-md-9">
		
								</div>
							</div>
							ie8, ie9 does not support html5 placeholder, so we just show field title for that-->
		
		
						</div>
						<div class="form-group">
							<!--<label class="control-label visible-ie8 visible-ie9" style="color:#666666">密码</label>-->
							<div class="input-icon right">
								<i class="fa fa-lock"></i>
								<input class="form-control" type="password" autocomplete="off" placeholder="密码" id="password" name="password"/>
							</div>
						</div>
		
						<div class="form-actions">
							<button class="btn btn-primary btn-block uppercase" type="submit"><spring:message code="login.title" /><i class="m-icon-swapright m-icon-white"></i></button>
						</div>
						<div class="create-account">
							<p style="color: black;">
								<!--  Don't have an account yet ?&nbsp;  -->
								还没有创建账号？<a href="javascript:;" id="register-btn">
								<!-- Create an account --> 创建账号</a>
							</p>
						</div>
					</form>
				</div>
				<div class="tab-pane" id="tab_3" style="display: none;">
					<form class="login-form" id="loginForm3" action="${ctx}/attendMeeting" method="post" style="margin-top:30px;">
						<input id="usertype" name="usertype" type="hidden" value="3"/>
						<div class="alert alert-danger display-hide">
							<button class="close" data-close="alert"></button>
							<span>
								请输入用户名和会议密码.
							</span>
						</div>
						<div class="form-group">
							<div class="input-icon right">
								<i class="fa fa-user"></i>
								<input class="form-control" type="text" autocomplete="off" placeholder="用户名" id="username" name="username"/>
							</div>
						<!--
							<div class="row">
								<div class="col-md-3">
									<label class="control-label visible-ie8 visible-ie9" style="color:#666666;text-align:right">用户名</label>
								</div>
								<div class="col-md-9">
		
								</div>
							</div>
							ie8, ie9 does not support html5 placeholder, so we just show field title for that-->
		
		
						</div>
						<div class="form-group">
							<!--<label class="control-label visible-ie8 visible-ie9" style="color:#666666">密码</label>-->
							<div class="input-icon right">
								<i class="fa fa-lock"></i>
								<input class="form-control" type="password" autocomplete="off" placeholder="会议代码" id="password" name="password"/>
							</div>
						</div>
		
						<div class="form-actions">
							<button class="btn btn-primary btn-block uppercase" type="submit"><spring:message code="login.meeting" /><i class="m-icon-swapright m-icon-white"></i></button>
						</div>
					</form>
				</div>
			</div>
			<!-- BEGIN REGISTRATION FORM -->
			<form class="register-form" action="#" method="post">
				<h3><!-- Sign Up -->创建账户</h3>
				<!-- <p>
					请输入个人信息：
					 Enter your personal details below:
				</p> -->
				<div class="form-group">
					<label class="control-label visible-ie8 visible-ie9">用户名</label>
					<div class="input-icon">
						<i class="fa fa-font"></i>
						<input class="form-control placeholder-no-fix" type="text" placeholder="用户名" name="username"/>
					</div>
				</div>
				<div class="form-group">
					<!--ie8, ie9 does not support html5 placeholder, so we just show field title for that-->
					<label class="control-label visible-ie8 visible-ie9">邮箱</label>
					<div class="input-icon">
						<i class="fa fa-envelope"></i>
						<input class="form-control placeholder-no-fix" type="text" placeholder="邮箱" name="email"/>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label visible-ie8 visible-ie9">密码</label>
					<div class="input-icon">
						<i class="fa fa-lock"></i>
						<input class="form-control placeholder-no-fix" type="password" autocomplete="off" id="register_password" placeholder="密码" name="password"/>
					</div>
				</div>
				<div class="form-group">
					<label class="control-label visible-ie8 visible-ie9">再次输入密码</label>
					<div class="controls">
						<div class="input-icon">
							<i class="fa fa-check"></i>
							<input class="form-control placeholder-no-fix" type="password" autocomplete="off" placeholder="再次输入密码" name="rpassword"/>
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="input-icon">
						<i class="fa fa-user"></i>
						<select id="select2_sample4" class="form-control placeholder-no-fix" placeholder="选择用户类型">
							<option value="1">本所人员</option>
							<option value="2">来访人员</option>
						</select>
					</div>
				</div>
				<div class="form-actions">
					<button id="register-back-btn" type="button" class="btn">
					<i class="m-icon-swapleft"></i> <!-- Back -->返回 </button>
					<button type="submit" id="register-submit-btn" class="btn blue pull-right">
					<!-- Sign Up -->注册 <i class="m-icon-swapright m-icon-white"></i>
					</button>
				</div>
			</form>
			<!-- END REGISTRATION FORM -->
		</div>

		<jsp:include page="/WEB-INF/views/include/core-plugins.jsp"></jsp:include>
    	<jsp:include page="/WEB-INF/views/include/common-js.jsp"></jsp:include>
    	<!-- page plugins begin-->
    	<script src="${ctxResources}/global/plugins/jquery-validation/js/jquery.validate.min.js"  type="text/javascript"></script>
    	<script src="${ctxResources}/global/plugins/backstretch/jquery.backstretch.min.js" type="text/javascript"></script>
    	<script src="${ctxResources}/global/plugins/select2/select2.min.js" type="text/javascript"></script>
    	<script src="${ctxResources}/global/scripts/md5.js"  type="text/javascript"></script>
    	<!-- page plugins end-->
    	<script src="${ctxResources}/pages/scripts/login-soft.js" type="text/javascript"></script>

    	<script type="text/javascript">
	    	jQuery(document).ready(function() {
	    		var ap = '${ctxResources}/';
	    		Metronic.setAssetsPath(ap);
			  	Metronic.init(); // init metronic core components
				Layout.init(); // init current layout
			  	Login.init();
			  	LayoutControl.init();
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
