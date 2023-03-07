package com.example.newdocument202302;

import com.example.newdocument202302.dto.MyCallable;
import com.example.newdocument202302.dto.MyThread;
import com.example.newdocument202302.dto.MyThreadTwo;
import com.example.newdocument202302.dto.UserDTO;
import com.sun.org.apache.xpath.internal.operations.String;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import net.minidev.json.JSONObject;
import org.apache.catalina.User;
import org.junit.Test;

import java.io.File;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;

public class TestString {

    @Test
    public void one(){
        String string = new String();
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();
    }


    /**
     * collection集合父接口
     */
    @Test
    public void two(){
        /**
         * list子接口
         *
         * ArrayList实现类 16  16*1.5
         * LinkedList实现类 链表
         * Vector实现类 线程安全
         */
        List<java.lang.String> objects = new ArrayList<>();

        LinkedList<Object> objects1 = new LinkedList<>();

        Vector<Object> objects2 = new Vector<>();

        /**
         * set子接口
         *
         * HashSet实现类
         *
         */
        HashSet<Object> objects3 = new HashSet<>();

        LinkedHashSet<Object> objects4 = new LinkedHashSet<>();

        TreeSet<Object> objects5 = new TreeSet<>();


        /**
         * Map接口
         *
         *
         *
         */
        Map<java.lang.String, Object> map = new HashMap<>();
        map.put("key1","111");
        map.put("key2","222");
        map.put("key3","333");
        System.out.println(JSONObject.toJSONString(map));


        TreeMap<Object, Object> objectObjectTreeMap = new TreeMap<>();

    }

    /**
     * IO流
     */
    @Test
    public void four(){
        File file = new File("E:\\测试IO流文本22.txt");
        System.out.println(file.length());

    }


    /**
     * 多线程
     * 四种创建方式
     *
     */
    @Test
    public void five(){
        //自定义一个类继承Thread类,重写run()  主线程和分线程是没有规定先后顺序执行的,可能分线程先执行
        MyThread myThread = new MyThread();
        long l = System.currentTimeMillis();
        System.out.println("我是主线程000" + l);
        myThread.start();//多线程
        long l1 = System.currentTimeMillis();
        System.out.println("我是主线程000" + l1);
    }

    /**
     * 主线程和分线程是没有规定先后顺序执行的,可能分线程先执行
     */
    @Test
    public void six(){
        MyThreadTwo myThreadTwo = new MyThreadTwo();
        long l = System.currentTimeMillis();
        System.out.println("我是主线程001" + l);
        Thread thread = new Thread(myThreadTwo);
        thread.start();
        long l1 = System.currentTimeMillis();
        System.out.println("我是主线程001" + l1);
    }

    @Test
    public void serven(){

        MyCallable myCallable = new MyCallable();
        long l = System.currentTimeMillis();
        System.out.println("我是主线程001" + l);
        FutureTask futureTask = new FutureTask<>(myCallable);
        Thread thread = new Thread(futureTask);
        thread.start();
        long l1 = System.currentTimeMillis();
        System.out.println("我是主线程001" + l1);

    }

    /**
     * 使用线程池  并不是多个线程同时进行执行，实际是cpu在快速的切换执行单个线程；
     *
     *
     */

    @Test
    public void eight(){
        //创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。
        ExecutorService executorService = Executors.newCachedThreadPool();
        //创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。
        ExecutorService executorService1 = Executors.newFixedThreadPool(8);
        //创建一个定长线程池，支持定时及周期性任务执行。
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(8);
        //创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();

        executorService.execute(
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("我是你创建的分线程需要执行的业务");
                    }
                }
        );

    }

    @Test
    public void nine(){
        UserDTO userDTO = new UserDTO();
        Class<UserDTO> userDTOClass = UserDTO.class;
        System.out.println(userDTOClass);
        try {
            //利用类的反射，调用newInstance()获取实例对象
            UserDTO userDTO1 = userDTOClass.newInstance();
            System.out.println(userDTO1);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        Class<?>[] declaredClasses = userDTOClass.getDeclaredClasses();
        System.out.println(declaredClasses);
        int length = declaredClasses.length;
        System.out.println(length);

    }


}
