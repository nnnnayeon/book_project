package com.example.book_project.controller;

import com.example.book_project.domain.UserRequestDto;
import com.example.book_project.domain.UserVO;
import com.example.book_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    // join
    @PostMapping("/joinUser")
    public void addUser(@RequestParam(name="user_id") String user_id,
                        @RequestParam(name="user_pw") String user_pw,
                        @RequestParam(name="name") String name,
                        @RequestParam(name="mobile") String mobile,
                        HttpServletResponse response){

        UserRequestDto user = new UserRequestDto(user_id, user_pw, name, mobile);

        String url = "";

        if(userService.readUserId(user.getUser_id()) == null) {
            userService.createUser(user);
            System.out.println("회원가입 성공");
            url = "/login";
        }
        else{
            System.out.println("아이디 중복");
            url = "/join";
        }

        try {
            response.sendRedirect(url);
        }catch(Exception e){
            e.printStackTrace();;
        }

    }

    // login
    @PostMapping("/loginUser")
    public void loginUser(@RequestParam(name="user_id") String user_id,
                          @RequestParam(name="user_pw") String user_pw,
                          HttpServletResponse response,
                          HttpServletRequest request){
        HttpSession session = request.getSession();

        UserRequestDto user = new UserRequestDto(user_id, user_pw);

        UserVO result = userService.readUserId(user.getUser_id());

        String url = "";

        if(result != null && result.getUser_id().equals(user_id) && result.getUser_pw().equals(user_pw)){
            session.setAttribute("log", result.getUser_no());
            session.setAttribute("userName", result.getName());

            System.out.println("log ==== " + result.getUser_no());
            System.out.println("유저이름 : " + result.getName());

            url = "/index";
            System.out.println("로그인 성공");
        } else{
            url = "/login";
            System.out.println("로그인 실패");
        }

        try {
            response.sendRedirect(url);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
