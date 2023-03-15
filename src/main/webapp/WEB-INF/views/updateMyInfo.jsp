<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
  <title>updateMyInfo</title>
</head>
<body>
<c:import url="header.jsp"></c:import>

<div class="updateMenu">
  <p class="updateMe" onclick="location.href='#'">내 프로필</p>
  <p class="updatePw" onclick="location.href='#'">비밀번호 변경</p>
  <p class="deleteMe" onclick="location.href='#'">회원탈퇴</p>
</div>


<div id="myContent">
  <h2 class="updateTitle">정보 변경</h2>
</div>
</body>
</html>
