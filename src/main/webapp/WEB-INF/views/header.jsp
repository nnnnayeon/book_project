<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.book_project.domain.UserVO" %>
<html>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
    <script type="text/javascript" src="https://service.iamport.kr/js/iamport.payment-1.1.5.js"></script>
    <link rel="stylesheet" href="css/header.css">
    <title>Main</title>
    <title>header</title>
</head>
<body>
<%
    int log = -1;
    String userName = "";
    if(session.getAttribute("log") != null) {
        log = (Integer) session.getAttribute("log");
        System.out.println("log = " + log);

        userName = (String) session.getAttribute("userName");
        System.out.println("userNAME = " + userName);
    }
%>
<div class="t_header">
        <a href="/index" id="Logo">LOGO</a>

        <div class="topMenu">
            <%
                if(log == -1) {
            %>
            <p class="join" onclick="location.href='/join'">join</p>
            <p class="login" onclick="location.href='/login'">login</p>
            <%
                } else {
            %>
            <p class="userName"><%=userName%>님</p>
            <p class="logout" onclick="location.href='/logout'">logout</p>
            <%
                }
            %>
        </div>
    </div>

    <div class="b_headerWrap">
        <div class="b_header">
            <div class="o_botMenu">
                <p class="book" onclick="location.href='#'">book</p>
                <p class="board" onclick="location.href='#'">board</p>
            </div>
            <div class="t_botMenu">
                <p class="search">search</p>
                <p class="myPage" onclick="location.href='/myPage'">myPage</p>
            </div>
        </div>
    </div>

</body>
</html>
