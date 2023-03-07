package com.example.newdocument202302.dto;

public class MyThread extends Thread{

    @Override
    public void run() {
        //自己需要的业务逻辑
        System.out.println("我是自己定义的线程001号，准备执行你需要的功能");
    }
}
