<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<head>

	<title>Student Registration Form</title>
	
</head>

<body>
	<form:form action="processForm" modelAttribute = "student">

	First name: <form:input path = "firstName"/>

	<br></br>

	Last name: <form:input path = "lastName"/>

	<br></br>
	
	Country : 
	<form:select path = "country">
		<form:options items = "${student.countryOptions}"/>
		
	</form:select>	
	
	<br></br>
	
	II Country Form :
		<form:select path = "countryI">
	
<form:option value = "Poland" label = "Poland"/>
<form:option value = "Germany" label = "Germany"/>
<form:option value = "USA" label = "USA"/>
<form:option value = "Croatia" label = "Croatia"/>
<form:option value = "Spain" label = "Spain"/>
<form:option value = "Portugal" label = "Portugal"/>

	</form:select>	
	<br></br>
	Favourite Languages :
	Java <form:radiobutton path = "favoriteLanguage" value = "Java"/>
	C# <form:radiobutton path = "favoriteLanguage" value = "C#"/>
	C++ <form:radiobutton path = "favoriteLanguage" value = "C++"/>
	PHP <form:radiobutton path = "favoriteLanguage" value = "PHP"/>
	Ruby <form:radiobutton path = "favoriteLanguage" value = "Ruby"/>
	
<br></br>
	Operating Systems :
	
	Linux <form:checkbox path="operatingSystems" value = "Linux"/>
	Mac OS <form:checkbox path="operatingSystems" value = "Mac OS"/>
	MS Windows <form:checkbox path="operatingSystems" value = "MS Windows"/>
	
	
	<input type = "submit" value = "Submit"/>
	
	
	
</form:form>


</body>








</html>