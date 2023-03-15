<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
    <title>MyPage</title>
</head>
<body>
<c:import url="header.jsp"></c:import>

<div class="wrap">

    <div class="myInfo">
        <p class="updateBtn" onclick="location.href='#'">정보 관리</p>
    </div>

    <div class="myMenu">
        <p class="dibs" onclick="location.href='#'">찜 목록</p>
        <p class="recent" onclick="location.href='#'">나의 서재</p>
        <p class="dibs" onclick="location.href='#'">마이 리뷰</p>
    </div>
</div>

</body>
</html>
