<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ include file="/header.html"%>
<body>
	<h1>Thanks for taking our survey!</h1>
	<p>Here is the information that you entered:</p>

	<label>Email:</label>
	<span>${user.email}</span>
	<br>
	<label>FirstName:</label>
	<span>${user.firstName}</span>
	<br>
	<label>LastName:</label>
	<span>${user.lastName}</span>
	<br>
	<label>DateOfBirth:</label>
	<span>${user.dateOfBirth}</span>
	<br>
	<label>Heard Form:</label>
	<span><%=request.getAttribute("heard")%></span>
	<br>
	<label>Updates:</label>
	<span><%=request.getAttribute("answer")%></span>
	<br>
	<label>Contact via:</label>
	<span><%=request.getAttribute("Contact")%></span>
	<br>

	<form action="index.jsp" method="post">
		<input type="hidden" name="action" value="join"> <input
			type="submit" value="Return">
	</form>

<%@ include file="/footer.jsp"%>