<%--
  Created by IntelliJ IDEA.
  User: karthi-rs
  Date: 10/12/25
  Time: 9:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        if(session.getAttribute("uname")==null){
            response.sendRedirect("login.jsp");
        }
    %>
    https://www.youtube.com/watch?v=cYc3FjhMMzI&list=PLsyeobzWxl7pUPF2xjjJiG4BKC9x_GY46&index=32

</body>
</html>
