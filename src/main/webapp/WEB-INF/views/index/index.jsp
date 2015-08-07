<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en" class="no-js">
<!--<![endif]-->

    <head>
    	<%@ include file="/WEB-INF/views/include/meta.jsp"%>
		<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
    	<jsp:include page="/WEB-INF/views/include/common-css.jsp"></jsp:include>
    	<jsp:include page="/WEB-INF/views/include/theme-style.jsp"></jsp:include>
    	<!-- BEGIN PAGE LEVEL PLUGIN STYLES -->
		<link href="${ctxResources}/global/plugins/bootstrap-daterangepicker/daterangepicker-bs3.css" rel="stylesheet" type="text/css"/>
		<link href="${ctxResources}/global/plugins/fullcalendar/fullcalendar.min.css" rel="stylesheet" type="text/css"/>
		<!-- END PAGE LEVEL PLUGIN STYLES -->
        <!--add your css begin -->
        <!--add your css end -->
    </head>
    <body class="page-header-fixed">
    <%@ include file="/WEB-INF/views/index/header.jsp"%>
    	<!-- BEGIN CONTAINER -->
        <div class="page-container">
            <!-- BEGIN SIDEBAR -->
            <div class="page-sidebar-wrapper custom-sidebar-wrapper">
                <div class="page-sidebar navbar-collapse collapse">
                    <jsp:include page="/WEB-INF/views/index/menus.jsp"></jsp:include>
                </div>
            </div>
            <!-- BEGIN CONTENT -->
            <div class="page-content-wrapper">
                <div class="page-content">
                <jsp:include page="/WEB-INF/views/index/pageheader.jsp"></jsp:include>
                <!-- your code here begin-->
                <jsp:include page="content.jsp"></jsp:include>
                <!-- your code here end-->
                </div>
            </div>
            <!-- END CONTENT -->
        </div>
    	<jsp:include page="/WEB-INF/views/index/footer.jsp"></jsp:include>
    	<jsp:include page="/WEB-INF/views/include/core-plugins.jsp"></jsp:include>
    	<jsp:include page="/WEB-INF/views/include/common-js.jsp"></jsp:include>
        <!--add your js begin -->
        <script src="${ctxResources}/pages/scripts/index.js" type="text/javascript"></script>
        <!--add your js end -->
        <script type="text/javascript">
        	jQuery(document).ready(function() {
        		var ap = '${ctxResources}/';
	    		Metronic.setAssetsPath(ap);
        	   Metronic.init(); // init metronic core componets
        	   Layout.init(); // init layout
        	   QuickSidebar.init(); // init quick sidebar
        	   LayoutControl.init(); // init demo features
        	   var mid = '${param.menu_id}';
        	   if(!mid)  mid = "menu_1";
        	   LayoutControl.activeLink('click',mid);
        	   Index.init();
        	   Index.initDashboardDaterange();
        	   $.ajax({
					type : 'POST',
					url : ctx + '/getUserName',
					dataType : 'json',
					success : function(data) {
						if(!data.success){
							alert("\u767B\u5F55\u8D85\u65F6");
							window.location.href=ctx+"/";
						}
					}
				});
        	});
        </script>
    </body>
</html>
