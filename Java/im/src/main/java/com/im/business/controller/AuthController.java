package com.im.business.controller;

import com.im.business.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/auth")
public class AuthController {

    private String ctx = "/im";
    @Autowired
    private AuthService authService;


    //https://www.cnblogs.com/huanchupkblog/p/10634510.html
    @GetMapping(value = "/logins")
    public String logins(Model model) throws AuthenticationException {
        model.addAttribute("ctx",ctx);
        return "logins";
    }
    /**
     * 登录
     */
    @PostMapping(value = "/login")
    public String login( String username,String password, Model model) throws AuthenticationException {
        model.addAttribute("ctx",ctx);
        // 登录成功会返回Token给用户
        model.addAttribute("token",authService.login( username, password ));
        return "index";
    }

    @PostMapping(value = "/user/hi")
    @ResponseBody
    public String userHi( String name ) throws AuthenticationException {
        return "hi " + name + " , you have 'user' role";
    }

    @PostMapping(value = "/admin/hi")
    @ResponseBody
    public String adminHi( String name ) throws AuthenticationException {
        return "hi " + name + " , you have 'admin' role";
    }


}
