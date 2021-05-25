$(document).ready(function(){
	$("tr.table-row").click(function(){
		var elementId = $(this).find('#Id').val(); //take the row selection
		var url = window.location.origin;
		var appName = "employeeregistry/api/edit";
		var pageUrl = url + "/" + appName + "/" + elementId;
		var actionUrl = "editEmployee/";
		$.ajax({
			type: 'GET',
			url: pageUrl,
			success: function(employee){
				$('#employeeId').val(employee.employeeId);
				$("#employeeName").val(employee.employeeName);
				$("#employeeEmail").val(employee.employeeEmail);
				actionUrl = actionUrl + employee.employeeId;
				$("#editForm").attr('action',actionUrl)
			}
		});
	})
});