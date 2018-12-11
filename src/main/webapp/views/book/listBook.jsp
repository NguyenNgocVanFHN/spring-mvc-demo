<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div class="container" style="margin-top: 30px">
	<c:if test="${not empty msg}">
		<div class="alert alert-${css} alert-dismissible" role="alert">
			<button type="button" class="close" data-dismiss="alert"
				aria-label="Close">
				<span aria-hidden="true">&times;</span>
			</button>
			<strong>${msg}</strong>
		</div>
	</c:if>

	<div class="row md-col-8">
		<h2>Quản lí User</h2>
		<form action="searchActionUrl" method="GET" class="form-horizontal">
			<table>
				<tr>
					<th>Tên&nbsp;&nbsp;</th>
					<td><input name="fullname" class="form-control" /></td>
					<th style="padding-left: 28px;">Email&nbsp;&nbsp;</th>
					<td><input name="price" class="form-control" /></td>
					<td style="padding-left: 28px;"><button type="submit"
							class="btn">Tìm kiếm</button></td>
				</tr>
			</table>
		</form>
	</div>
	<div class="row" style="margin-top: 20px">
		<div class="md-col-8">
			<fieldset>
				<legend> </legend>
				<table class="table table-hover table-dark">
					<thead class="bg-primary">
						<tr>
							<th scope="col">#</th>
							<th scope="col">Username</th>
							<th scope="col">Tên</th>
							<th scope="col">Email</th>
							<th scope="col">Giới tính</th>
							<th scope="col">Ngày sinh</th>
							<th scope="col">Online?</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${listBook}" var="book" varStatus="count">
							<tr>
								<th scope="row">${count.index + 1}</th>
								<td>${book.name}</td>
								<td>${book.author.name}</td>
								<td>${book.price}</td>
								<td></td>
								<td></td>
								<td></td>
								<td><spring:url value="/user/${book.id}/detail"
										var="detailActionUrl" />
									<button class="btn btn-info"
										onclick="location.href='${detailActionUrl}'">Chi tiết</button>
									<spring:url value="/user/${book.id}/edit" var="editActionUrl" />
									<button class="btn btn-warning"
										onclick="location.href='${editActionUrl}'">Sửa</button> <spring:url
										value="/user/${student.id}/delete" var="deleteActionUrl" />
									<button class="btn btn-danger"
										onclick="location.href='${deleteActionUrl}'">Xóa</button></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</fieldset>
		</div>
	</div>
</div>
