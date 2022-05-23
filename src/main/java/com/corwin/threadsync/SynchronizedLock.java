package com.corwin.threadsync;

public class SynchronizedLock {

    private static final String RESOURCE = "resource";

    public static void main(String[] args) {
        Thread threadA = new Thread(() -> {
            synchronized (RESOURCE) {
                try {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "threadA");
        Thread threadB = new Thread(() -> {
            synchronized (RESOURCE) {
                try {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "threadB");
        threadA.start();
        threadB.start();
    }

}
