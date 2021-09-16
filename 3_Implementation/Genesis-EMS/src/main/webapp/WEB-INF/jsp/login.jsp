<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
        <form method="post" action="/login">
          <label for="usrname">Username</label>
          <br>
          <input type="text" id="usrname" name="usrname" placeholder="Enter your username" required >
          <br>
          <label for="psw">Password</label>
          <br>
          <input type="password" placeholder="Enter your password" id="psw" name="psw" required>
          <input type="submit" value="Submit">
          <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
        </form>
      </div>
</body>
</html>