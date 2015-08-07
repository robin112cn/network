<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--[if lt IE 9]>
	<script src="${ctxResources}/global/plugins/respond.min.js"></script>
	<script src="${ctxResources}/global/plugins/excanvas.min.js"></script>
<![endif]-->
<script src="${ctxResources}/global/scripts/metronic.js"
	type="text/javascript"></script>
<script src="${ctxResources}/layout/scripts/layout.js"
	type="text/javascript"></script>
<script src="${ctxResources}/layout/scripts/quick-sidebar.js"
	type="text/javascript"></script>
<script src="${ctxResources}/layout/scripts/layoutControl.js"
	type="text/javascript"></script>

<script>
	$.ajaxSetup({
		global : false,
		type : "POST",
		complete : function(XMLHttpRequest, textStatus) {
			var data = XMLHttpRequest.responseText;
			if (data == "timeout") {
				alert("\u767B\u5F55\u8D85\u65F6");
				window.location.href=ctx+"/";
			}
		}
	});
</script>