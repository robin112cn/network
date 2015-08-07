<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<ul class="page-sidebar-menu  page-sidebar-menu-light" data-auto-scroll="true" data-slide-speed="200">
	<!-- BEGIN SIDEBAR MENU -->
	<li class="sidebar-toggler-wrapper">
		<!-- BEGIN SIDEBAR TOGGLER BUTTON -->
		<div class="sidebar-toggler hidden-phone">
		</div>
		<!-- BEGIN SIDEBAR TOGGLER BUTTON -->
	</li>
	<li style="margin-top:10px;"></li>

	${sessionScope.menustr}
</ul>
<!-- END SIDEBAR MENU -->