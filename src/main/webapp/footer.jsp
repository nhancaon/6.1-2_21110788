<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@page import="java.util.GregorianCalendar,java.util.Calendar"%>
<%
GregorianCalendar currentDate = new GregorianCalendar();
int currentYear = currentDate.get(Calendar.YEAR);
%>
<p>
	&copy; Copyright
	 <c:if test="${currentDay!=null}">${currentDay}/</c:if><c:if test="${currentMonth!=null}">${currentMonth+1}/</c:if><%=currentYear%> Mike Murach &amp; Associates
</p>


</body>
</html>