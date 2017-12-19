<%-- 
    Document   : successlogin
    Created on : Dec 15, 2017, 4:24:21 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="<c:url value="/resources/css/bootstrap.css"/>" rel="stylesheet">
        <link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="head.jsp"></jsp:include>
        Keranjang = ${totals}<br/>
        <c:forEach var="dataHarga" items="${sessionScope.cart.isiKeranjang.values()}">
            <c:set var="jumlahHargaTotalBelanjaOnline" value="${jumlahHargaTotalBelanjaOnline + dataHarga.produk.productPrice}"></c:set>
        </c:forEach>
        Jumlah Biaya = ${jumlahHargaTotalBelanjaOnline};
        <jsp:include page="content.jsp"></jsp:include>
    </body>
</html>
