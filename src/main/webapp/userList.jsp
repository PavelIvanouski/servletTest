<%@ page import="by.pvt.model.User" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="meta.jsp" />
<body>

<jsp:include page="header.jsp" />

<h2>Users List</h2>

    <%
        List<User> users = (List<User>) request.getAttribute("userList");
    %>
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
        <%
            for (User user:users) {
        %>
        <tr>
            <th scope="row"><%= user.getId()%></th>
            <td><%= user.getFirstName()%></td>
            <td><%= user.getLastName()%></td>
            <td>
                <a class="btn btn-primary" href= "http://localhost:8080/webappsample/users/delete?userId=<%=user.getId() %>">Delete</a>
            </td>
        </tr>
        <%
            }
        %>
        </tbody>
    </table>
<a class="btn btn-primary" href= "http://localhost:8080/webappsample/users/new">New user</a>
<jsp:include page="footer.jsp" />
</body>
</html>
