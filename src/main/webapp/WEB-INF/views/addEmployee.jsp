<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="insertEmployee" method="post">
employee id: <input type="number" name="eid"><br><br>
firstName: <input type="text" name="fname"><br><br>
	  lastName: <input type="text" name="lname"><br><br>
	    userName: <input type="text" name="uname"><br><br>
	   password: <input type="password" name="password"><br><br>
	   dateOfJoining;<input type="date" name="doj"><br><br>
	   gender: <input type="text" name="gender"><br><br>
	  dateOfBirth : <input type="date" name="dob"><br><br>
	   role: <input type="text" name="role"><br><br>
	  departmentId : <input type="number" name="did"><br><br>
	 empPhoto: <input type="image" name="pic"><br><br>
	 
	 Status: <select name="status">
<option value="active">Active</option>
<option value="inactive">Inactive</option>

</select><br><br>
<input type="submit" value="Register Employee">



</form>
</body>
</html>