<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: matebook
  Date: 2022/12/10
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>list页面测试</title>
</head>
<body>
<h1>123123</h1>
<c:forEach items="${list}" var="li">
    <p>${li.id}</p>
    <p>${li.dept_name}</p>
    <p>${li.major_name}</p>
    <p>${li.phone}</p>
    <p>${li.email}</p>
</c:forEach>

</body>
</html>
