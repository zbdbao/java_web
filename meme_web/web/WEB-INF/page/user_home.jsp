<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="generic_header.jsp"/>
<html>
<head>
    <jsp:include page="generic_include.jsp"/>
    <script type="text/javascript">

    </script>
</head>
<body>
<div class="wrapper">
<div class="header">
    <div class="header-container">
        <jsp:include page="generic_logo.jsp"/>
        <div class="nav">
            <ul class="nav-main">
                <li><a href="<spring:message code="url.home"/>/user/signOut" ><spring:message code="view.user.signout"/></a></li>
            </ul>
        </div>
    </div>
</div>
Hello, ${GEN_USER.userName}

<c:forEach items="${targetList}" var="t">
    <div>${t.targetTittle}</div>
</c:forEach>


    <jsp:include page="generic_footer.jsp"/>
</div>
</body>
</html>
