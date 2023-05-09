package com.example.newdocument202302.service;

import org.junit.Test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {


    @Test
    public void one() {

        ReentrantLock reentrantLock1 = new ReentrantLock(false);//不公平锁
        ReentrantLock reentrantLock2 = new ReentrantLock(true);//公平锁

        try {
            //获取锁资源
            if (reentrantLock1.tryLock(5, TimeUnit.SECONDS)) {//设置等待时间，超时之后不执行

            }


            if (reentrantLock2.tryLock()) {

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //释放锁资源
            if (reentrantLock1.tryLock()) {
                reentrantLock1.unlock();
            }
            if (reentrantLock2.tryLock()) {
                reentrantLock2.unlock();
            }
        }


    }


}
