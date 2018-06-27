<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>

<html>
<head>

	<title>Student Confirmation</title>
	
</head>

<body>

	The student is confirmed as : ${student.firstName} ${student.lastName}
	<br></br>
	Country : ${student.country} 
	<br></br>
	Another Country : ${student.countryI} 
	<br></br>
	Students favorite language : ${student.favoriteLanguage}
	<br></br>
	Operating systems : 
	<ul>
		<c:forEach var = "temp" items = "${student.operatingSystems}">
		<li> ${temp} </li>
		</c:forEach>
	</ul>

</body>

</html>