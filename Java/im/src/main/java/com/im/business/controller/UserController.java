package com.im.business.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Godlys
 * @since 2020-04-07
 */
@Controller
@RequestMapping("/user")
public class UserController {



    @RequestMapping("/s")
    @ResponseBody
    public String hello(){
        return "hello world";
    }

}
