<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Student List</title>
</head>
<body>
    <sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/users" user="root" password="yourpassword"/>

    <sql:query var="rs" dataSource="${db}">select * from user</sql:query>

    <c:forEach items="${rs.rows}" var="user">
        <c:out value="${user.userId}"></c:out> : <c:out value="${user.userName}"/>  <br>
    </c:forEach>
</body>
</html>
