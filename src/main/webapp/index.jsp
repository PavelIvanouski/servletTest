<html>
<jsp:include page="meta.jsp" />
<body>
<jsp:include page="header.jsp" />
<h2>Hello World!</h2>

    <%
        Integer r = (int) (Math.random() * 100);
    %>
    <%
        out.println(r);
    %>

    <a href="http://localhost:8080/webappsample/users/list">Users list</a>
<jsp:include page="footer.jsp" />
</body>
</html>
