<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>


<!-- Create New Button -->
<div class="row">
	<div class="col text-center">
		<button type="button" class="btn btn-primary text-center"
			data-toggle="modal" data-target="#createNewModal">Create New
			Employee</button>
	</div>
</div>

<!-- Create New Employee Modal -->
<div class="modal fade" id="createNewModal" tabindex="-1" role="dialog">
	<div class="modal-dialog modal-dialog-centered" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title" id="exampleModalLabel">Create Employee</h5>
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<div class="modal-body">
				<form action="createEmployee" method="post">
					<div class="form-group">
						<label for="exampleInputPassword1">Name</label> <input type="text"
							class="form-control" name="employeeName"
							placeholder="Name">
					</div>
					<div class="form-group">
						<label for="employeeEmail1">Email address</label> <input
							type="email" class="form-control"
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
