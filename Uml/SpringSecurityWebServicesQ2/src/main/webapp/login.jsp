<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

	<form action="/login" method="post">
    <label for="username" class="form-label">Username</label>:
    <input type="text" id="username" class="form-control" name="username"><br>
    <p/>
    <label for="password" class="form-label">Password</label>:
    <input type="password" id="password" name="password" class="form-control"><br>
    <p/>
    <input type="submit" value="Login">
</form>

</body>
</html>