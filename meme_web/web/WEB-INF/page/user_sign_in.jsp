<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="generic_header.xjsp"/>
<html>
<head>
    <jsp:include page="generic_include.jsp"/>
    <script type="text/javascript">

    </script>
</head>
<body>
    <form action="/user/signIn" method="post">
        <div> Please input user name and password to login.</div>
        <div><spring:message code="view.user.username"/>
            <input name="userName" />
            <div id="userNameHint"><form:errors path="*" /></div>
        </div>
        <div><spring:message code="view.user.password"/>
            <input type="password" name="password" /><form:errors />
        </div>

        <div>
            <input type="submit" value="Submit"/>
        </div>
    </form>
<jsp:include page="generic_footer.xjsp"/>
</body>
</html>
