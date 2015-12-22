<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<jsp:include page="generic_header.xjsp"/>
<html>
<head>
    <jsp:include page="generic_include.jsp"/>
    <script type="text/javascript">

    </script>
</head>
<body>

    <div> Hello, welcome ${GEN_USER.userName}</div>
    <form action="/user/signOut" method="post">
        <input type="submit">
    </form>

<jsp:include page="generic_footer.xjsp"/>
</body>
</html>
