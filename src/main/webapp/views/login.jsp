<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div class="container" style="margin-top: 50px">
	<div class="row">
		<div class="md-col-8">
			<form:form action="checkLogin" method="POST" modelAttribute="user">
				<form:input path="userName"/>
				<br/> <br/>
				<form:input path="passWord"/>
				<br/> <br/>
				<input type="submit" value="Login" /> 
			</form:form>
		</div>
	</div>
</div>