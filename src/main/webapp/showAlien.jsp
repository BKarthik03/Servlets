<%@ page import="Model.Alien" %><%--
  Created by IntelliJ IDEA.
  User: karthi-rs
  Date: 10/13/25
  Time: 6:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body bgcolor="#f5deb3">
    <%
        Alien a = (Alien)request.getAttribute("alien");
        out.println(a);
    %>
</body>
</html>
