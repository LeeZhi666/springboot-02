package com.qf.springboot02.controller;

import com.qf.springboot02.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
@Api(description = "用户接口")
@Controller
@RequestMapping("/user")
public class UserController {

    @ApiOperation("查询所有")
    @RequestMapping("/findAll")
    public String findAll(Model model) {

        ArrayList<User> users = new ArrayList<>();

        users.add(new User(1001, "张三", "123", new Date()));
        users.add(new User(1002, "李四", "456", new Date()));
        users.add(new User(1003, "王五", "789", new Date()));

        model.addAttribute("users", users);

        return "/list";
    }
    @ApiOperation("通过id查询")
    @RequestMapping("findById")
    public String findById(Model model, String uid) {
        System.out.println(uid);

        if (uid.equals("1001")) {
            User user = new User(1001, "张三", "123", new Date());
            model.addAttribute("user", user);
        }
        if (uid.equals("1002")) {
            User user = new User(1002, "张三", "123", new Date());
            model.addAttribute("user", user);
        }
        if (uid.equals("1003")) {
            User user = new User(1003, "张三", "123", new Date());
            model.addAttribute("user", user);
        }

        return "/queryOne";

    }

}