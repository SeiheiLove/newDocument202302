package com.example.newdocument202302;
import java.util.concurrent.locks.ReentrantLock;

public class TestLock {

    public static void main(String[] args) {
        TestLock2 testLock1 = new TestLock2();
        new Thread( testLock1,"第一人").start();
        new Thread( testLock1,"第二人").start();
        new Thread(testLock1,"第三人").start();
    }

}

class TestLock2 implements Runnable{
    private ReentrantLock lock = new ReentrantLock();
    int number = 10;
    @Override
    public void run() {
        lock.lock();
        int i = 0;
        try {
            number = number - 1;
            System.out.println("结果==" + number);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }
}
