<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class='container'>
	<div class="modal fade" id="view" tabindex="-1" role="dialog" aria-labelledby="titleLabel" data-backdrop="static" data-keyboard="false" aria-hidden="true">
		<div class="modal-dialog" >
			<div class="modal-content">
				<!-- 对话框标题开始 -->
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
					<h4 class="modal-title" id="titleLabel">设备信息</h4>
				</div>
				<!-- 对话框标题结束-->
				<!-- 内容开始 -->
				<div class="modal-body">
					<div class="portlet-body form">
						<form class="form-horizontal" id="deviceForm" role="form">
							<div class="form-body">
							<input type="hidden" name="tag" id="tag" value="add">
							<input type="hidden" name="pk" id="pk">
								<div class="form-group">
									<label class="col-md-4 control-label">设备名称<span class="required">*</span></label>
									<div class="col-md-8">
										<div class="input-icon right">
											<i class="fa"></i>
											<input type="text" name="deviceName" id="deviceNameAdd" placeholder="设备名称" class="form-control form-filter">
										</div>
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-4 control-label">设备类型<span class="required">*</span></label>
									<div class="col-md-8">
										<div class="input-icon right">
											<i class="fa"></i>
											<input type="text" name="deviceType" id="deviceTypeAdd" placeholder="设备类型" class="form-control form-filter">
										</div>
										<input type="hidden" name="fieldId"  />
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-4 control-label">操作系统<span class="required">*</span></label>
									<div class="col-md-8">
										<div class="input-icon right">
											<i class="fa"></i>
											<input type="text" name="deviceOs" id="deviceOsAdd" placeholder="操作系统" class="form-control form-filter">
										</div>
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-4 control-label">设备用途</label>
									<div class="col-md-8">
										<div class="input-icon right">
											<i class="fa"></i>
											<input type="text" name="devicePurpose" id="devicePurposeAdd" placeholder="设备用途" class="form-control form-filter">
										</div>
									</div>
								</div>
							</div>
						</form>
					</div>
				</div>
				<!-- 内容结束 -->
				<!-- footer开始 -->
				<div class="modal-footer">
					<button type="button" class="btn btn-primary" id="addDevice">保存</button>
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				</div>
				<!-- footer结束 -->
			</div>
		</div>
	</div>
</div>