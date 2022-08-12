<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>
<div class="sidenav">
	<h3 id="logo">
		Administrative <br /> Academy Portal
	</h3>
	<c:url var="classesLink" value="AdminControllerServlet">
		<c:param name="command" value="CLASSES" /><br/>
	</c:url>

	<c:url var="subjectsLink" value="AdminControllerServlet">
		<c:param name="command" value="SUBJECTS" /><br/>
	</c:url>

	<c:url var="teachersLink" value="AdminControllerServlet">
		<c:param name="command" value="TEACHERS" /><br/>
	</c:url>

	<c:url var="studentsLink" value="AdminControllerServlet">
		<c:param name="command" value="STUDENTS" /><br/>
	</c:url>
	<a class="bar-item" href="${classesLink}">Classes</a> <br/>
		<a class="bar-item" href="${subjectsLink}">Subjects</a><br/>
		<a class="bar-item" href="${teachersLink}">Teachers</a> <br/>
		<a class="bar-item" href="${studentsLink}">Students</a> <br/>
		<a class="bar-item" href="login.jsp">Log out</a><br/>

</div>
</body>
</html>