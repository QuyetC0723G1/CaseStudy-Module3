<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 31/10/2023
  Time: 14:48
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
  <form action="" method="post">
    <table>
      <tbody>

      <tr><td>FORM ADD PRODUCT</td></tr>
      <tr><td><input type="text" name="id" placeholder="Product id"></td></tr>
      <tr><td><input type="text" name="name" placeholder="Product name"></td></tr>
      <tr><td><input type="text" name="quantity" placeholder="Quantity"></td></tr>
      <tr><td><input type="text" name="price" placeholder="Price"></td></tr>
      <tr><td><input type="text" name="manufacturer" placeholder="Manufacturer"></td></tr>
      <tr><td><input type="text" name="categoryid" placeholder="Category"></td></tr>
      <tr><td><input type="text" name="image" placeholder="Product image"></td></tr>
      <tr><td><input type="text" name="description" placeholder="Description"></td></tr>
      <tr><td><button type="submit">Add Product</button></td></tr>

      </tbody>
    </table>
  </form>
</div>
</center>
</body>

</html>
