<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="page-bar">
	<ul class="page-breadcrumb">
		<li><i class="fa fa-home"></i> Token管理 <i class="fa fa-angle-right"></i></li>
		<li>Token信息统计</li>
	</ul>
</div>
<div class="portlet box green-haze">
	<!-- 标题 开始-->
	<!-- <div class="portlet-title">
		<div class="caption">
			<i class="fa fa-globe"></i>TR信息统计
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
						<span class="caption-subject">Token信息统计</span>
						<!-- <span class="caption-helper">some info...</span> -->
					</div>
					<div class="portlet-body form">
						<!-- BEGIN FORM-->
						<div class="form-body clearfix">
							<div class="col-md-10" id="searchForm">
								<div class="col-md-4">
									<div class="form-group">
										<label class="control-label col-md-4">统计周期</label>
										<div class="col-md-8">
											<select name="period" id="periodSearch" class="form-control form-filter">
											</select>
										</div>
									</div>
								</div>
								<div class="col-md-4">
									<div class="form-group">
										<label class="control-label col-md-4">起始时间</label>
										<div class="col-md-8">
											<input type="text" name="startDate" id="startDateSearch" placeholder="起始时间" class="form-control form-filter">
										</div>
									</div>
								</div>
								<div class="col-md-4">
									<div class="form-group">
										<label class="control-label col-md-4">终止时间</label>
										<div class="col-md-8">
											<input type="text" name="endDate" id="endDateSearch" placeholder="终止时间" class="form-control form-filter">
										</div>
									</div>
								</div>
								<!--/span-->
							</div>
							<div class="btn-set pull-right col-md-2">
								<shiro:hasPermission name="statisticsTr:export">
									<button class="btn blue" id="export">导出</button>
								</shiro:hasPermission>
								<shiro:hasPermission name="statisticsToken:search">
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