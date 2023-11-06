<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 02/11/2023
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Shopping Cart</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
    <link rel="stylesheet" href="../css/cart.css?v=1">

</head>
<body>
<main class="page">

    <section class="shopping-cart dark">
        <div class="container">
            <div class="block-heading">
                <h1>Shopping Cart</h1>
                <br>
                <h4 style="color: #843534;">Hello ${requestScope.customerName}</h4>
            </div>
            <div class="content">
                <div class="row">
                    <div class="col-md-12 col-lg-8">
                        <div class="items">
                            <c:forEach var="item" items="${requestScope.carts}">
                                <div class="product">
                                    <div class="row">
                                        <div class="col-md-3">
                                            <img class="img-fluid mx-auto d-block image" src="${item.image}" alt="">
                                        </div>
                                        <div class="col-md-8">
                                            <div class="info">
                                                <div class="row">
                                                    <div class="col-md-5 product-name">
                                                        <div class="product-name">
                                                            <a href="#">${item.name}</a>
                                                            <div class="product-info">
                                                                <div>Display: <span
                                                                        class="value">${item.description}</span></div>

                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="col-md-4 quantity">
                                                        <label for="quantity">QUANTITY</label>
                                                        <input id="quantity" type="number" value="${item.quantity}"
                                                               class="form-control quantity-input">
                                                    </div>
                                                    <div class="col-md-3 price">
                                                        <span>$${item.price}</span>
                                                    </div>
                                                    <div>
                                                        <a href="http://localhost:8080/cart?action=delete&id=${item.id}"><button style="margin-left: 15px;color: #e7e7e7;border-radius: 4px;font-weight: bold;margin-top: 4px;outline: 0;border: 0;background-color: #f13535;box-shadow: -1px 0px 26px -4px rgba(0,0,0,0.75);">Delete</button></a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>

                    </div>
                    <div class="col-md-12 col-lg-4">
                        <div class="summary">
                            <h3>Summary</h3>
                            <div class="summary-item"><span class="text">Subtotal</span><span
                                    class="price">$${money}</span></div>
                            <div class="summary-item"><span class="text">Discount</span><span class="price">$0</span>
                            </div>
                            <div class="summary-item"><span class="text">Shipping</span><span class="price">$0</span>
                            </div>
                            <div class="summary-item"><span class="text">Total</span><span
                                    class="price">$${money}</span></div>
                            <a href="http://localhost:8080/order?action=createorder"><button class="btn btn-primary btn-lg btn-block">Checkout</button></a>
                        </div>
                    </div>
                </div>

            </div>
        </div>
    </section>
</main>
<script>
    function incrementValue() {
        var value = parseInt(document.getElementById('number').value, 10);
        value = isNaN(value) ? 0 : value;
        value++;
        document.getElementById('number').value = value;
    }
</script>
</body>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>
