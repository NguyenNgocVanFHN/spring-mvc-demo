<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<spring:url value="/admin" var="urlHome" />
<spring:url value="/admin/logout" var="logoutActionUrl" />

<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="${urlHome}">FEnglish</a>
		</div>
		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Quản lí User</a></li>
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#">Quản lí câu hỏi<span class="caret"></span></a>
				<ul class="dropdown-menu">
					<li><a href="#">Danh sách câu hỏi</a></li>
					<li><a href="#">Tạo câu hỏi mới</a></li>
				</ul></li>
			<li><a href="#">Quản lí bài đăng</a></li>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<!-- <li><a href="#"><span class="glyphicon glyphicon-user"></span>
					Sign Up</a></li> -->
			<li><a href="#">Hi, Admin</a></li>
			<li><a href="${logoutActionUrl}"><span class="glyphicon glyphicon-log-out"></span>
					Logout</a></li>
		</ul>
	</div>
</nav>