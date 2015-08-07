<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <head>
    	<jsp:include page="/WEB-INF/views/include/meta.jsp" />
    	<jsp:include page="/WEB-INF/views/include/taglib.jsp" />

        <title>ssologout...</title>
    </head>

    <script src="${ctxResources}/global/plugins/jquery.min.js" type="text/javascript"></script>
	<!-- <iframe width="0" height="0" src="http://10.8.40.148:8080/cas-server-webapp/logout"></iframe> -->
   	<script type="text/javascript">
   		jQuery(document).ready(function() {
   			var url=ssoserver + "/logout";//跨域url
   		    var ifr=document.createElement("iframe");//以下创建一个隐藏的iframe
   		    ifr.setAttribute("width",0);
   		    ifr.setAttribute("height",0);
   		    document.body.appendChild(ifr);
   		    ifr.src=encodeURI(url);
   		    //alert(url);
   		    //跳转到logout
   		    var logoutUrl = ctx + '/';
   		    setTimeout(function(){
   		    	location.href = logoutUrl;
   		    }, 100);

   		});
   	</script>
</html>
