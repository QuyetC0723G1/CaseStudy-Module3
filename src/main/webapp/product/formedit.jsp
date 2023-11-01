<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 01/11/2023
  Time: 14:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Title</title>
  <style>
    table{
      border-spacing: 15px;
    }
    input{
      height: 30px;
      width: 250px;
    }
    tbody{
      text-align: center;
    }
    .menu {
      width: 100%;
      height: 100%;
      background-color: #B9BABC;
    }
    h2{
      color: #3FB8AF;
    }
    body, center, .menu {
      height: 800px;
    }
  </style>
</head>
<body>
<center>
  <div class="menu">
    <form action="http://localhost:8080/product?action=formedit" method="post">
      <table>
        <tbody>

        <tr><td>FORM EDIT PRODUCT</td></tr>
        <tr><td><input type="text" name="id" placeholder="Product id" value="${product.id}"></td></tr>
        <tr><td><input type="text" name="name" placeholder="Product name" value="${product.name}" ></td></tr>
        <tr><td><input type="text" name="quantity" placeholder="Quantity" value="${product.quantity}"></td></tr>
        <tr><td><input type="text" name="price" placeholder="Price" value="${product.price}"></td></tr>
        <tr><td><input type="text" name="manufacture" placeholder="Manufacture" value="${product.manufacture}"></td></tr>
        <tr><td><input type="text" name="categoryId" placeholder="Category" value="${product.categoryId}"></td></tr>
        <tr><td><input type="text" name="image" placeholder="Product image" value="${product.image}"></td></tr>
        <tr><td><input type="text" name="description" placeholder="Description" value="${product.description}"></td></tr>
        <tr><td><input type="hidden" name="oldId" placeholder="Product id" value="${product.id}"></td></tr>
        <tr><td><button type="submit">EDIT Product</button></td></tr>

        </tbody>
      </table>
    </form>
  </div>
</center>
</body>

</html>

