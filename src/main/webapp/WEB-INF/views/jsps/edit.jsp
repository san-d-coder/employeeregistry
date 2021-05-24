<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!-- Edit Employee Modal -->

<div class="modal fade" id="editModal" tabindex="-1" role="dialog">
	<div class="modal-dialog modal-dialog-centered" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title" id="editModalLabel">Edit Employee</h5>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body">
				<form action="editEmployee" method="post">
					<div class="form-group">
						<label for="employeeName">Name</label> <input type="text"
							class="form-control" id="employeeName" name="employeeName"
							placeholder="Name">
					</div>
					<div class="form-group">
						<label for="employeeEmail1">Email address</label> <input
							type="email" class="form-control" id="employeeEmail"
							name="employeeEmail" placeholder="Enter email" />
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary"
							data-dismiss="modal">Close</button>
						<button type="submit" class="btn btn-primary">Save</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</div>