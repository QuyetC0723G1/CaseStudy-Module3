<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 31/10/2023
  Time: 14:48
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

    <div class="container">
      <div class="row">
        <div class="col-12">
          <nav class="navbar navbar-expand-lg bg-color">
            <a class="navbar-brand" href="http://localhost:8080/product?action=productmanager">Home</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse formnav-bar" id="navbarSupportedContent" >
              <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                  <!--<a class="nav-link" href="#">Create Product <span class="sr-only">(current)</span></a>-->
                  <h2>FORM ADD PRODUCT</h2>
                </li>
              </ul>
            </div>
          </nav>
        </div>
        <div class="col-12 mt-3"  >
          <form action="http://localhost:8080/product?action=formadd" method="post">
            <div class="form-row" id="PPQ">
              <div>
                <label for="id">Product id</label>
                <input type="text" class="form-control" id="id" name="id" placeholder="Product id ">
              </div>
              <div>
                <label for="price">Price</label>
                <input type="text" class="form-control" id="price" name="price" placeholder="Price">
              </div>
              <div >
                <label for="quantity">Quantity</label>
                <input type="text" class="form-control" id="quantity" name="quantity" placeholder="Quantity">
              </div>
            </div>
            <div class="pm">
              <div class="form-group">
                <label for="name">Product name</label>
                <input type="text" class="form-control" id="name" name="name" placeholder="Product name">
              </div>

              <div class="form-group">
                <label for="manufacture">Manufacture</label>
                <input type="text" class="form-control" id="manufacture" name="manufacture" placeholder="Manufacture">
              </div>


            </div>


            <div class="form-row">

              <div class="form-group col-md-4">
                <label for="categoryId" >Category</label>
<%--                <select id="categoryId" class="form-control" name="categoryId" >--%>
<%--                  <c:forEach var="item" items="${categoryList}">--%>
<%--                    <option value="${item.id}">${item.name} </option>--%>

<%--                  </c:forEach>--%>

<%--                </select>--%>
                <input type="text" id="categoryId" name="categoryId" placeholder="Category">

              </div>

            </div>
            <div class="form-row">
              <label for="image">Product image</label>
              <input type="text" class="form-control" id="image" name="image" placeholder="Product image">
            </div>

            <div class="form-row">
              <label for="description">Description</label>
              <textarea name="description" id="description" placeholder="Description" cols="150" rows="2"></textarea>
            </div>

            <button type="submit" class="btn btn-primary" >Add Product</button>
          </form>

        </div>
      </div>
    </div>
</div>


</body>
</html>