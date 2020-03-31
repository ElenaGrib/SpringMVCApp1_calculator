<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>

<body style="background-color: lightgreen">

<form method="POST">

    <input type="text" name="a" value="${a}"/>
    <input type="text" name="sign" value="${sign}"/>
    <input type="text" name="b" value="${b}"/>
    =
    <input type="submit">
    ${result}

</form>
</body>
</html>
