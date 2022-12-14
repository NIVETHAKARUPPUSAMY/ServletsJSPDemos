<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Students</title>
</head>
<div id="page" >
	<jsp:include page="left-list.jsp" />
		<div id="wrapper">
			<div id="header">
				<h3>Students</h3>
			</div>
		</div>
		<div id="container">
			<div id="content">
				<table>
					<tr>
						<th>Id</th>
						<th>First Name</th>
						<th>Last Name</th>
						<th>age</th>
					</tr>
					<c:forEach var="tempStudent" items="${STUDENT_LIST }">
						<tr>
						<td>${tempStudent.id}</td>
							<td>${tempStudent.fname}</td>
							<td>${tempStudent.lname}</td>
							<td>${tempStudent.age}</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>
</body>
</html>