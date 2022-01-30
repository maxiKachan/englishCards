<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h3>Login page</h3>
<form method="post" action="login">
    <label>Username<input type="text" name="username"></label>
    <br>
    <label>Password<input type="text" name="password"></label>
    <br>
    <button type="submit">Login</button>
</form>
<form method="get" action="registration">
    <button type="submit">Registration</button>
</form>
</body>
</html>
