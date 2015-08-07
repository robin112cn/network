<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="page-bar">
	<ul class="page-breadcrumb">
		<li><i class="fa fa-home"></i> 系统设置 <i class="fa fa-angle-right"></i></li>
		<li>菜单管理</li>
	</ul>
</div>
<div class="portlet box green-haze">
	<!-- 标题 开始-->
	<!-- <div class="portlet-title">
		<div class="caption">
			<i class="fa fa-globe"></i>菜单信息
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
						<span class="caption-subject">菜单管理</span>
						<!-- <span class="caption-helper">some info...</span> -->
					</div>
						<div class="portlet-body form">
						<!-- BEGIN FORM-->
						<div class="form-body clearfix">
							<div class="col-md-10" id="modulesSearchForm">
								<div class="col-md-4">
									<div class="form-group">
										<label class="control-label col-md-4">菜单编码</label>
										<div class="col-md-8">
											<input type="text" name="moduleId" placeholder="菜单编码" class="form-control">
										</div>
									</div>
								</div>
								<div class="col-md-4">
									<div class="form-group">
										<label class="control-label col-md-4">菜单名称</label>
										<div class="col-md-8">
											<input type="text" name="moduleName" placeholder="菜单名称" class="form-control">
										</div>
									</div>
								</div>
								<!--/span-->
							</div>
							<div class="btn-set pull-right col-md-2">
								<shiro:hasPermission name="module:create"> 
									<button class="btn blue" data-toggle="modal" id="create">新建</button>
								</shiro:hasPermission>
								<shiro:hasPermission name="module:search"> 
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
				