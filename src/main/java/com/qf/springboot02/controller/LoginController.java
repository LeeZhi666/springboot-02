package com.qf.springboot02.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filter")
public class LoginController {

    @RequestMapping("/dofilter")
    public void doFilter(){
        System.out.println("登录");
    }
}
