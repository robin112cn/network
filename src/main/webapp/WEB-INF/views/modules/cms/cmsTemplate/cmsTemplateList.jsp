<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="page-bar">
	<ul class="page-breadcrumb">
		<li><i class="fa fa-home"></i> 内容管理 <i
			class="fa fa-angle-right"></i></li>
		<li>模板管理</li>
	</ul>
</div>
<div class="portlet box green-haze">
	<!-- 标题 开始-->
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-globe"></i>模板管理
		</div>
	</div>
	<!-- 标题 结束-->
	<!-- 查询条件开始 -->
	<div class="portlet-body">
		<div class="row">
			<div class="col-md-12">
			<div class="portlet light">
				<div class="caption">
					<i class="icon-equalizer font-green-haze"></i>
					<span class="caption-subject font-green-haze bold uppercase">查询条件</span>
				</div>
				<form role="form" class="portlet-body form" id="searchForm">
					<div class="form-body">
						<div class="row">
							<div class="col-md-4">
								<div class="form-group">
									<label class="control-label col-md-4">模板名称</label>
									<div class="col-md-8">
										<input type="text" name="templateName" placeholder="模板名称" class="form-control form-filter">
									</div>
								</div>	
							</div>
							<div class="btn-set pull-right">
								<a class="btn green" id="search">查询</a>
								<a class="btn default" id="reset" type="reset">重置</a>
							</div>
						</div>
					</div>
				</form>
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