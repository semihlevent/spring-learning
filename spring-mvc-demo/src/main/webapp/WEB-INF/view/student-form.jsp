<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Student Registration Form</title>
	</head>
	<body>
		<form:form action="processForm" modelAttribute="student">
			First Name: <form:input path="firstName" />
			<br><br>
			Last Name: <form:input path="lastName" />
			<br><br>
			Country:
			<form:select path="country">
				<form:options items="${countries}" />
			</form:select>
			<br><br>
			Favorite Language:
			<form:radiobutton path="favoriteLanguage" value="java" label="Java" />
			<form:radiobutton path="favoriteLanguage" value="c#" label="C#" />
			<form:radiobutton path="favoriteLanguage" value="php" label="PHP" />
			<form:radiobutton path="favoriteLanguage" value="ruby" label="Ruby" />
			<br><br>
			Operating Systems:
			<form:checkbox path="operatingSystems" value="linux" label="Linux" />
			<form:checkbox path="operatingSystems" value="mac" label="Mac OS" />
			<form:checkbox path="operatingSystems" value="win" label="MS Windows" />
			
			<br><br>
			<input type="submit" value="Submit" />
		</form:form>
	</body>
</html>