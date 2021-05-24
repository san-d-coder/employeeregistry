<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<jsp:include page="navbar.jsp" />  
<div class="container mt-4">		
<jsp:include page="createNew.jsp" />
<jsp:include page="list.jsp" />		
<jsp:include page="edit.jsp" />
</div>