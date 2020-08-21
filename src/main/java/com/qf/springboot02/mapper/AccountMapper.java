package com.qf.springboot02.mapper;

import com.qf.springboot02.pojo.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountMapper {

     List<Account> findAll();
}
