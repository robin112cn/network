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
							<input type="hidden" name="deviceId" id="deviceId">
								<div class="form-group">
									<label class="col-md-2 control-label">用户信息</label>
								</div>
								<div class="form-group">
									<label class="col-md-4 control-label">姓名<span class="required">*</span></label>
									<div class="col-md-8">
										<div class="input-icon right">
											<i class="fa"></i>
											<input type="text" name="userName" id="userName" placeholder="设备名称" class="form-control form-filter">
										</div>
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-4 control-label">电话<span class="required">*</span></label>
									<div class="col-md-8">
										<div class="input-icon right">
											<i class="fa"></i>
											<input type="text" name="userPhone" id="userPhone" placeholder="姓名" class="form-control form-filter">
										</div>
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-4 control-label">部门<span class="required">*</span></label>
									<div class="col-md-8">
										<div class="input-icon right">
											<i class="fa"></i>
											<input type="text" name="userDepartment" id="userDepartment" placeholder="部门" class="form-control form-filter">
										</div>
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-4 control-label">导师/组长邮箱<span class="required">*</span></label>
									<div class="col-md-8">
										<div class="input-icon right">
											<i class="fa"></i>
											<input type="text" name="userLeader" id="userLeader" placeholder="设备名称" class="form-control form-filter">
										</div>
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-2 control-label">设备信息</label>
								</div>
								<div class="form-group">
									<label class="col-md-4 control-label">设备名称<span class="required">*</span></label>
									<div class="col-md-8">
										<div class="input-icon right">
											<i class="fa"></i>
											<input type="text" name="deviceName" id="deviceName" placeholder="设备名称" class="form-control form-filter">
										</div>
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-4 control-label">设备类型<span class="required">*</span></label>
									<div class="col-md-8">
										<div class="input-icon right">
											<i class="fa"></i>
											<input type="text" name="deviceType" id="deviceType" placeholder="设备类型" class="form-control form-filter">
										</div>
										<input type="hidden" name="fieldId"  />
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-4 control-label">操作系统<span class="required">*</span></label>
									<div class="col-md-8">
										<div class="input-icon right">
											<i class="fa"></i>
											<input type="text" name="deviceOs" id="deviceOs" placeholder="操作系统" class="form-control form-filter">
										</div>
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-4 control-label">设备用途</label>
									<div class="col-md-8">
										<div class="input-icon right">
											<i class="fa"></i>
											<input type="text" name="devicePurpose" id="devicePurpose" placeholder="设备用途" class="form-control form-filter">
										</div>
									</div>
								</div>
								<div class="form-group">
									<div class="col-md-offset-4 col-md-8">
										<a class="btn blue" href="javascript:void(0);" onclick="addNetworkAdapter();">添加网卡</a>
									</div>
								</div>
								<div id="np1" style="display: none;">
									<div class="form-group">
										<label class="col-md-4 control-label">网卡1类型</label>
										<div class="col-md-8">
											<div class="input-group">
												<input type="text" name="np1Type" id="np1Type" placeholder="网卡类型" class="form-control">
												<span class="input-group-btn">
													<a class="btn blue" href="javascript:void(0);" onclick="deleteNp(1);">删除</a>
												</span>
											</div>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-4 control-label">MAC地址</label>
										<div class="col-md-8">
											<div class="input-icon right">
												<i class="fa"></i>
												<input type="text" name="np1Mac" id="np1Mac" placeholder="MAC" class="form-control form-filter">
											</div>
										</div>
									</div>
								</div>
								<div id="np2" style="display: none;">
									<div class="form-group">
										<label class="col-md-4 control-label">网卡2类型</label>
										<div class="col-md-8">
											<div class="input-group">
												<input type="text" name="np2Type" id="np2Type" placeholder="网卡类型" class="form-control">
												<span class="input-group-btn">
													<a class="btn blue" href="javascript:void(0);" onclick="deleteNp(2);">删除</a>
												</span>
											</div>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-4 control-label">MAC地址</label>
										<div class="col-md-8">
											<div class="input-icon right">
												<i class="fa"></i>
												<input type="text" name="np2Mac" id="np2Mac" placeholder="MAC" class="form-control form-filter">
											</div>
										</div>
									</div>
								</div>
								<div id="np3" style="display: none;">
									<div class="form-group">
										<label class="col-md-4 control-label">网卡3类型</label>
										<div class="col-md-8">
											<div class="input-group">
												<input type="text" name="np3Type" id="np3Type" placeholder="网卡类型" class="form-control">
												<span class="input-group-btn">
													<a class="btn blue" href="javascript:void(0);" onclick="deleteNp(3);">删除</a>
												</span>
											</div>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-4 control-label">MAC地址</label>
										<div class="col-md-8">
											<div class="input-icon right">
												<i class="fa"></i>
												<input type="text" name="np3Mac" id="np3Mac" placeholder="MAC" class="form-control form-filter">
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
				<div class="modal-footer">
					<button type="button" class="btn btn-primary" id="addDevice">保存</button>
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				</div>
				<!-- footer结束 -->
			</div>
		</div>
	</div>
	
	<div class="modal fade" id="viewIp" tabindex="-1" role="dialog" aria-labelledby="titleLabel"  data-keyboard="false" aria-hidden="true">
		<div class="modal-dialog" >
			<div class="modal-content">
				<!-- 对话框标题开始 -->
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
					<h4 class="modal-title" id="titleLabel">分配IP信息</h4>
				</div>
				<!-- 对话框标题结束-->
				<!-- 内容开始 -->
				<div class="modal-body">
					<div class="portlet-body form">
						<form class="form-horizontal" id="ipViewForm" role="form">
							<div class="form-body">
							<input type="hidden" name="tag" id="tag" value="add">
							<input type="hidden" name="deviceIdView" id="deviceIdView">
								<div class="form-group">
									<label class="col-md-2 control-label">设备信息</label>
								</div>
								<div class="form-group">
									<label class="col-md-4 control-label">设备名称<span class="required">*</span></label>
									<div class="col-md-8">
										<div class="input-icon right">
											<i class="fa"></i>
											<input type="text" name="deviceNameView" id="deviceNameView" placeholder="设备名称" class="form-control form-filter">
										</div>
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-4 control-label">设备类型<span class="required">*</span></label>
									<div class="col-md-8">
										<div class="input-icon right">
											<i class="fa"></i>
											<input type="text" name="deviceTypeView" id="deviceTypeView" placeholder="设备类型" class="form-control form-filter">
										</div>
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-4 control-label">操作系统<span class="required">*</span></label>
									<div class="col-md-8">
										<div class="input-icon right">
											<i class="fa"></i>
											<input type="text" name="deviceOsView" id="deviceOsView" placeholder="操作系统" class="form-control form-filter">
										</div>
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-4 control-label">设备用途</label>
									<div class="col-md-8">
										<div class="input-icon right">
											<i class="fa"></i>
											<input type="text" name="devicePurposeView" id="devicePurposeView" placeholder="设备用途" class="form-control form-filter">
										</div>
									</div>
								</div>
								<div id="np1View" style="display: none;">
									<div class="form-group">
										<label class="col-md-4 control-label">网卡1类型</label>
										<div class="col-md-8">
											<div class="input-group">
												<input type="text" name="np1TypeView" id="np1TypeView" placeholder="网卡类型" class="form-control">
											</div>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-4 control-label">MAC地址</label>
										<div class="col-md-8">
											<div class="input-icon right">
												<i class="fa"></i>
												<input type="text" name="np1MacView" id="np1MacView" placeholder="MAC" class="form-control form-filter">
											</div>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-4 control-label">分配IP</label>
										<div class="col-md-8">
											<div class="input-icon right">
												<i class="fa"></i>
												<input type="text" name="np1IpView" id="np1IpView" placeholder="IP" class="form-control form-filter">
											</div>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-4 control-label">截止日期</label>
										<div class="col-md-8">
											<div class="input-icon right">
												<i class="fa"></i>
												<input type="text" name="np1DeadlineView" id="np1DeadlineView" placeholder="IP" class="form-control form-filter">
											</div>
										</div>
									</div>
								</div>
								<div id="np2View" style="display: none;">
									<div class="form-group">
										<label class="col-md-4 control-label">网卡2类型</label>
										<div class="col-md-8">
											<div class="input-group">
												<input type="text" name="np2TypeView" id="np2TypeView" placeholder="网卡类型" class="form-control">
											</div>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-4 control-label">MAC地址</label>
										<div class="col-md-8">
											<div class="input-icon right">
												<i class="fa"></i>
												<input type="text" name="np2MacView" id="np2MacView" placeholder="MAC" class="form-control form-filter">
											</div>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-4 control-label">分配IP</label>
										<div class="col-md-8">
											<div class="input-icon right">
												<i class="fa"></i>
												<input type="text" name="np2IpView" id="np2IpView" placeholder="IP" class="form-control form-filter">
											</div>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-4 control-label">截止日期</label>
										<div class="col-md-8">
											<div class="input-icon right">
												<i class="fa"></i>
												<input type="text" name="np2DeadlineView" id="np2DeadlineView" placeholder="IP" class="form-control form-filter">
											</div>
										</div>
									</div>
								</div>
								<div id="np3View" style="display: none;">
									<div class="form-group">
										<label class="col-md-4 control-label">网卡3类型</label>
										<div class="col-md-8">
											<div class="input-group">
												<input type="text" name="np3TypeView" id="np3TypeView" placeholder="网卡类型" class="form-control">
											</div>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-4 control-label">MAC地址</label>
										<div class="col-md-8">
											<div class="input-icon right">
												<i class="fa"></i>
												<input type="text" name="np3MacView" id="np3MacView" placeholder="MAC" class="form-control form-filter">
											</div>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-4 control-label">分配IP</label>
										<div class="col-md-8">
											<div class="input-icon right">
												<i class="fa"></i>
												<input type="text" name="np3IpView" id="np3IpView" placeholder="IP" class="form-control form-filter">
											</div>
										</div>
									</div>
									<div class="form-group">
										<label class="col-md-4 control-label">截止日期</label>
										<div class="col-md-8">
											<div class="input-icon right">
												<i class="fa"></i>
												<input type="text" name="np3DeadlineView" id="np3DeadlineView" placeholder="IP" class="form-control form-filter">
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
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				</div>
				<!-- footer结束 -->
			</div>
		</div>
	</div>
</div>