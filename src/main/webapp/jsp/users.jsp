<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
<head>
    <link href="../css/style.css" rel="stylesheet" type="text/css">

    <style><%@include file="../css/style.css" %></style>

    <title>Title</title>



</head>
<body>


<div class="form-style-2">
    <div class="form-style-2-heading">
        <p>Already registered</p>
    </div>
</div>

<table>
    <tr>
        <th>First Name</th>
    </tr>
    <c:forEach items="${usersFromServer}" var="user">
        <tr>
            <td>${user.firstName}</td>
        </tr>
    </c:forEach>
</table>

















</body>
</html>
