<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<jsp:include page="generic_header.jsp"/>
<html>
<head>
    <jsp:include page="generic_include.jsp"/>
    <script type="text/javascript">
        var test = "";
        $(document).ready(function(){
            var userNameObj  = $("#userName");

            $(userNameObj).blur(function(e){
                var userName = $.trim($(userNameObj).val());
                if(userName == ""){
                    return;
                }

                $.ajax({
                    type: 'POST',
                    url: '/json/userName/'+ userName,
                    success:  function(response) {
                        $("#userNameHint").html('<spring:message code="user.userName.invalid.exist"/>');
                    }
                });
            });
            $(userNameObj).keydown(function(e){

                $("#userNameHint").html("");
            });

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
                    <li><a href="<spring:message code="url.home"/>/user/goSignIn" ><spring:message code="view.user.signin"/></a></li>
                </ul>
            </div>
        </div>
    </div>
    <div class="global-content">
        <div class="register-content">
            <h2>Register </h2>
            <form:form action="/user/signUp" modelAttribute="user" method="post" >
                <table>
                    <tr>
                        <td><spring:message code="view.user.username"/></td>
                        <td><form:input path="userName" /><div id="userNameHint"><form:errors path="userName"></form:errors></div> </td>
                    </tr>
                    <tr>
                        <td><spring:message code="view.user.password"/></td>
                        <td><form:password path="password" /><form:errors path="*" /></td>
                    </tr>
                    <tr>
                        <td><spring:message code="view.user.passwordConfirm"/></td>
                        <td><form:password path="passwordConfirm" /></td>
                    </tr>
                    <tr>
                        <td><spring:message code="view.user.birthday"/></td>
                        <td><form:input path="birthday" /><form:errors path="birthday" /></td>
                    </tr>
                    <tr>
                        <td><spring:message code="view.user.sex"/></td>
                        <td><form:radiobuttons path="sex" items="${sexMap}" delimiter="&nbsp;" /></td>
                    </tr>
                    <tr>
                        <td><spring:message code="view.user.emailaddress"/></td>
                        <td><form:input path="emailAddress" /></td>
                    </tr>
                    <tr>
                        <td><spring:message code="view.user.mobile"/></td>
                        <td><form:input path="mobile" /></td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <input type="submit" value="Submit"/>
                        </td>
                    </tr>
                </table>
            </form:form>
        </div>
    </div>

    <jsp:include page="generic_footer.jsp"/>
</div>
</body>
</html>
