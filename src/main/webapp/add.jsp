<%--
  Created by IntelliJ IDEA.
  User: karthi-rs
  Date: 10/4/25
  Time: 8:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body bgcolor="#7fffd4">
    <%
        int a = Integer.parseInt(request.getParameter("num1"));
        int b = Integer.parseInt(request.getParameter("num2"));

        int c = a+b;

    %>
<h2>Sum is <%= c%></h2>
</body>
</html>
