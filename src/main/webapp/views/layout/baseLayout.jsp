<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras"
	prefix="tilesx"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="">
<meta name="author" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<spring:url value="/assets/css/bootstrap.min.css" var="bootstrapCss" />
<spring:url value="/assets/js/bootstrap.min.js" var="bootstrapJs" />
<spring:url value="/assets/js/jquery.min.js" var="jquery" />

<link rel="stylesheet" href="${bootstrapCss}" />
<script src="${jquery}" type="text/javascript"></script>
<script src="${bootstrapJs}" type="text/javascript"></script>

<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>
<body>
	<nav class="navbar navbar-default">
		<tiles:insertAttribute name="header" />
	</nav>

	<tiles:insertAttribute name="body" />

	<footer>
		<tiles:insertAttribute name="footer" />
	</footer>

</body>
</html>
