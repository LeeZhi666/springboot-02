package com.qf.springboot02.handler;

import com.qf.springboot02.exception.MyException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
//拦截异常
@RestControllerAdvice
public class MyExceptionHandler {
    //处理指定异常
    @ExceptionHandler(value = Exception.class)
    public Object handler1(Exception e, HttpServletRequest request){
        System.out.println("handler1");

        HashMap<String, Object> map = new HashMap<>();
        map.put("msg",e.getMessage());
        map.put("url",request.getRequestURL());
        return map;
    }
    @ExceptionHandler(value = MyException.class)
    public Object handler2(MyException e, HttpServletRequest request){
        System.out.println("handler2");

        HashMap<String, Object> map = new HashMap<>();
        map.put("msg",e.getMessage());
        map.put("url",request.getRequestURL());
        return map;
    }
}
