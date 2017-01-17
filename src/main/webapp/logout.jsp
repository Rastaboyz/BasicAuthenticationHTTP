<%--
  Created by IntelliJ IDEA.
  User: vitaly94
  Date: 13/01/2017
  Time: 18:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    session.invalidate();
    response.sendRedirect("index.jsp");
%>
<html>
<head>
    <title>Logout</title>
</head>
<body>

</body>
</html>
