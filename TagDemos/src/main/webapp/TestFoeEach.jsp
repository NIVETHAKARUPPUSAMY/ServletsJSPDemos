<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CITIES</title>
</head>
<body>
	<%
		String[] cities={"Mumbai","Singapore","India"};
		pageContext.setAttribute("mycities",cities);
	%>
	
	<c:forEach var ="city" items="${mycities }">
	${city}<br/>
	</c:forEach>
</body>
</html>