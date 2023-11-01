<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 01/11/2023
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport"
        content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Document</title>
  <style>
    img{
      height: 100%;
      width: 100%;
      object-fit: fill;
      display: block;
    }
    table {
      border-collapse: collapse; /* Loại bỏ khoảng cách giữa các ô */
      width: 70%; /* Đặt chiều rộng của bảng */
      height: fit-content;
      border: 1px solid #ccc; /* Đặt viền bảng */
    }
    table th {
      height: 50px;
      width: 200px;
    }
    th, td {
      border: 1px solid cadetblue;
      background-color: #f2f2f2; /* Màu nền bảng */
      width: 100px;
      height: 150px;
      text-align: center;
    }

    input {
      height: 20px;
      width: 200px;
      margin-bottom: 20px;
    }
    .back {
      margin-top: 20px;
      color: cornflowerblue;
    }
  </style>
</head>
<body>

<center>
  <h2>List Product In Store</h2>
  <form action="http://localhost:8080/product" method="get">
    <input type="hidden" name="action" value="home">
    <input type="text" name="q" placeholder="Search by Product Name">
    <input type="submit" value="Search">
  </form>
  <table>
    <tr>
      <th>Id</th>
      <th>Name</th>
      <th>Quantity</th>
      <th>Price</th>
      <th>Manufacture</th>
      <th>Category Id</th>
      <th>Image</th>
      <th>Description</th>
      <th colspan="2">Action</th>
    </tr>
    <c:forEach var="item" items="${listProduct}">
      <tr>
        <td>${item.id}</td>
        <td>${item.name}</td>
        <td>${item.quantity}</td>
        <td>${item.price}</td>
        <td>${item.manufacture}</td>
        <td>${item.categoryId}</td>
        <td><img src="${item.image}" alt=""></td>
        <td>${item.description}</td>
        <td><a href="http://localhost:8080/product?action=formedit&id=${item.id}"><button>Edit</button></a></td>
        <td><button onclick="show_confirm(${item.id})">Delete</button></td>
      </tr>
    </c:forEach>

  </table>
  <button class="back"><a href="http://localhost:8080/product?action=formadd">Add Product</a></button>
</center>
<script>
  function show_confirm(id){
    let r = confirm(`Are you sure ?`)
    if(r){
      document.location.href = "http://localhost:8080/product?action=delete&id=" + id;
    }
  }


</script>


</body>
</html>