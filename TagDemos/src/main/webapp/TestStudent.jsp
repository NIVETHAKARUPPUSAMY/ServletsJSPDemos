<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List, TagDemo.Student" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student</title>
</head>
<body>

	<%
		List<Student> data = new ArrayList<>();
		data.add(new Student("John", "Doe"));
		data.add(new Student("Maxwell", "Johnson"));
		data.add(new Student("Mary", "Jones"));
		pageContext.setAttribute("mystudents", data);
	%>

	<c:forEach var="student" items="${mystudents}">
		${student.firstName} ${student.lastName}<br/>
	</c:forEach>	


</body>
</html>