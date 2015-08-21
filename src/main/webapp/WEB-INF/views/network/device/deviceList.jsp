<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="page-bar">
	<ul class="page-breadcrumb">
		<li><i class="fa fa-home"></i> 网络接入管理 <i class="fa fa-angle-right"></i></li>
		<li>设备管理</li>
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
						<span class="caption-subject">我的设备</span>
						<!-- <span class="caption-helper">some info...</span> -->
					</div>
					<div class="portlet-body form">
						<!-- BEGIN FORM-->
						<div class="form-body clearfix">
							<div class="col-md-10" id="searchForm">
								<div class="col-md-4">
									<div class="form-group">
										<label class="control-label col-md-4">设备名称</label>
										<div class="col-md-8">
											<input type="text" name="deviceName" id="deviceNameSearch" placeholder="设备名称" class="form-control form-filter">
										</div>
									</div>
								</div>
								<!-- <div class="col-md-4">
									<div class="form-group">
										<label class="control-label col-md-4">用户邮箱</label>
										<div class="col-md-8">
											<input type="text" name="userEmail" id="userEmailSearch" placeholder="用户邮箱" class="form-control form-filter">
										</div>
									</div>
								</div> -->
								<!--/span-->
							</div>
							<div class="btn-set pull-right col-md-2">
								<button class="btn blue" data-toggle="modal" id="create">新增</button>
								<shiro:hasPermission name="trManage:search">
									<button class="btn green" id="search">查询</button>
								</shiro:hasPermission>
								<button class="btn default" type="button" id="reset">重置</button>
							</div>
						</div>
						<!-- END FORM-->
					</div>
				</div>
			</div>
		</div>
		<!-- 查询条件结束 -->
		<!-- 表格开始 -->
		<table class="table table-striped table-bordered table-hover" id="grid">
			<tbody>
			</tbody>
		</table>
		<!-- 表格结束 -->
	</div>
</div>