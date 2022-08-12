<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Subjects</title>
</head>
	<div id="page">
		<jsp:include page="left-list.jsp" />
		<div id="wrapper">
			<div id="header">
				<h3>Subjects</h3>
			</div>
		</div>
		<div id="container">
			<div id="content">
				<table>
					<tr>
						<th>Name</th>
						<th>Id</th>
					</tr>
					<c:forEach var="tempSubject" items="${SUBJECTS_LIST }">
						<tr>
							<td>${tempSubject.name}</td>
							<td>${tempSubject.id}</td>			
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>
</body>
</html>