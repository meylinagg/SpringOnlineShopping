<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
<div class="container">
    <div class="jumbotron">
        <center><h3>Welcome to Online Shopping Bag CukMeow</h3></center>
        <p><marquee>You Can Choose Anything For Good Day</marquee></p>
        <div><a href="${pageContext.request.contextPath}"></a></div>
        <c:if test="${empty sessionScope.user}">
            <div><a href="${pageContext.request.contextPath}/login"><button>Login</button><button>Registration</button></a></div>
        </c:if>
        <c:if test="${!empty sessionScope.user}">
            <div><a href="${pageContext.request.contextPath}/login/logout"><button>Logout</button></a></div>
        </c:if>
    </div>
</div>