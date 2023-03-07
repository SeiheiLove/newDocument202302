package com.example.newdocument202302.dto;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {
    @Override
    public String call() throws Exception {
        System.out.println("我是你创建的分线程003");
        String number = "666";
        return number;
    }
}
