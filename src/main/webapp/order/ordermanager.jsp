<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 02/11/2023
  Time: 11:43
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
  <h2>List Order</h2>
  <form action="http://localhost:8080/order" method="get">
    <input type="hidden" name="action" value="orderlist">
    <input type="text" name="q" placeholder="Search by Order Id">
    <input type="submit" value="Search">
  </form>
  <table>
    <tr>
      <th>Id</th>
      <th>Customer Id</th>
      <th>Date</th>
      <th>Total Amount</th>
      <th>Status</th>
      <th colspan="2">Action</th>
    </tr>
    <c:forEach var="item" items="${orderlist}">
      <tr>
        <td>${item.id}</td>
        <td>${item.customerId}</td>
        <td>${item.date}</td>
        <td>${item.totalAmount}</td>
        <td>${item.status}</td>
        <td><a href="http://localhost:8080/product?action=formedit&id=${item.id}"><button>Edit</button></a></td>
        <td><button onclick="show_confirm('${item.id}')">Delete</button></td>
        <a href="http://localhost:8080/product?action=delete&id=${item.id}" id="delete" style="display: none">AAA</a>
      </tr>
        </c:forEach>

  </table>
  <button class="back"><a href="http://localhost:8080/product?action=formadd">Add Product</a></button>
</center>

<script>
  function show_confirm(id){
    let r = confirm(`Are you sure ?`)
    if(r){
      document.getElementById('delete').click();
    }
  }


</script>


</body>
</html>
