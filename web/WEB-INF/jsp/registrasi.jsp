<%-- 
    Document   : registrasi
    Created on : Dec 14, 2017, 1:28:44 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Regoistration Here!</title>
        <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="head.jsp"/>
        <div class="container">
            <div class="card">
                <div class="card-header">
                    Resistration Form
                </div>
        <form method="POST" action="register/save" modelAttribute="registerBean">
            <center>
                <table border="1" width="30%" cellpadding="5">
                    <thead>
                        <tr>
                            <th colspan="2">Enter Information Here</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>Full Name</td>
                            <td><input type="text" name="name" value="" /></td>
                        </tr>
                        <tr>
                            <td>Password</td>
                            <td><input type="password" name="password" value="" /></td>
                        </tr>
                        <tr>
                            <td>Number Handphone</td>
                            <td><input type="text" name="numberHp" value="" /></td>
                        </tr>
                        <tr>
                            <td>Email</td>
                            <td><input type="text" name="email" value="" /></td>
                        </tr>
                        <tr>
                            <td><input type="submit" value="Submit" /></td>
                            <td><input type="reset" value="Reset" /></td>
                        </tr>
                        <tr>
                            <td colspan="2">Already Registered!! <a href="login">Login Here !</a></td>
                        </tr>
                    </tbody>
            </center>
        </form>
        </div>
        </div>
    </body>
</html>
