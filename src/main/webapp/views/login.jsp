<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div class="container" style="margin-top: 50px">
	<div class="row">
		<div class="md-col-8">
			<form action="checkLogin" method="POST" modelAttribute="user">
				<span>Tên đăng nhập</span>
				<input type="text" />
				<br/> <br/>
				<span>Mật khẩu</span>
				<input type="password"/>
				<br/> <br/>
				<input type="checkbox" />
				<span>Lưu mật khẩu</span>
				<br/> <br/>
				<input type="submit" value="Đăng nhập" /> 
			</form>
		</div>
	</div>
</div>