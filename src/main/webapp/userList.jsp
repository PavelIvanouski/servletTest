<%@ page import="by.pvt.model.User" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<jsp:include page="meta.jsp"/>
<body>

<fmt:setBundle basename="general" var="g"/>
<jsp:include page="header.jsp"/>

<h2><fmt:message key="users.list" bundle="${g}" /> </h2>

<c:choose>
    <c:when test="${requestScope.deleted == true}">
        <br>
        <h2> User deleted</h2>
        <br>
    </c:when>
    <c:otherwise>
        No previous operations made
    </c:otherwise>
</c:choose>
<table class="table">
    <thead>
    <tr>
        <th scope="col">#</th>
        <th scope="col">First</th>
        <th scope="col">Last</th>
        <th scope="col">Delete</th>
    </tr>
    </thead>
    <tbody>

    <c:forEach var="user" items="${requestScope.userList}">
        <c:set value="${user.id}" var="userId"  />
        <tr>
            <th scope="row"><c:out value="${user.id}"/></th>
            <td><c:out value="${user.firstName}"/></td>
            <td><c:out value="${user.lastName}"/></td>
            <td>
                <a class="btn btn-primary"
                   href="<c:url value="/users/delete"></c:url>?userId=${userId}">Delete</a>
            </td>
        </tr>
    </c:forEach>

    </tbody>
</table>
<a class="btn btn-primary" href="<c:url value="/users/new"></c:url>"><fmt:message key="users.new" bundle="${g}" /></a>
<jsp:include page="footer.jsp"/>
</body>
</html>
