<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/1/2023
  Time: 11:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="top-header">
    <div class="container">
        <ul class="header-links pull-left">
            <li><a href="#"><i class="fa fa-phone"></i> +021-95-51-84</a></li>
            <li><a href="#"><i class="fa fa-envelope-o"></i> email@email.com</a></li>
            <li><a href="#"><i class="fa fa-map-marker"></i> 1734 Stonecoal Road</a></li>
        </ul>
        <ul class="header-links pull-right">
            <c:if test="${sessionScope.user != null && sessionScope.user.role ==0}">
                <li><a href="product?action=productmanager"><i class="fa fa-desktop"></i>Manager</a></li>
            </c:if>
            <c:if test="${sessionScope.user == null}">
                <li><a href="user?action=login"><i class="fa fa-user-o"></i> Login</a></li>
            </c:if>

            <c:if test="${sessionScope.user != null}">
                <li><a href="logout"><i class="fa fa-user-o"></i> Logout</a></li>
            </c:if>

        </ul>
    </div>
</div>
</body>
</html>
