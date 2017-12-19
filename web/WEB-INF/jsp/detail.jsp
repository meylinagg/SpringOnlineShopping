<%-- 
    Document   : detail
    Created on : Dec 18, 2017, 1:39:57 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table>
            <tr>
                <td>
                    <img src="<c:url value="/resources/img/${product.image}"/>" height="180px;" width="180px;"/>
                </td>
            </tr>
            <tr>
                <td>
                    ${product.nameProduct}
                </td>
            </tr>
            <tr>
                <td>
                    ${product.description}
                </td>
            </tr>
            <tr>
                <td>
                    ${product.productPrice}
                </td>
            </tr>
            <tr>
                <td>
                    <a href="${pageContext.request.contextPath}/order/${product.id}">
                        <button type="submit">Pesan Sekarang</button>
                    </a>
                </td>
            </tr>
        </table>
                
    </body>
</html>
