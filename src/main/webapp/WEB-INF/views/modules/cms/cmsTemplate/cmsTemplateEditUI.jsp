<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<!DOCTYPE html>

<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en" class="no-js">
<!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
	<%@ include file="/WEB-INF/views/include/meta.jsp"%>
	<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
   	<jsp:include page="/WEB-INF/views/include/common-css.jsp" />
   	<jsp:include page="/WEB-INF/views/include/theme-style.jsp" />
   	<link rel="stylesheet" href="${ctxResources }/global/plugins/bootstrap-datepicker/css/datepicker.css"/>
   	<link rel="stylesheet" href="${ctxResources}/global/plugins/bootstrap-select/bootstrap-select.min.css" />
   	<link rel="stylesheet" href="${ctxResources}/global/plugins/bootstrap-toastr/toastr.min.css"/>
   	<link rel="stylesheet" href="${ctxResources}/global/plugins/zTree/css/metroStyle/metroStyle.css" />
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<!-- DOC: Apply "page-header-fixed-mobile" and "page-footer-fixed-mobile" class to body element to force fixed header or footer in mobile devices -->
<!-- DOC: Apply "page-sidebar-closed" class to the body and "page-sidebar-menu-closed" class to the sidebar menu element to hide the sidebar by default -->
<!-- DOC: Apply "page-sidebar-hide" class to the body to make the sidebar completely hidden on toggle -->
<!-- DOC: Apply "page-sidebar-closed-hide-logo" class to the body element to make the logo hidden on sidebar toggle -->
<!-- DOC: Apply "page-sidebar-hide" class to body element to completely hide the sidebar on sidebar toggle -->
<!-- DOC: Apply "page-sidebar-fixed" class to have fixed sidebar -->
<!-- DOC: Apply "page-footer-fixed" class to the body element to have fixed footer -->
<!-- DOC: Apply "page-sidebar-reversed" class to put the sidebar on the right side -->
<!-- DOC: Apply "page-full-width" class to the body element to have full width page without the sidebar menu -->
<body class="page-header-fixed page-quick-sidebar-over-content page-style-square">
	<%@ include file="/WEB-INF/views/index/header.jsp"%>
	<div class="clearfix">
	</div>
	<!-- BEGIN CONTAINER -->
	<div class="page-container">
		<!-- BEGIN SIDEBAR -->
		<div class="page-sidebar-wrapper">
			<div class="page-sidebar navbar-collapse collapse">
				<%@ include file="/WEB-INF/views/index/menus.jsp"%>
			</div>
		</div>
		<!-- END SIDEBAR -->
		<!-- BEGIN CONTENT -->
	    <div class="page-content-wrapper">
	        <div class="page-content">
	        <jsp:include page="cmsInfomationEdit.jsp"></jsp:include>
	        <!-- your code here end-->
	        </div>
	    </div>
		<!-- END CONTENT -->
	</div>
<!-- END CONTAINER -->
<%@ include file="/WEB-INF/views/index/footer.jsp"%>
<%@ include file="/WEB-INF/views/include/core-plugins.jsp"%>
<%@ include file="/WEB-INF/views/include/common-js.jsp"%>
<script src="${ctxResources}/pages/scripts/index.js" ></script>
<script src="${ctxResources}/global/plugins/jquery-validation/js/jquery.validate.js"></script>
<script src="${ctxResources}/global/plugins/jquery-validation/js/additional-methods.min.js"></script>
<script src="${ctxResources}/global/plugins/jquery-validation/js/localization/messages_zh.min.js"></script>
<script src="${ctxResources}/pages/scripts/common/common-validation-addmethods.js"></script>
<script src="${ctxResources}/global/plugins/select2/select2.min.js"></script>
<script src="${ctxResources}/global/plugins/bootstrap-datepicker/js/bootstrap-datepicker.js"></script>
<script src="${ctxResources}/global/plugins/bootstrap-select/bootstrap-select.min.js"></script>
<script src="${ctxResources}/global/plugins/zTree/js/jquery.ztree.core-3.5.js"></script>
<script src="${ctxResources}/global/plugins/zTree/js/jquery.ztree.excheck-3.5.js"></script>
<script src="${ctxResources}/global/plugins/zTree/js/jquery.ztree.exedit-3.5.js"></script>
<script src="${ctxResources}/global/plugins/bootstrap-toastr/toastr.min.js"></script>
<script src="${ctx}/ckeditor/ckeditor.js"></script>
<script src="${ctx}/ckfinder/ckfinder.js"></script>
<script src="${ctxResources}/pages/scripts/cms/cmsInfomation/cmsInfomationEditUI.js"></script>
<!-- <script src="${ctxResources}/pages/scripts/zTree.js"></script> -->
<script>
var editor = null;
	jQuery(document).ready(function(){
		var ap = ctxResources + '/';
		Metronic.setAssetsPath(ap);
		Metronic.init();
		Layout.init();
		LayoutControl.init();
		var mid = '${param.menu_id}';
		LayoutControl.activeLink('click',mid);
		//
		//cmsInformationUI.init();

		var cols = '${columns}';
		var json=JSON.parse(cols);
		InforEditor.handzTreeData(json);
		InforEditor.zTreeInit(json);

		editor = CKEDITOR.replace( 'content', {
			filebrowserBrowseUrl : '${ctx}/ckfinder/ckfinder.html',
			filebrowserImageBrowseUrl : '${ctx}/ckfinder/ckfinder.html?type=Images',
			filebrowserFlashBrowseUrl : '${ctx}/ckfinder/ckfinder.html?type=Flash',
			filebrowserUploadUrl : '${ctx}/ckfinder/core/connector/java/connector.java?command=QuickUpload&type=Files',
			filebrowserImageUploadUrl : '${ctx}/ckfinder/core/connector/java/connector.java?command=QuickUpload&type=Images',
			filebrowserFlashUploadUrl : '${ctx}/ckfinder/core/connector/java/connector.java?command=QuickUpload&type=Flash',
			filebrowserWindowWidth : '1000',
		 	filebrowserWindowHeight : '700',
            on: {
                instanceReady: function( ev ) {
                    this.dataProcessor.writer.setRules( 'p', {
                        indent: false,
                        breakBeforeOpen: false,   //<p>之前不加换行
                        breakAfterOpen: false,    //<p>之后不加换行
                        breakBeforeClose: false,  //</p>之前不加换行
                        breakAfterClose: false    //</p>之后不加换行7
                    });
                }
            }
        });

		CKFinder.setupCKEditor( editor, '${ctx}/ckfinder/' );
	});
</script>
<!-- END JAVASCRIPTS -->
</body>
<!-- END BODY -->
</html>
