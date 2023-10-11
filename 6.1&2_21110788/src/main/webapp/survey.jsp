<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<c:import url="/header.html" />
<h1>Thanks for taking our survey</h1>
<p>Here is the information that you enter:</p>

<div class="container">
	<label>Email:</label> <span>${user.email}</span> <br> <label>FirstName:</label>
	<span>${user.firstName}</span> <br> <label>LastName:</label> <span>${user.lastName}</span>
	<br> <label>DateOfBirth:</label> <span>${user.dateOfBirth}</span>
	<br> <label>Heard From:</label> <span>${user.heardFrom}</span> <br>
	<label>Updates:</label> <span>${user.updates}</span> <br>
	<c:if test="${user.updates!='No' }">
		<label>Contact Via:</label>
		<span>${user.contactVia}</span>
		<br>
	</c:if>


	<p>To enter another email address, clock on the Back button in your
		browser or the Return button shown below.</p>

	<form action="index.jsp" method="post">
		<input type="hidden" name="action" value="join"> <input
			type="submit" value="Return" class="button">
	</form>

</div>

<c:import url="/footer.jsp" />

