<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/31
  Time: 9:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Reservation Query</title>
</head>
<body>
<form method="post">
    Court Name
    <input type="text" name="courtName" value="${courtName}">
    <input type="submit" value="Query">
</form>
</body>
<table border="1">
    <tr>
        <th>Court Name</th>
        <th>Date</th>
        <th>Hour</th>
        <th>Player</th>
    </tr>
    <c:forEach items="${reservations}" var="reservation">
        <tr>
            <td>${reservation.courtName}</td>
            <td><fmt:formatDate value="${reservation.dateAsUtilDate}" pattern="yyyy-MM-dd"/></td>
            <td>${reservation.hour}</td>
            <td>${reservation.player.name}</td>
        </tr>
    </c:forEach>
</table>
</html>