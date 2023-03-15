<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
    <title>Join</title>
</head>
<body>
<c:import url="header.jsp"></c:import>

<div>
    <form id="join" method="post" action="/joinUser">
        <input type="text" name="user_id" id="user_id" placeholder="ID" required><br>
        <input type="password" name="user_pw" id="user_pw" placeholder="Password" required><br>
        <input type="text" name="name" id="name" placeholder="Name" required><br>
        <input type="text" name="mobile" id="mobile" pattern="[0-9]{3}-[0-9]{4}-[0-9]{4}" placeholder="Phone" required><br>

        <input type="submit" value="회원가입"><br>
        <input type="button" value="로그인" onclick="location.href='/login'">
    </form>
</div>

</body>
</html>
