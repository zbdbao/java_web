<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<jsp:include page="generic_header.jsp"/>
<%--
  Created by IntelliJ IDEA.
  User: zhangb
  Date: 13/11/2015
  Time: 6:29 PM
  To change this template use File | Settings | File Templates.
--%>
<html>
  <head>
    <jsp:include page="generic_include.jsp"/>
  </head>
  <body>
  <div class="wrapper">
  <div class="header">
    <div class="header-container">
      <jsp:include page="generic_logo.jsp"/>
      <div class="nav">
        <ul class="nav-main">
          <li><a href="<spring:message code="url.home"/>/user/goSignUp" ><spring:message code="view.user.signup"/></a></li>
          <li><a href="<spring:message code="url.home"/>/user/goSignIn" ><spring:message code="view.user.signin"/></a></li>
          <li><a href="<spring:message code="url.home"/>/json/userName/ceshi" target="_blank">Test user</a></li>
        </ul>
      </div>
    </div>
  </div>

  <jsp:include page="generic_footer.jsp"/>
  </div>
  </body>
</html>
