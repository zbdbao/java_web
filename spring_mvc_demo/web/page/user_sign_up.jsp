<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <title>Sign up page</title>
</head>
<body>
<h2>Register Information</h2>
<form:form method="POST" action="/user/signUp">
    <table>
        <tr>
            <td><form:label path="username">Name</form:label></td>
            <td><form:input path="username" /></td>
        </tr>
        <tr>
            <td><form:label path="birthday">Age</form:label></td>
            <td><form:input path="birthday" /></td>
        </tr>
        <tr>
            <td><form:label path="sex">Age</form:label></td>
            <td><form:input path="sex" /></td>
        </tr>
        <tr>
            <td><form:label path="emailAddress">Age</form:label></td>
            <td><form:input path="emailAddress" /></td>
        </tr>
        <tr>
            <td><form:label path="mobile">Age</form:label></td>
            <td><form:input path="mobile" /></td>
        </tr>
        <tr>
            <td><form:label path="country">Age</form:label></td>
            <td><form:input path="country" /></td>
        </tr>
        <tr>
            <td><form:label path="address">Age</form:label></td>
            <td><form:input path="address" /></td>
        </tr>
        <tr>
            <td><form:label path="postcode">Age</form:label></td>
            <td><form:input path="postcode" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Submit"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
