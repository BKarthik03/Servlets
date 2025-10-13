<%--
  Created by IntelliJ IDEA.
  User: karthi-rs
  Date: 10/13/25
  Time: 6:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="addAlien" method="post">
        <fieldset>
            <legend>Add Alien</legend>
            Enter Alien Id:<input type="number" name="aId"><br>
            Enter Alien Name:<input type="text" name="aName"><br>
            Enter Tech:<input type="text" name="tech"><br>
            <input type="submit" value="Add">
        </fieldset>
    </form>
</body>
</html>
