package com.qf.springboot02.pojo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MyQuartz {

//    @Scheduled(cron="*/2 * * * * ? ")
    public void testQuartz(){
        System.out.println("testQuartz："+new Date().toLocaleString());
    }
}
