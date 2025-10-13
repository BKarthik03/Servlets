<%--
  Created by IntelliJ IDEA.
  User: karthi-rs
  Date: 10/13/25
  Time: 5:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="getAlien" method="post">
        <fieldset>
            <legend>Alien</legend>
            Enter aID: <input type="number" name="aId" />
            <input type="submit" value="Submit" />
            <br>
            <br>
            <a href="addAlien.jsp">Want to add a new Alien? Click Me!!</a>
        </fieldset>
    </form>
</body>
</html>
