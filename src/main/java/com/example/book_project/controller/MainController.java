package com.example.book_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/index")
    public String index() { return "index"; }

    @RequestMapping("/login")
    public String login() { return "login"; }

    @RequestMapping("/join")
    public String join() { return "join"; }

    @RequestMapping("/logout")
    public String logout() { return "logout"; }

    @RequestMapping("/myPage")
    public String myPage() { return "myPage"; }

}
