<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: zhangb
  Date: 16/11/2015
  Time: 6:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Visit result</title>
</head>
<body>
<h2>Visit result</h2>
    <table>
        <tr>
            <td>Name</td>
            <td>${name}</td>
        </tr>
        <tr>
            <td>Age</td>
            <td>${age}</td>
        </tr>
        <tr>
            <td>ID</td>
            <td>${id}</td>
        </tr>
    </table>
</body>
</html>
