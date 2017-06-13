<%--
  Created by IntelliJ IDEA.
  User: John
  Date: 12.06.2017
  Time: 16:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Крестики-Нолики</title>
    <style>
        .tbl, .tbl td {
            border: 1px solid #82817D;
        }
    </style>
    <script src="functions.js"></script>
</head>

<body>
<form name=game>
    <table class="tbl" align="center">
        <tr>
            <td><a href="A"><img src="pictures/z.gif" name=A></a></td>
            <td><a href="B"><img src="pictures/z.gif" name=B></a></td>
            <td><a href="C"><img src="pictures/z.gif" name=C></a></td>
        </tr>
        <tr>
            <td><a href="D"><img src="pictures/z.gif" name=D></a></td>
            <td><a href="E"><img src="pictures/z.gif" name=E></a></td>
            <td><a href="F"><img src="pictures/z.gif" name=F></a></td>
        </tr>
        <tr>
            <td><a href="G"><img src="pictures/z.gif" name=G></a></td>
            <td><a href="H"><img src="pictures/z.gif" name=H></a></td>
            <td><a href="I"><img src="pictures/z.gif" name=I></a></td>
        </tr>
    </table>
    <table class="tbl" align="center">
        <tr>
            <td><input type='button' value=" Новая игра " onClick="playAgain();"><br></td>
            <td>${value}</td>
        </tr>
    </table>
</form>
</body>
</html>

