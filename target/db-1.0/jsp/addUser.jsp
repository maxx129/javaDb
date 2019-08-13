<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="../css/style.css" rel="stylesheet" type="text/css">
    <style><%@include file="../css/style.css" %></style>
    <title>Title</title>
</head>

<body>

    <div class="form-style-2">
        <div class="form-style-2-heading">
            <p>Please add user</p>
        </div>


        <form method="post" action="/db_war/users">

            <label for="first-name">First Name
                <input type="text" id="first-name" name="first-name">
            </label>

            <label for="last-name">Last name
                <input type="text" id="last-name" name="last-name">
            </label>

            <input type="submit" value="addUser">
        </form>
    </div>


</body>
</html>


