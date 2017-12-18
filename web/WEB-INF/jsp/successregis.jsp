<%-- 
    Document   : successregis
    Created on : Dec 15, 2017, 2:48:45 PM
    Author     : user
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Success Regis</title>
        <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="head.jsp"/>
        <div class="container">
            <h1>Registration Success</h1>
             ${data.name}
            <p>
                <a href="${pageContext.request.contextPath}/login">Login</a>
            </p>
        </div>
    </body>
</html>
