package com.manyatkin.springioex.ioex123;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
//don't forget it
public class Scheduller {

    @Scheduled(fixedRate = 1000)
    public void printTime(){
        System.out.println(new Date());

    }
}
