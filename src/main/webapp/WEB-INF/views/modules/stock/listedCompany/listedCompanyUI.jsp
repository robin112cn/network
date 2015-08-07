<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en" class="no-js">
<!--<![endif]-->
	<head>
		<%@ include file="/WEB-INF/views/include/meta.jsp"%>
		<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
    	<jsp:include page="/WEB-INF/views/include/common-css.jsp" />
    	<jsp:include page="/WEB-INF/views/include/theme-style.jsp" />
    	<link rel="stylesheet" href="${ctxResources }/global/plugins/bootstrap-datepicker/css/datepicker.css"/>
    	<link rel="stylesheet" href="${ctxResources}/global/plugins/datatables/plugins/bootstrap/dataTables.bootstrap.css" />
    	<link rel="stylesheet" href="${ctxResources}/global/plugins/bootstrap-toastr/toastr.min.css"/>
	</head>
	<body class="page-header-fixed">
		<%@ include file="/WEB-INF/views/index/header.jsp"%>
		<div class="page-container">
			<!-- BEGIN SIDEBAR -->
			<div class="page-sidebar-wrapper">
				<div class="page-sidebar navbar-collapse collapse">
					<%@ include file="/WEB-INF/views/index/menus.jsp"%>
				</div>
			</div>
			<!-- BEGIN CONTENT -->
			<div class="page-content-wrapper">
				<div class="page-content">
					<!-- your code here begin-->
					<%@ include file="listedCompanyList.jsp"%>
					<!-- your code here end-->
				</div>
			</div>
			<%@ include file="listedCompanyEdit.jsp"%>
			<!-- END CONTENT -->
		</div>
		<%@ include file="/WEB-INF/views/index/footer.jsp"%>
		<%@ include file="/WEB-INF/views/include/core-plugins.jsp"%>
		<%@ include file="/WEB-INF/views/include/common-js.jsp"%>
		<script src="${ctxResources}/pages/scripts/index.js" ></script>
		<script src="${ctxResources}/global/plugins/jquery-validation/js/jquery.validate.js"></script>
		<script src="${ctxResources}/global/plugins/jquery-validation/js/additional-methods.min.js"></script>
		<script src="${ctxResources}/global/plugins/jquery-validation/js/localization/messages_zh.min.js"></script>
		<script src="${ctxResources}/pages/scripts/common/common-validation-addmethods.js"></script>
		<script src="${ctxResources}/global/plugins/select2/select2.min.js"></script>
		<script src="${ctxResources}/global/plugins/datatables/media/js/jquery.dataTables.min.js"></script>
		<script src="${ctxResources}/global/plugins/datatables/plugins/bootstrap/dataTables.bootstrap.js"></script>
		<script src="${ctxResources}/global/scripts/datatable.js"></script>
		<script src="${ctxResources}/global/plugins/bootstrap-datepicker/js/bootstrap-datepicker.js"></script>
		<script src="${ctxResources}/global/plugins/bootstrap-toastr/toastr.min.js"></script>
		<script src="${ctxResources}/pages/scripts/stock/listedCompanyUI.js"></script>
		<script >
		jQuery(document).ready(function(){
			var ap = ctxResources + '/';
			Metronic.setAssetsPath(ap);
			Metronic.init(); 
			Layout.init(); 
			LayoutControl.init();
			var mid = '${param.menu_id}';
    		LayoutControl.activeLink('click',mid);
			//
			listedCompanyUI.init();
		});
		function getPremission(data){
			var p = "<a class='btn default btn-xs update blue' name='"+data+"' ><i class='fa fa-edit'></i> 编辑 </a>";
			p += "<a name='"+data+"' class='btn default delete btn-xs red'><i class='fa fa-trash-o'></i> 删除 </a>";
			return p;
		};
		</script>
	</body>
</html>