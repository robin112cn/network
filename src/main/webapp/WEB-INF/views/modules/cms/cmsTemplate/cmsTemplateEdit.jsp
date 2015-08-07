<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="modal fade" id="colTreeModal" tabindex="-1" role="dialog" aria-labelledby="colTreeLabel" aria-hidden="true" data-keyboard="false">
	<div class="modal-dialog" >
		<div class="modal-content">
			<!-- 对话框标题开始 -->
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
				<h4 class="modal-title" id="colTreeLabel">选择栏目</h4>
			</div>
			<!-- 对话框标题结束-->
			<!-- 内容开始 -->
			<div class="modal-body">
				<div class="portlet-body form">
					<form role="form" class="form-horizontal">
					<div class="form-body">
						<div class="form-group">
							<div class="col-md-12">
								<div class="scroller" style="height:150px;width:180px" data-always-visible="1" data-rail-visible="0">
								<div id="colTree" class="ztree">
								</div>

								</div>
							</div>
						</div>
					</div>
				</form>
				</div>
			</div>
			<!-- 内容结束 -->
			<!-- footer开始 -->
			<div class="modal-footer left">
				<div class="alert alert-info no-margin" style="text-align: left;">
					 请选择文章所在栏目.
				</div>
			</div>
			<!-- footer结束 -->
		</div>
	</div>
</div>

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
		<div class="portlet box blue">
			<div class="portlet-title">
				<div class="caption">
					<i class="fa fa-edit"></i>新建内容
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
			<div class="portlet-body form">
				<!-- BEGIN FORM-->
				<form id="inforForm" class="form-horizontal" method="post" >
					<input type="hidden" id="infoIdAdd" name="infoId" value="${cmsInfor.infoId }"/>
					<div class="form-body">
						<div class="form-group">
							<label class="control-label col-md-3">短标题 <span class="required">
							* </span>
							</label>
							<div class="col-md-4">
								<div class="input-icon right">
									<i class="fa"></i>
									<input type="text" class="form-control" id="shortTitleAdd" name="shortTitle" value="${cmsInfor.shortTitle }"/>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-3">长标题 <span class="required">
							* </span>
							</label>
							<div class="col-md-4">
								<div class="input-icon right">
									<i class="fa"></i>
									<textarea type="text" class="form-control" id="longTitleAdd" name="longTitle">${cmsInfor.longTitle }</textarea>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-3">图片标题 <span class="required">
							* </span>
							</label>
							<div class="col-md-4">
								<div class="input-group right">
									<i class="fa"></i>
									<input type="text" class="form-control" readonly="" id="imgTitleAdd" name="imgTitle" value="${cmsInfor.imgTitle }"/>
									<span class="input-group-btn">
										<a class="btn blue" id="picSelect">选择图片</a>
									</span>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-3">所属栏目 <span class="required">
							* </span>
							</label>
							<div class="col-md-4">
								<div class="input-group right">
									<input type="hidden" class="form-control" id="columnIdAdd" name="columnId" value="${cmsInfor.columnId }"/>
									<i class="fa"></i>
									<input type="text" class="form-control" readonly="" id="colNameAdd" name="colName" value="${cmsInfor.columnName }"/>
									<span class="input-group-btn">
										<a class="btn blue" id="colBtn">选择栏目</a>
									</span>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-3">标签
							</label>
							<div class="col-md-4">
								<div class="input-icon right">
									<i class="fa"></i>
									<input type="text" class="form-control" id="keyworkdsAdd" name="keyworkds" value="${cmsInfor.keyworkds }"/>
								</div>
								<span class="help-block">
								多个标签请用英文字符;隔开 </span>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-3">文章来源
							</label>
							<div class="col-md-4">
								<div class="input-icon right">
									<i class="fa"></i>
									<input type="text" class="form-control" id="sourceAdd" name="source" value="${cmsInfor.keyworkds }"/>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-3">摘要 <span class="required">
							* </span>
							</label>
							<div class="col-md-4">
								<div class="input-icon right">
									<i class="fa"></i>
									<textarea type="text" class="form-control" id="infoAbstractAdd" name="infoAbstract">${cmsInfor.infoAbstract }</textarea>
								</div>
							</div>
						</div>
						<div class="form-group">
							<label class="control-label col-md-3">作者
							</label>
							<div class="col-md-4">
								<div class="input-icon right">
									<i class="fa"></i>
									<input type="text" class="form-control" id="authorAdd" name="author"  value="${cmsInfor.author }"/>
								</div>
							</div>
						</div>

						<div class="form-group last">
							<label class="control-label col-md-3">CKEditor <span class="required">
							* </span>
							</label>
							<div class="col-md-9">
								<textarea class="ckeditor form-control" id="contentAdd" name="content" rows="6" data-error-container="#editor2_error">
									${cmsInfor.content }
								</textarea>
								<div id="editor2_error">
								</div>
							</div>
						</div>

					</div>
					<div class="form-actions right">
						<div class="row">
							<div class="col-md-offset-3 col-md-9">
								<a class="btn green" id="addInfo">保存</a>
								<a class="btn default" id="back">返回</a>
							</div>
						</div>
					</div>
				</form>
				<!-- END FORM-->
			</div>
		</div>
		<!-- END VALIDATION STATES-->
	</div>
</div>

<!-- END PAGE CONTENT-->

