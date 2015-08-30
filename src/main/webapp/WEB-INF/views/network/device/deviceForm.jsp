<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="page-bar">
	<ul class="page-breadcrumb">
		<li><i class="fa fa-home"></i> 网络接入管理 <i class="fa fa-angle-right"></i></li>
		<li>设备管理 <i class="fa fa-angle-right"></i></li>
		<li>添加设备</li>
	</ul>
</div>
<div class="portlet box green-haze">
	<!-- 标题 开始-->
	<!-- <div class="portlet-title">
		<div class="caption">
			<i class="fa fa-globe"></i>TR信息审批
		</div>
	</div> -->
	<!-- 标题 结束-->
	<!-- 查询条件开始 -->
	<div class="portlet-body">
		<div class="row">
			<div class="col-md-12">
				<div class="portlet light">
					<div class="caption">
						<i class="glyphicon glyphicon-globe"></i>
						<span class="caption-subject">新增设备</span>
						<!-- <span class="caption-helper">some info...</span> -->
					</div>
					<div class="portlet-body form">
						<!-- BEGIN FORM-->
						<div class="form-body clearfix">
							<form id="addForm" action="" class="form-horizontal">
								<input type="hidden" class="form-control" name="tag" value="add">
								<div class="form-body">
									<div class="alert alert-danger display-hide" style="margin:0 20px 0 20px;height:20px;">
										<button class="close" data-close="alert"></button>
									    	 表单数据有误，请检查输入内容。
										<!-- You have some form errors. Please check below. -->
									</div>
									<!-- <div class="alert alert-success display-hide">
										<button class="close" data-close="alert"></button>
										表单验证成功！
										Your form validation is successful!
									</div> -->
									<h3 class="form-section"><!-- Person Info -->&nbsp;&nbsp;&nbsp;&nbsp;个人信息</h3>
									<div class="row">
										<div class="col-md-6">
											<div class="form-group">
												<label class="control-label col-md-3">姓名<span class="required">*</span></label>
												<div class="col-md-9">
													<input type="text" class="form-control" name="userName" id="userName" placeholder="姓名">
													<!-- <span class="help-block">
													This is inline help </span> -->
												</div>
											</div>
										</div>
										<!--/span-->
										<div class="col-md-6">
											<div class="form-group">
												<label class="control-label col-md-3">电话<span class="required">*</span></label>
												<div class="col-md-9">
													<input type="text" class="form-control" name="userPhone" id="userPhone"  placeholder="电话">
													<!-- <span class="help-block">
													This is inline help </span> -->
												</div>
											</div>
										</div>
										<!--/span-->
									</div>
									<!--/row-->
									<div class="row">
										<div class="col-md-6">
											<div class="form-group">
												<label class="control-label col-md-3">部门<span class="required">*</span></label>
												<div class="col-md-9">
													<input type="text" class="form-control" name="userDepartment" id="userDepartment" placeholder="部门">
													<!-- <span class="help-block">
													This is inline help </span> -->
												</div>
											</div>
										</div>
										<!--/span-->
										<div class="col-md-6">
											<div class="form-group">
												<label class="control-label col-md-3">导师/组长邮箱<span class="required">*</span></label>
												<div class="col-md-9">
													<input type="text" name="userLeader" id="userLeader" class="form-control" placeholder="导师/组长邮箱">
												</div>
											</div>
										</div>
										<!--/span-->
									</div>
									<!--/row-->
									<h3 class="form-section">&nbsp;&nbsp;&nbsp;&nbsp;设备信息</h3>
									<!--/row-->
									<div class="row">
										<div class="col-md-6">
											<div class="form-group">
												<label class="control-label col-md-3">设备名称<span class="required">*</span></label>
												<div class="col-md-9">
													<input type="text" name="deviceName" id="deviceName" placeholder="设备名称" class="form-control">
												</div>
											</div>
										</div>
										<div class="col-md-6">
											<div class="form-group">
												<label class="control-label col-md-3">设备类型<span class="required">*</span></label>
												<div class="col-md-9">
													<select name="deviceType" id="deviceType" class="form-control">
														<option value="笔记本">笔记本</option>
														<option value="台式机">台式机</option>
													</select>
												</div>
											</div>
										</div>
									</div>
									<div class="row">
										<div class="col-md-6">
											<div class="form-group">
												<label class="control-label col-md-3">操作系统<span class="required">*</span></label>
												<div class="col-md-9">
													<input type="text" name="deviceOs" id="deviceOs" placeholder="操作系统" class="form-control">
												</div>
											</div>
										</div>
										<!--/span-->
										<div class="col-md-6">
											<div class="form-group">
												<label class="control-label col-md-3">设备用途</label>
												<div class="col-md-9">
													<input type="text" name="devicePurpose" id="devicePurpose" placeholder="设备用途" class="form-control">
												</div>
											</div>
										</div>
										<!--/span-->
									</div>
									<!--/row-->
									<div class="row">
										<div class="col-md-6">
											<div class="form-group">
												<label class="control-label col-md-3"></label>
												<div class="col-md-9">
													<a class="btn blue" href="javascript:void(0);" onclick="addNetworkAdapter();">添加网卡</a>
												</div>
											</div>
										</div>
										<!--/span-->
										<div class="col-md-6">
											
										</div>
										<!--/span-->
									</div>
									<!--/row-->
									<div id="addNp">
									</div>
								</div>
								<div class="form-actions" style="margin-top: 30px;">
									<div class="row" style="margin-top: 18px;">
										<div class="col-md-6">
											<div class="row">
												<div class="col-md-offset-6 col-md-6" style="margin-left: 100px;">
													<a href="javascript:void(0);" id="saveBtn" class="btn green">提交</a>
													<a href="javascript:void(0);" id="backBtn" class="btn default">返回</a>
												</div>
											</div>
										</div>
										<div class="col-md-6">
											
										</div>
									</div>
								</div>
							</form>
							<!-- <div class="col-md-10" id="searchForm">
								<div class="col-md-4">
									<div class="form-group">
										<label class="control-label col-md-4">设备名称</label>
										<div class="col-md-8">
											<input type="text" name="deviceName" id="deviceNameSearch" placeholder="设备名称" class="form-control form-filter">
										</div>
									</div>
								</div>
								<div class="col-md-4">
									<div class="form-group">
										<label class="control-label col-md-4">用户邮箱</label>
										<div class="col-md-8">
											<input type="text" name="userEmail" id="userEmailSearch" placeholder="用户邮箱" class="form-control form-filter">
										</div>
									</div>
								</div>
								/span
							</div>
							<div class="btn-set pull-right col-md-2">
								<button class="btn blue" data-toggle="modal" id="create">新增</button>
								<shiro:hasPermission name="trManage:search">
									<button class="btn green" id="search">查询</button>
								</shiro:hasPermission>
								<button class="btn default" type="button" id="reset">重置</button>
							</div> -->
						</div>
						<!-- END FORM-->
					</div>
				</div>
			</div>
		</div>
		<!-- 查询条件结束 -->
	</div>
</div>