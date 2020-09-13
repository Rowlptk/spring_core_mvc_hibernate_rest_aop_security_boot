<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<title>Progress List</title>

	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>
<div class="container">
	<h1 id="myHeader">My Progress Tracker</h1>
	
	<table id="myTable">
		<tr>
			<th>Date</th>
			<th>Duration</th>
		</tr>
		
		<c:forEach var="tempProgress" items="${progresslist}">
			<tr>
				<td>${tempProgress.date}</td>
				<td>${map.get(tempProgress.id)}</td>
			</tr>
		</c:forEach>
	
	</table>
</div>	
</body>
</html>