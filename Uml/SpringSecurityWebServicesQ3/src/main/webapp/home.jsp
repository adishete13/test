<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<h1> This is Login Page</h1>
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
