<%--
  Created by IntelliJ IDEA.
  User: misas
  Date: 07.12.2019
  Time: 9:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>SecondCalculator</h1>
<form action="${pageContext.request.contextPath}/secondCalculatorServlet" method="post">

    <% if (request.getAttribute("name2") != null) {%>
    Your name is:<%=request.getAttribute("name2")%>
    <br>
    <%} else {%>
    Enter name:
    <input name="name2">
    <br>
    <%}%>
    <br>
    Value:
    <input name="val3"/>
    <br>
    Select action:
    <input type="radio" name="action2" value="add">+
    <input type="radio" name="action2" value="sub">-
    <input type="radio" name="action2" value="multi">*
    <input type="radio" name="action2" value="div">/
    <br>
    <input type="submit" value="Submit">

</form>
<br>
Result : <%=request.getAttribute("result2")%>
</body>
</html>
