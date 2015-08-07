<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="page-bar">
	<ul class="page-breadcrumb">
		<li>
			<i class="fa fa-home"></i>
			<a href="#">主页</a>
			<i class="fa fa-angle-right"></i>
		</li>
		<li>
			<a href="#">信息管理</a>
			<i class="fa fa-angle-right"></i>
		</li>
		<li>
			<a href="#">${titleTag } </a>
		</li>
	</ul>
</div>

<!-- BEGIN PAGE CONTENT-->
<div class="row">
	<div class="col-md-12">
		<!-- BEGIN VALIDATION STATES-->
		<div class="portlet box green-haze">
			<div class="portlet-title">
				<div class="caption">
					<i class="fa fa-edit"></i>页面模板列表
				</div>
				<div class="tools">
					<a href="javascript:;" class="collapse">
					</a>
					<!--
					<a href="#portlet-config" data-toggle="modal" class="config">
					</a>
					<a href="javascript:;" class="reload">
					</a>
					<a href="javascript:;" class="remove">
					</a>
					-->
				</div>
			</div>
			<div class="portlet-body">
				<div class="table-scrollable">
					<table class="table table-striped table-bordered table-advance table-hover">
					<thead>
					<tr>
						<th>
							<i class="fa fa-briefcase"></i> 模板名称
						</th>
						<th class="hidden-xs">
							<i class="fa fa-question"></i> 描述
						</th>
						<th>
							<i class="fa fa-bookmark"></i> 文件路径
						</th>
						<th>
						</th>
					</tr>
					</thead>
					<tbody>
					<tr>
						<td>
							公司介绍
						</td>
						<td class="hidden-xs">
							 生成果核门户“关于”-“公司简介”的静态页面
						</td>
						<td>
							/WEB-INF/templates/page/company.vm
						</td>
						<td>
							<a name="company" href="#" class="btn default btn-xs blue-stripe">
							生成静态页面 </a>
							<a name="company" href="#" class="btn default btn-xs green-stripe">
							预览 </a>
						</td>
					</tr>
					</tbody>
					</table>
				</div>

			</div>
		</div>
		<!-- END VALIDATION STATES-->
	</div>
</div>

<!-- END PAGE CONTENT-->
</div>