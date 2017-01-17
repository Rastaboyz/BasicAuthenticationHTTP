<%--
  Created by IntelliJ IDEA.
  User: vitaly94
  Date: 13/01/2017
  Time: 18:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FORM BASIC</title>
</head>
<body>
    <h2>Login Demo Using j_security_check</h2>
    <form name="loginForm" method="POST" action="j_security_check">
        <p>User name: <input type="text" name="j_username" size="20"/></p>
        <p>Password: <input type="password" size="20" name="j_password"/></p>
        <p>  <input type="submit" value="Iniciar sesion"/></p>
    </form>
</body>
</html>
