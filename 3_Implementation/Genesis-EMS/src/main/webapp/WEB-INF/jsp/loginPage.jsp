<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<style>
input {
  width: 20%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  margin-top: 15px;
  margin-bottom: 16px;
}

input[type=submit] {
width: 200px;
  background-color: #04AA6D;
  color: white;
}
.container {
  background-color: #DC143C;
  padding: 20px;
  width: 100%;
  text-align: center;
}

</style>
</head>

<body>

<h1 style="text-align:center">Welcome To Login Page</h1>
<a href="submit">Submitttt</a>





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