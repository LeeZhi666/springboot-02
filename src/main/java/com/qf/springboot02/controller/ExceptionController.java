package com.qf.springboot02.controller;

import com.qf.springboot02.exception.MyException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ExceptionController {
    @RequestMapping("/exception")
    public void exception(){
        int i = 1 / 0;
//        return "exception";
    }
    @RequestMapping("/myexception")
    public Object myexception() throws MyException {

        throw new MyException("自定义异常");
    }
}
