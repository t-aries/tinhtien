<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 04/06/2019
  Time: 2:41 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
    <style>
      form{
        border: cornflowerblue 3px solid;
        padding: 10px;
        width: 400px;
        display: block;
        margin: auto;
      }
      #sub{
        margin-left: 30%;
        background-color: grey;
      }
    </style>
  </head>
  <body>
    <form method="post" action="calculation">
      <h1>Product Discount Calculator</h1>
      <table>
        <tr>
          <td>Product Description:</td>
          <td><input type="text" name="desc"></td>
        </tr>
        <tr>
          <td>Price List:</td>
          <td><input type="text" name="list"></td>
        </tr>
        <tr>
          <td>Discount Percent:</td>
          <td><input type="text" name="disc"></td>
        </tr>
      </table>
      <input id="sub" type="submit" value="Calculation Discount">
    </form>
  </body>
</html>
