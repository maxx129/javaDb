<%@ page import="java.util.ArrayList" %>
<%@ page import="ru.maxx129.model.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<%
    ArrayList<User> users = (ArrayList)request.getAttribute("usersFromServer");
%>

<table>

    <tr>
        <th>Date</th>
        <th>BirthDate</th>
    </tr>

    <% for (User user : users) {%>
    <tr>
        <td><%=user.getName()%></td>
        <td><%=user.getBirthDate()%></td>

    </tr>


    <% } %>

</table>



</body>
</html>
