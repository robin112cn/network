<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="page-bar">
	<ul class="page-breadcrumb">
		<li><i class="fa fa-home"></i> 内容管理 <i
			class="fa fa-angle-right"></i></li>
		<li>信息管理</li>
	</ul>
</div>
<div class="row">
<div id="treeDiv" class="col-md-2" style="padding-right:0px;">
	<div class="portlet green-haze box" style="border-width:0px 0px 1px 1px;">
		<div class="portlet-title">
			<div class="caption">
				<i class="icon-list"></i>栏目列表
			</div>
			<div class="tools">
				<a class="collapse" href="javascript:;" data-original-title="" title="">
				</a>
				<a class="reload" id="reloadtree" href="javascript:;" data-original-title=""  title="">
				</a>
			</div>
		</div>
		<div class="portlet-body" id="treeBd">
			<div id="treeScroller" class="scroller" style="height:400px;" data-always-visible="1" data-rail-visible="0">
				<div id="zTreeDemo" class="ztree">
				</div>
			</div>
		</div>
	</div>
</div>
<div id="tableDiv" class="col-md-10"  style="padding-left:0px;">
<div class="portlet box green-haze">
	<!-- 标题 开始-->
	<div class="portlet-title">
		<div class="caption">
			<i class="fa fa-globe"></i>信息管理
		</div>
	</div>
	<!-- 标题 结束-->
	<!-- 查询条件开始 -->
	<div class="portlet-body" id="tabBd">
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
									<label class="control-label col-md-4">长标题</label>
									<div class="col-md-8">
										<input type="text" name="longTitle" placeholder="长标题" class="form-control form-filter">
									</div>
								</div>
							</div>
							<!--
							<div class="col-md-4">
								<div class="form-group">
									<label class="control-label col-md-4">栏目</label>
									<div class="col-md-8">
										<select class="form-control" name="columnId">
											<option value="">全部</option>
											<c:forEach items="${cmsColumnList}" var="item">
			    								<option value="${item.columnId}">${item.columnName}</option>
			    							</c:forEach>
										</select>
									</div>
								</div>
							</div>
							 -->
							<input type="hidden" name="columnId" id="columnIdSearch">
							<div class="btn-set pull-right">
								<a class="btn blue" id="create">新建</a>
								<a class="btn green" id="search">查询</a>
								<a class="btn default" id="reset" type="reset">重置</a>
							</div>
						</div>
					</div>
				</form>
			</div>
			</div>
		</div>
		<!-- 查询条件结束 -->
		<div class="row">
			<div class="col-md-12">
				<div class="table-container">
					<!-- 表格开始 -->
					<table class="table table-striped table-bordered table-hover" id="grid">
						<tbody>
						</tbody>
					</table>
					<!-- 表格结束 -->
				</div>
			</div>
		</div>
	</div>
</div>
</div>
</div>