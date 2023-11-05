<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 02/11/2023
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>Simple Invoice Template | PrepBootstrap</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

    <link rel="stylesheet" type="text/css" href="../ordercss/bootstrap/css/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="../ordercss/font-awesome/css/font-awesome.min.css"/>

    <script type="text/javascript" src="../ordercss/js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="../ordercss/bootstrap/js/bootstrap.min.js"></script>
    <style>
        .col-md-12{
            margin-top: 40px;
        }
        .panel-body{
            margin-top: 40px;
        }
        table{
            margin-top: 30px;
        }
        .table > tbody > tr > .emptyrow {
            border-top: none;
        }
        .table > thead > tr > .emptyrow {
            border-bottom: none;
        }

        .table > tbody > tr > .emptyrow {
            border-top: 3px solid;
        }
    </style>
</head>
<body>

<div class="container">
    <div class="container">
        <div class="row">
            <div class="col-xs-12">
                <div class="text-center">
                    <i class="fa fa-search-plus pull-left icon"></i>
                    <h2>Invoice for purchase #33221</h2>
                </div>
                <hr>
            </div>
        </div>
        <div class="row">
            <div class="col-md-12">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3 class="text-center"><strong>Order summary</strong></h3>
                    </div>
                    <div class="panel-body">
                        <div class="table-responsive">
                            <table class="table table-condensed">
                                <thead>
                                    <tr>
                                        <td><strong>Item Name</strong></td>
                                        <td class="text-center"><strong>Item Price</strong></td>
                                        <td class="text-center"><strong>Item Quantity</strong></td>
                                        <td class="text-right"><strong>Total</strong></td>
                                    </tr>


                                </thead>
                                <tbody>
                                <c:forEach var="item" items="${listPick}">
                                <tr>
                                    <td>${item.name}</td>
                                    <td class="text-center">${item.price}</td>
                                    <td class="text-center">${item.quantity}</td>
                                    <td class="text-right">${item.price}</td>
                                </tr>
                                </c:forEach>

                                <tr>
                                    <td class="emptyrow"><i class="fa fa-barcode iconbig"></i></td>
                                    <td class="emptyrow"></td>
                                    <td class="emptyrow text-center"><strong><h4>Total</h4></strong></td>
                                    <td class="emptyrow text-right"><h4>${money}</h4></td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>


</div>

</body>
</html>