<%-- 
    Document   : successlogin
    Created on : Dec 15, 2017, 4:24:21 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="<c:url value="/resources/css/bootstrap.css"/>" rel="stylesheet">
    </head>
    <body>
        <h1 class="jumbotron">Hello World!</h1>
        <c:forEach var="mey" items="${produk}">
            <div class="col-sm-4">
                <h1>${mey.nameProduct}</h1>
                <h1>${mey.image}</h1>
                <img src="<c:url value="/resources/img/${mey.image}"/>" height="180px;" width="180px;"/>    
            </div>
        </c:forEach>
    </body>
</html>
