<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 31/10/2023
  Time: 14:09
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
        table{
            border-spacing: 15px;
        }
        input{
            height: 20px;
            width: 200px;
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
            <tr><td><h2>FORM SIGN UP</h2></td></tr>
            <tr><td><input type="text" name="username" placeholder="Enter the username"></td></tr>
            <tr><td><input type="password" name="password" placeholder="Enter the password"></td></tr>
            <tr><td><input type="text" name="phonenumber" placeholder="Enter the phone number"></td></tr>
            <tr><td><button class="btn-submit" type="submit">Sign Up</button></td></tr>
            </tbody>
        </table>
    </form>
</div>
</center>
</body>
</html>
