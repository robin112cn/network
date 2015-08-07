<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="page-header navbar navbar-fixed-top">
	<!-- BEGIN HEADER INNER -->
	<div class="page-header-inner">
		<!-- BEGIN LOGO -->
		<div class="page-logo">
			<a href="#">
				<!-- <img src="${ctxResources}/layout/img/header-logo.png" alt="logo" class="logo-default"/> -->
			</a>
			<div class="menu-toggler sidebar-toggler hide">
				<!-- DOC: Remove the above "hide" to enable the sidebar toggler button on header -->
			</div>
		</div>
		<!-- END LOGO -->
		<!-- BEGIN RESPONSIVE MENU TOGGLER -->
		<a href="javascript:;" class="menu-toggler responsive-toggler" data-toggle="collapse" data-target=".navbar-collapse">
		</a>
		<!-- END RESPONSIVE MENU TOGGLER -->
		<!-- BEGIN TOP NAVIGATION MENU -->
		<div class="top-menu">
			<ul class="nav navbar-nav pull-right">
				<!-- BEGIN NOTIFICATION DROPDOWN -->
				<!-- DOC: Apply "dropdown-dark" class after below "dropdown-extended" to change the dropdown styte -->
				<!-- <li class="dropdown dropdown-extended dropdown-notification" id="header_notification_bar">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
					<i class="icon-bell"></i>
					<span class="badge badge-default">
					7 </span>
					</a>
					<ul class="dropdown-menu">
						<li class="external">
							<h3><span class="bold">你有12个新</span> 通知</h3>
							<a href="extra_profile.html">更多</a>
						</li>
						<li>
							<ul class="dropdown-menu-list scroller" style="height: 250px;" data-handle-color="#637283">
								<li>
									<a href="javascript:;">
									<span class="time">刚刚</span>
									<span class="details">
									<span class="label label-sm label-icon label-success">
									<i class="fa fa-plus"></i>
									</span>
									新用户注册. </span>
									</a>
								</li>
								<li>
									<a href="javascript:;">
									<span class="time">3 mins</span>
									<span class="details">
									<span class="label label-sm label-icon label-danger">
									<i class="fa fa-bolt"></i>
									</span>
									服务器 #12 重启. </span>
									</a>
								</li>
								<li>
									<a href="javascript:;">
									<span class="time">10 mins</span>
									<span class="details">
									<span class="label label-sm label-icon label-warning">
									<i class="fa fa-bell-o"></i>
									</span>
									服务器 #11 没有响应. </span>
									</a>
								</li>
								<li>
									<a href="javascript:;">
									<span class="time">14 hrs</span>
									<span class="details">
									<span class="label label-sm label-icon label-info">
									<i class="fa fa-bullhorn"></i>
									</span>
									应用程序错误. </span>
									</a>
								</li>
								<li>
									<a href="javascript:;">
									<span class="time">2 days</span>
									<span class="details">
									<span class="label label-sm label-icon label-danger">
									<i class="fa fa-bolt"></i>
									</span>
									数据库重启中 68%. </span>
									</a>
								</li>
								<li>
									<a href="javascript:;">
									<span class="time">3 days</span>
									<span class="details">
									<span class="label label-sm label-icon label-danger">
									<i class="fa fa-bolt"></i>
									</span>
									一个用户 的 ip 地址 被阻止. </span>
									</a>
								</li>
								<li>
									<a href="javascript:;">
									<span class="time">4 days</span>
									<span class="details">
									<span class="label label-sm label-icon label-warning">
									<i class="fa fa-bell-o"></i>
									</span>
									存储服务器 #4 not responding dfdfdfd. </span>
									</a>
								</li>
								<li>
									<a href="javascript:;">
									<span class="time">5 days</span>
									<span class="details">
									<span class="label label-sm label-icon label-info">
									<i class="fa fa-bullhorn"></i>
									</span>
									系统错误. </span>
									</a>
								</li>
								<li>
									<a href="javascript:;">
									<span class="time">9 days</span>
									<span class="details">
									<span class="label label-sm label-icon label-danger">
									<i class="fa fa-bolt"></i>
									</span>
									存储服务器启动失败. </span>
									</a>
								</li>
							</ul>
						</li>
					</ul>
				</li> -->
				<!-- END NOTIFICATION DROPDOWN -->
				<!-- BEGIN INBOX DROPDOWN -->
				<!-- DOC: Apply "dropdown-dark" class after below "dropdown-extended" to change the dropdown styte -->

				<!-- END INBOX DROPDOWN -->
				<!-- BEGIN TODO DROPDOWN -->
				<!-- <li class="dropdown dropdown-extended dropdown-tasks" id="header_task_bar">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
					<i class="icon-calendar"></i>
					<span class="badge badge-default">
					3 </span>
					</a>
					<ul class="dropdown-menu extended tasks">
						<li class="external">
							<h3>你有 <span class="bold">12   项待解决的.</span> 任务</h3>
							<a href="page_todo.html">更多</a>
						</li>
						<li>
							<ul class="dropdown-menu-list scroller" style="height: 275px;" data-handle-color="#637283">
								<li>
									<a href="#">
										<span class="task">
											<span class="desc">
												 New release v1.2
											</span>
											<span class="percent">
												 30%
											</span>
										</span>
										<span class="progress">
											<span style="width: 40%;" class="progress-bar progress-bar-success" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100">
												<span class="sr-only">
													 40% Complete
												</span>
											</span>
										</span>
									</a>
								</li>
								<li>
									<a href="#">
										<span class="task">
											<span class="desc">
												 Application deployment
											</span>
											<span class="percent">
												 65%
											</span>
										</span>
										<span class="progress progress-striped">
											<span style="width: 65%;" class="progress-bar progress-bar-danger" aria-valuenow="65" aria-valuemin="0" aria-valuemax="100">
												<span class="sr-only">
													 65% Complete
												</span>
											</span>
										</span>
									</a>
								</li>
								<li>
									<a href="#">
										<span class="task">
											<span class="desc">
												 Mobile app release
											</span>
											<span class="percent">
												 98%
											</span>
										</span>
										<span class="progress">
											<span style="width: 98%;" class="progress-bar progress-bar-success" aria-valuenow="98" aria-valuemin="0" aria-valuemax="100">
												<span class="sr-only">
													 98% Complete
												</span>
											</span>
										</span>
									</a>
								</li>
								<li>
									<a href="#">
										<span class="task">
											<span class="desc">
												 Database migration
											</span>
											<span class="percent">
												 10%
											</span>
										</span>
										<span class="progress progress-striped">
											<span style="width: 10%;" class="progress-bar progress-bar-warning" aria-valuenow="10" aria-valuemin="0" aria-valuemax="100">
												<span class="sr-only">
													 10% Complete
												</span>
											</span>
										</span>
									</a>
								</li>
								<li>
									<a href="#">
										<span class="task">
											<span class="desc">
												 Web server upgrade
											</span>
											<span class="percent">
												 58%
											</span>
										</span>
										<span class="progress progress-striped">
											<span style="width: 58%;" class="progress-bar progress-bar-info" aria-valuenow="58" aria-valuemin="0" aria-valuemax="100">
												<span class="sr-only">
													 58% Complete
												</span>
											</span>
										</span>
									</a>
								</li>
								<li>
									<a href="#">
										<span class="task">
											<span class="desc">
												 Mobile development
											</span>
											<span class="percent">
												 85%
											</span>
										</span>
										<span class="progress progress-striped">
											<span style="width: 85%;" class="progress-bar progress-bar-success" aria-valuenow="85" aria-valuemin="0" aria-valuemax="100">
												<span class="sr-only">
													 85% Complete
												</span>
											</span>
										</span>
									</a>
								</li>
								<li>
									<a href="#">
										<span class="task">
											<span class="desc">
												 New UI release
											</span>
											<span class="percent">
												 18%
											</span>
										</span>
										<span class="progress progress-striped">
											<span style="width: 18%;" class="progress-bar progress-bar-important" aria-valuenow="18" aria-valuemin="0" aria-valuemax="100">
												<span class="sr-only">
													 18% Complete
												</span>
											</span>
										</span>
									</a>
								</li>
							</ul>
						</li>
						<li class="external">
							<a href="#">
								 See all tasks <i class="m-icon-swapright"></i>
							</a>
						</li>
					</ul>
				</li>-->
				<!-- END TODO DROPDOWN -->
				<!-- BEGIN USER LOGIN DROPDOWN -->
				<!-- DOC: Apply "dropdown-dark" class after below "dropdown-extended" to change the dropdown styte -->
				<li class="dropdown dropdown-user">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-close-others="true">
    						<shiro:authenticated>
    							<shiro:principal/>
							</shiro:authenticated>
						<!-- <i class="fa fa-angle-down"></i> -->
					</a>
					<!-- <ul class="dropdown-menu dropdown-menu-default">
						<li> -->
							<!--<a href="extra_profile.html">
								<i class="icon-user"></i> 个人信息
							</a>
						</li>-->
						<!--<li>
							<a href="page_calendar.html" tppabs="http://www.keenthemes.com/preview/metronic_admin/page_calendar.html">
								<i class="fa fa-calendar"></i> My Calendar
							</a>
						</li>
						<li>
							<a href="inbox.html" tppabs="http://www.keenthemes.com/preview/metronic_admin/inbox.html">
								<i class="fa fa-envelope"></i> My Inbox
								<span class="badge badge-danger">
									 3
								</span>
							</a>
						</li>
						<li>
							<a href="#">
								<i class="fa fa-tasks"></i> My Tasks
								<span class="badge badge-success">
									 7
								</span>
							</a>
						</li>-->
						<!-- <li class="divider">
						</li> -->
						<!--<li>
							<a href="extra_lock.html">
								<i class="fa fa-lock"></i> 锁屏
							</a>
						</li>-->
						<!-- <li>
							<a href="javascript:void(0);"  onclick="quitSys();">
								<i class="glyphicon glyphicon-log-in"></i> 登出
							</a>
						</li>
					</ul> -->
				</li>
				<li>
					<span class="separater"></span>
		        </li>
				<li>
					<a class="logout" href="javascript:void(0);" onclick="quitSys();">
			            <i class="glyphicon glyphicon-log-in"></i>
			        </a>
		        </li>
				<!-- END USER LOGIN DROPDOWN -->
				<!-- BEGIN QUICK SIDEBAR TOGGLER -->
				<!-- DOC: Apply "dropdown-dark" class after below "dropdown-extended" to change the dropdown styte -->
				<!-- END QUICK SIDEBAR TOGGLER -->
			</ul>
		</div>
		<!-- END TOP NAVIGATION MENU -->
	</div>
	<!-- END HEADER INNER -->
</div>