<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" scope="request"/>
<c:set var="ctxResources" value="${pageContext.request.contextPath}/resources" scope="request"/>
<html>
    <head>

	<title>ssologin...</title>

	<script>
		var ctx = '${ctx}';
		var ctxResources = '${ctxResources}';
	</script>


    </head>
    <body>
    	<form id="sso" action="${ctx}/login" method="post">
		  <input type="hidden" name="username" value="${username}"/>
		  <input type="hidden" name="password" value=""/>
		  <input type="hidden" name="auth" value="${auth}"/>
		</form>
    </body>
    <script src="${ctxResources}/global/plugins/jquery.min.js" type="text/javascript"></script>

   	<script type="text/javascript">
   		jQuery(document).ready(function() {
   			$('#sso').submit();
   		});
   	</script>
</html>
