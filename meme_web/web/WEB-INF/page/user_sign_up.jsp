<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<jsp:include page="generic_header.xjsp"/>
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
<h2>Register </h2>
<form:form action="/user/signUp" commandName="user" method="post" >
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
    </body>
</html>
