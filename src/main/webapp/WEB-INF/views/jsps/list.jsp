<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!-- Display table -->
<table class="table table-striped mt-4">
	<thead>
		<tr>
			<th scope="col">Employee Id</th>
			<th scope="col">Employee Name</th>
			<th scope="col">Employee Email</th>
			<th scope="col">Edit</th>
			<th scole="col">Delete</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${employees}" var="employee">
			<tr>
				<td>${employee.employeeId}</td>
				<td>${employee.employeeName}</td>
				<td>${employee.employeeEmail}</td>
				<td><i class="far fa-edit"
					data-toggle="modal" 
					data-target="#editModal"></i></td>
				<td><i class="far fa-trash-alt"
				onClick="location.href='delete/${ employee.employeeId }'"
				></i></td>
			</tr>
		</c:forEach>
	</tbody>
</table>