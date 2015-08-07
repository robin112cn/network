<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class='container'>
	<div class="modal fade" id="listedCompanyModal" tabindex="-1" role="dialog" aria-labelledby="listedCompanyModalLabel" aria-hidden="true" data-backdrop="static" data-keyboard="false">
		<div class="modal-dialog" >
			<div class="modal-content">
				<!-- 对话框标题开始 -->
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
					<h4 class="modal-title" id="listedCompanyModalLabel">上市公司</h4>
				</div>
				<!-- 对话框标题结束-->
				<!-- 内容开始 -->
				<div class="modal-body">
					<div class="portlet-body form">
						<form class="form-horizontal" id="listedCompanyForm" method="post" role="form">
							<div class="form-body">
								<div class="form-group">
									<label class="col-md-4 control-label">A股代码<span class="required">*</span></label>
									<div class="col-md-8">
										<div class="input-icon right">
											<i class="fa"></i>
											<input type="text"  name="stockCodeA" placeholder="A股代码" class="form-control form-filter">
										</div>
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-4 control-label">公司简称<span class="required">*</span></label>
									<div class="col-md-8">
										<div class="input-icon right">
											<i class="fa"></i>
											<input type="text"  name="companyShortName" placeholder="公司简称" class="form-control form-filter">
										</div>
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-4 control-label">公司全称<span class="required">*</span></label>
									<div class="col-md-8">
										<div class="input-icon right">
											<i class="fa"></i>
											<input type="text"  name="companyFullName" placeholder="公司全称" class="form-control form-filter">
										</div>
									</div>
								</div>
								<!-- <div class="form-group">
									<label class="col-md-4 control-label">上市时间<span class="required">*</span></label>
									<div class="col-md-8">
										<div class="input-icon right">
											<i class="fa"></i>
											<input type="text"  name="timeToMarket" placeholder="上市时间" class="form-control form-filter">
										</div>
									</div>
								</div> -->
								<div class="form-group">
									<label class="col-md-4 control-label">注册地址</label>
									<div class="col-md-8">
									<div class="input-icon right">
											<i class="fa"></i>
										<input type="text"  name="registeredAddress" placeholder="注册地址" class="form-control form-filter" >
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
					<button type="submit" class="btn btn-primary" id="saveListedCompany">保存</button>
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				</div>
				<!-- footer结束 -->
			</div>
		</div>
	</div>
</div>