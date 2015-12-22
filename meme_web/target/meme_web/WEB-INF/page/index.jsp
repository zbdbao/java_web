<jsp:include page="generic_header.xjsp"/>
<%--
  Created by IntelliJ IDEA.
  User: zhangb
  Date: 13/11/2015
  Time: 6:29 PM
  To change this template use File | Settings | File Templates.
--%>
<html>
  <head>
    <title></title>
  </head>
  <body>
  <form action="/user/goSignUp">

    <input type="submit" value="Sign up">
  </form>
  <form action="/user/goSignIn">

    <input type="submit" value="Sign in">
  </form>
  <form action="/json/userName/ceshi" method="post">

    <input type="submit" value="home">
  </form>

  <jsp:include page="generic_footer.xjsp"/>
  </body>
</html>
