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

        response.setHeader("Cache-Control","no-cache, no-store, must-validate");
        response.setHeader("Pragma","no-cache");//for Http older than 1.1
        response.setHeader("Expires","0");//Proxies
        if(session.getAttribute("uname")==null){
            response.sendRedirect("login.jsp");
        }
    %>
    <iframe width="560" height="315" src="https://www.youtube.com/embed/gQLQ0t9B5yk?si=E3i89Esy6ISQZ1iT" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
</body>
</html>
