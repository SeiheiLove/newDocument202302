package com.example.newdocument202302;

import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TestSpring {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void springCreateBeam(){
        //创建spring容器
        //执行代码场景
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();

        //读取XML文件
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext();

//        ApplicationContext applicationContext = new ApplicationContext();

    }

    @Test
    public void two() throws IOException {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("key1","value1");
        concurrentHashMap.put("key2","value2");
        concurrentHashMap.put("key3","value3");



        OutputStream outputStream = new OutputStream() {
            @Override
            public void write(int b) throws IOException {

            }
        };
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);

//            ((ConcurrentHashMap<?, ?>) concurrentHashMap).writeObject(objectOutputStream);
        String key1 = (String) concurrentHashMap.get("key1");


    }


    @Test
    public void twoTest(){
        String string = new String();
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();
        Map<Object, Object> objectObjectHashMap = new HashMap<>();
    }

    @Test
    public void test3(){

        logger.debug("测试日志打印");
        logger.error("异常日志打印");
        logger.info("正常日志打印");

    }

}
