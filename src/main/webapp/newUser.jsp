<%@ page import="by.pvt.model.User" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="meta.jsp" />
<body>

<jsp:include page="header.jsp" />
<form action="/webappsample/users/new" method="post">
    <div class="form-group">
        <label for="fName">First name</label>
        <input type="text" class="form-control" id="fName" name="fName" placeholder="First name">
    </div>
    <div class="form-group">
        <label for="lName">Last name</label>
        <input type="text" class="form-control" id="lName" name="lName" placeholder="Last name">
    </div>
    <button type="submit" class="btn btn-primary">Create new user</button>
</form>




<jsp:include page="footer.jsp" />
</body>
</html>
