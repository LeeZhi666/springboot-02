package com.qf.springboot02.service.impl;

import com.qf.springboot02.mapper.AccountMapper;
import com.qf.springboot02.pojo.Account;
import com.qf.springboot02.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;
    @Override
    public List<Account> findAll() {
        return accountMapper.findAll();
    }
}
