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
    <script type="text/javascript" src="jquery.js"></script>
    <script type="text/javascript" src="http://ajax.microsoft.com/ajax/jQuery/jquery-1.11.0.min.js"></script>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    <style type="text/css">
        body {
            background: url(pictures/XO.png);
            background-repeat: no-repeat;
            background-position: center top;
        }
        .search {
            font-family: arial;
            padding: 250px;
        }
    </style>
</head>

<body>
<form class="form-inline" action="start" method="post">
    <div class="search" align="center">
        <input type="submit" id="buttonSearch" class="btn btn-primary" value="START">
    </div>
</form>
</body>
</html>
