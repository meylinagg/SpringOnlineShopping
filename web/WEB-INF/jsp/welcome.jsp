<%-- 
    Document   : welcome
    Created on : Dec 18, 2017, 4:15:33 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Online Shopping Kekinian</title>
        <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="head.jsp"/>
        <c:forEach var="mey" items="${produk}">
            <style>#tampilan:hover{border: 1 px solid grey}</style>
            <c:if test="${!empty sessionScope.user}">
                <a href="${pageContext.request.contextPath}/product/detail/${mey.id}">
            </c:if>
                <div id="tampilan" class="col-sm-4" style="text-align:center;">
                    <img src="<c:url value="/resources/img/${mey.image}"/>" height="180px;" width="180px;"/>
                    <h4>${mey.nameProduct}</h4>
                    <h5>${mey.description}</h5>
                    <h5 font color="red">Rp ${mey.productPrice}</h5>
                </div>
            </a>
</c:forEach>
    </body>
</html>
