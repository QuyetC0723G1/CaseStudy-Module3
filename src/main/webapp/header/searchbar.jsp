<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/3/2023
  Time: 4:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="col-md-6">
    <div class="header-search">
        <form action="product" method="get">
            <input type="hidden" name="action" value="searchProduct">
            <select class="input-select" name="categoryId">
                <option value="0">All Categories</option>
                <c:forEach items="${listCategory}" var="category">
                    <option value="${category.id}">${category.name}</option>
                </c:forEach>
            </select>
            <input class="input" placeholder="Search here" name="searchstring">
            <button class="search-btn">Search</button>
        </form>
    </div>
</div>
</body>
</html>
