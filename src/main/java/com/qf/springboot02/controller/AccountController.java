package com.qf.springboot02.controller;

import com.qf.springboot02.pojo.Account;
import com.qf.springboot02.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class AccountController {

    @Autowired
    private AccountService accountService;
    @RequestMapping("/findAll")
    public List<Account> findAll(){
        List<Account> all = accountService.findAll();
        for (Account account : all) {
            System.out.println(account);
        }
        return all;
    }
}
