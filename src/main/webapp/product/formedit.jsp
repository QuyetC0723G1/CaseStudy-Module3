<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 01/11/2023
  Time: 14:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Home</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
  <link rel="stylesheet" href="../css/cssformadd.css">

</head>
<body>
<div class="menu">
  <form action="http://localhost:8080/product?action=formedit" method="post">
    <div class="container">
      <div class="row">
        <div class="col-12">
          <nav class="navbar navbar-expand-lg bg-color">
            <a class="navbar-brand" href="http://localhost:8080/product?action=home">Home</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse formnav-bar" id="navbarSupportedContent" >
              <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                  <!--<a class="nav-link" href="#">Create Product <span class="sr-only">(current)</span></a>-->
                  <h2>FORM EDIT PRODUCT</h2>
                </li>
              </ul>
              <div style="width: 40%; display: flex">
                <form>
                  <input class="form-control" type="search" placeholder="Search" aria-label="Search">
                  <button class="btn btn-outline-success ml-2" type="submit">Search</button>
                </form>
              </div>
            </div>
          </nav>
        </div>
        <div class="col-12 mt-3"  >
          <form action="http://localhost:8080/product?action=create" method="post">
            <div class="form-row" id="PPQ">
              <div>
                <label for="Product id">Product id</label>
                <input type="text" class="form-control" id="Product id" name="id" placeholder="Product id " value="${product.id}">

              </div>
              <div>
                <label for="Price">Price</label>
                <input type="text" class="form-control" id="Price" name="price" placeholder="Price" value="${product.price}">

              </div>
              <div >
                <label for="Quantity">Quantity</label>
                <input type="text" class="form-control" id="Quantity" name="quantity" placeholder="Quantity" value="${product.quantity}">

              </div>
            </div>
            <div class="pm">
              <div class="form-group">
                <label for="Product name">Product name</label>
                <input type="text" class="form-control" id="Product name" name="name" placeholder="Product name" value="${product.name}">

              </div>

              <div class="form-group">
                <label for="Manufacture">Manufacture</label>
                <input type="text" class="form-control" id="Manufacture" name="manufacture" placeholder="Manufacture" value="${product.manufacture}">
              </div>

            </div>
            <div class="form-row">

              <div class="form-group col-md-4">
                <label for="Category" >Category</label>
                <!--<select id="Category" class="form-control" name="categoryId" >-->
                <!--<c:forEach var="product" items="${categoryList}">-->
                <!--<option value="${product.id}">${product.name} </option>-->
                <!--</c:forEach>-->
                <!--</select>-->
                <input type="text" id="Category" name="categoryId" placeholder="Category" value="${product.categoryId}">
              </div>
            </div>
            <div class="form-row">
              <label for="Product image">Product image</label>
              <input type="text" class="form-control" id="Product image" name="image" placeholder="Product image" value="${product.image}">

            </div>

            <div class="form-row">
              <label for="Description">Description</label>
              <textarea name="description" id="Description" placeholder="Description" cols="150" rows="2" >${product.description}</textarea>

            </div>
            <input type="hidden" name="oldId" placeholder="Product id" value="${product.id}"></td>
            <button type="submit" class="btn btn-primary" >Edit Product</button>
          </form>

        </div>
      </div>
    </div>
  </form>
</div>

</body>
</html>