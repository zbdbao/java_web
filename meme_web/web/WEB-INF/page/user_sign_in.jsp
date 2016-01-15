<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<jsp:include page="generic_header.jsp"/>
<html>
<head>
    <jsp:include page="generic_include.jsp"/>
    <script type="text/javascript">
        $(document).ready(function(){
            $('#userName').attr('placeholder', '<spring:message code="view.user.username"/>');
            $('#password').attr('placeholder', '<spring:message code="view.user.password"/>');
        });
    </script>
</head>
<body>

<div class="wrapper">
    <div class="header">
    <div class="header-container">
        <jsp:include page="generic_logo.jsp"/>
        <div class="nav">
            <ul class="nav-main">
                <li><a href="<spring:message code="url.home"/>/user/goSignUp" ><spring:message code="view.user.signup"/></a></li>
            </ul>
        </div>
    </div>
    </div>

    <div class="global-content">

        <div class="auth-body-login">
            <div class="title">
                <h4><spring:message code="view.login.title"/></h4>
            </div>
            <div class="content">
                <form:form action="/user/signIn" modelAttribute="userLoginForm" method="post">
                    <div id="messageHint" class="error-msg"><form:errors path="*"></form:errors></div>
                    <ul>
                        <li>
                            <div class="input">
                                <span class="icon"><i></i></span>
                                <form:input path="userName" />
                            </div>
                        </li>
                        <li>
                            <div class="input">
                                <span class="icon"><i class="password"></i></span>
                                <form:password path="password" />
                            </div>
                        </li>
                        <li>
                            <div class="submit">
                                <input type="submit" value="Submit"/>
                            </div>
                        </li>
                    </ul>
                </form:form>
            </div>

        </div>
    </div>


    <jsp:include page="generic_footer.jsp"/>
    </div>
</body>
</html>
