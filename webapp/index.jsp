<%--
  Created by IntelliJ IDEA.
  User: John
  Date: 11.06.2017
  Time: 7:08
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
</head>

<body>
<form name=game>
    <table class="tbl" align="center">
        <tr>
            <td><a href="javascript:yourChoice('A')"><img src="pictures/o.gif" name=A></a></td>
            <td><a href="javascript:yourChoice('B')"><img src="pictures/o.gif" name=B></a></td>
            <td><a href="javascript:yourChoice('C')"><img src="pictures/o.gif" name=C></a></td>
        </tr>
        <tr>
            <td><a href="javascript:yourChoice('D')"><img src="pictures/o.gif" name=D></a></td>
            <td><a href="javascript:yourChoice('E')"><img src="pictures/o.gif" name=E></a></td>
            <td><a href="javascript:yourChoice('F')"><img src="pictures/o.gif" name=F></a></td>
        </tr>
        <tr>
            <td><a href="javascript:yourChoice('G')"><img src="pictures/o.gif" name=G></a></td>
            <td><a href="javascript:yourChoice('H')"><img src="pictures/o.gif" name=H></a></td>
            <td><a href="javascript:yourChoice('I')"><img src="pictures/o.gif" name=I></a></td>
        </tr>
    </table>
    <table class="tbl" align="center">
        <tr>
            <td><input type='button' value=" Новая игра " onClick="playAgain();"><br></td>
        </tr>
    </table>
</form>
</body>
</html>
