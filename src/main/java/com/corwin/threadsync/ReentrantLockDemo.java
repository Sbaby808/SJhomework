package com.corwin.threadsync;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {

    private static final String RESOURCE = "resource";

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        Thread threadA = new Thread(() -> {
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName() + " : lock!");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(Thread.currentThread().getName() + " : unlock!");
                lock.unlock();
            }
        }, "threadA");
        Thread threadB = new Thread(() -> {
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName() + " : lock!");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(Thread.currentThread().getName() + " : unlock!");
                lock.unlock();
            }
        }, "threadB");
        threadA.start();
        threadB.start();
    }

}
