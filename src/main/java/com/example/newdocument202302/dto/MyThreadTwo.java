package com.example.newdocument202302.dto;

public class MyThreadTwo implements Runnable{
    @Override
    public void run() {
        System.out.println("我是你创建的分线程002");
    }
}
