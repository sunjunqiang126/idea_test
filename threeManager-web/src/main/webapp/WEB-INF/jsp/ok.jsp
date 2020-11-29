<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/24 0024
  Time: 上午 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<html>
<head>

    <title>Title</title>
</head>
<body>
OKOK..............<br>
<c:forEach items="${users}" var="user">
    ${user.username}  &nbsp;&nbsp; ${user.id} &nbsp;&nbsp; ${user.pwd} <br>
</c:forEach>
</body>
</html>
