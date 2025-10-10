<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
<head>
    <title>Student List</title>
</head>
<body>
    <c:set var="str" value="Karthik is a Java Developer"/>
    Length of the string is :${fn:length(str)}
    <br><br>
    <c:forEach items="${fn:split(str,' ')}" var="v">
        ${v}
        <br>
    </c:forEach>
    <br>
    
    Index of k is ${fn:indexOf(str, "k")}
    <br><br>

    <c:if test="${fn:contains(str, 'Java')}">
        Karthik is a Java Developer
    </c:if>
    <br><br>
    <c:if test="${!(fn:contains(str,'Python'))}">
        Karthik is not a python Developer!!
    </c:if>

    <br><br>

    <c:if test="${fn:endsWith(str,'Developer')}">
        Karthik is a Developer!!
    </c:if>
</body>
</html>
