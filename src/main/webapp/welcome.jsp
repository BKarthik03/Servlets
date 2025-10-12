<%--
  Created by IntelliJ IDEA.
  User: karthi-rs
  Date: 10/12/25
  Time: 9:54 PM
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
    Welcome ${uname}!!
    <a href="videos.jsp">Videos here!!</a>

    <form action="Logout">
        <input type="submit" value="Logout">
    </form>
</body>
</html>
