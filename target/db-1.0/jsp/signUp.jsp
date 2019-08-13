<%@ page import="java.util.ArrayList" %>
<%@ page import="ru.maxx129.model.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
<head>
    <link href="../css/style.css" rel="stylesheet" type="text/css">

    <style><%@include file="../css/style.css" %></style>

    <title>Title</title>



</head>
<body>


<table>
    <tr>
        <th>Date</th>
        <th>BirthDate</th>
    </tr>
    <c:forEach items="${usersFromServer}" var="user">
        <tr>
            <td>${user.name}</td>
            <td>${user.birthDate}</td>
        </tr>
    </c:forEach>
</table>



<div class="form-style-2">
    <div class="form-style-2-heading">
        <p>Please sign up</p>
    </div>


    <form method="post" action="/jspExamples_war/signUp">
        <label for="name">Name
            <input type="text" id="name" name="name">
        </label>

        <label for="birthDate">BirthDate
            <input type="text" id="birthDate" name="birthDate">
        </label>

        <label for="password">Password
            <input type="password" id="password" name="password">
        </label>

        <input type="submit" value="signUp">
    </form>
</div>














</body>
</html>
