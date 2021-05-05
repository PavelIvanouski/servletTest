<%@ page import="by.pvt.model.User" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<jsp:include page="meta.jsp"/>
<body>

<jsp:include page="header.jsp"/>

<h2>Users List</h2>


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
        <tr>
            <th scope="row"><c:out value="${user.id}"/></th>
            <td><c:out value="${user.firstName}"/></td>
            <td><c:out value="${user.lastName}"/></td>
            <td>
                <a class="btn btn-primary"
                   href="http://localhost:8080/webappsample/users/delete?userId=<c:out value="${user.id}"/>">Delete</a>
            </td>
        </tr>
    </c:forEach>

    </tbody>
</table>
<a class="btn btn-primary" href="http://localhost:8080/webappsample/users/new">New user</a>
<jsp:include page="footer.jsp"/>
</body>
</html>
