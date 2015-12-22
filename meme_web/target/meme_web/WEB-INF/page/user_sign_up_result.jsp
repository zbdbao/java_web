<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<jsp:include page="generic_header.xjsp"/>
<html>
<head>
    <jsp:include page="generic_include.xjsp"/>
    <script type="text/javascript">


    </script>
</head>
<body>
<h2>Register </h2>
    <table>
        <tr>
            <td><spring:message code="view.user.username"/></td>
            <td>${user.userName}</td>
        </tr>
        <tr>
            <td><spring:message code="view.user.birthday"/></td>
            <td>${user.birthday}</td>
        </tr>
        <tr>
            <td><spring:message code="view.user.sex"/></td>
            <td>${user.sex}</td>
        </tr>
        <tr>
            <td><spring:message code="view.user.emailaddress"/></td>
            <td>${user.emailAddress}</td>
        </tr>
        <tr>
            <td><spring:message code="view.user.mobile"/></td>
            <td>${user.mobile}</td>
        </tr>
    </table>
    </body>
</html>
