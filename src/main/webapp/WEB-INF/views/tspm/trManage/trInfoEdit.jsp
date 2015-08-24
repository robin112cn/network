<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class='container'>
	<div class="modal fade" id="view" tabindex="-1" role="dialog" aria-labelledby="titleLabel" data-backdrop="static" data-keyboard="false" aria-hidden="true">
		<div class="modal-dialog" >
			<div class="modal-content">
				<!-- 对话框标题开始 -->
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
					<h4 class="modal-title" id="titleLabel">IP地址分配</h4>
				</div>
				<!-- 对话框标题结束-->
				<!-- 内容开始 -->
				<div class="modal-body">
					<div class="portlet-body form">
						<form class="form-horizontal" id="trInfoForm" role="form">
							<div class="form-body">
							<input type="hidden" name="tag" id="tag" value="add">
							<input type="hidden" name="pk" id="pk">
								<div class="form-group">
									<label class="col-md-4 control-label">TR编号<span class="required">*</span></label>
									<div class="col-md-8">
										<div class="input-icon right">
											<i class="fa"></i>
											<input type="text" name="trId" id="trId" placeholder="TR编号" class="form-control form-filter">
										</div>
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-4 control-label">TR版本<span class="required">*</span></label>
									<div class="col-md-8">
										<div class="input-icon right">
											<i class="fa"></i>
											<input type="text" name="trVersion" id="trVersion" placeholder="TR版本" class="form-control form-filter">
										</div>
										<input type="hidden" name="fieldId"  />
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-4 control-label">备注<span class="required">*</span></label>
									<div class="col-md-8">
										<div class="input-icon right">
											<i class="fa"></i>
											<textarea name="remark" id="remark" placeholder="备注" class="form-control form-filter" rows="5"></textarea>
										</div>
										<input type="hidden" name="fieldId"  />
									</div>
								</div>
							</div>
						</form>
					</div>
				</div>
				<!-- 内容结束 -->
				<!-- footer开始 -->
				<div class="modal-footer">
					<button type="button" class="btn btn-primary" id="pass">审批通过</button>
					<button type="button" class="btn btn-primary" id="notpass">审批不通过</button>
					<!-- <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button> -->
				</div>
				<!-- footer结束 -->
			</div>
		</div>
	</div>
</div>