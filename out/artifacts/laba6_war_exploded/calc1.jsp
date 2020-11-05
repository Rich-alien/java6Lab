<%--
  Created by IntelliJ IDEA.
  User: misas
  Date: 24.11.2020
  Time: 8:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>FirstCalculator</h1>
<form action="firstCalculatorServlet" method="post">
    First value:
        <input name="val1"/>
    <br>
    Second value:
        <input name="val2"/>
    <br>
    Select action:
            <input type="radio" name="action" value ="add">+
            <input type="radio" name="action" value ="sub">-
            <input type="radio" name="action" value ="multi">*
            <input type="radio" name="action" value ="div">/
    <br>
    <input type="submit" value="Submit">

</form>
<br>
Result : <%=request.getAttribute("result")%>
</body>
</html>
