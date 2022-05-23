package com.corwin.deadlock;

public class Main {

    private final static Integer resourceA = 1;
    private final static Integer resourceB = 2;

    public static void main(String[] args) {
        Thread threadA = new Thread(() -> {
            synchronized (resourceA) {
                try {
                    Thread.sleep(100);
                    synchronized (resourceB) {
                        Thread.sleep(300);
                        // do something
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "ThreadA");
        Thread threadB = new Thread(() -> {
            synchronized (resourceB) {
                try {
                    Thread.sleep(100);
                    synchronized (resourceA) {
                        Thread.sleep(300);
                        // do something
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "ThreadB");
        threadA.start();
        threadB.start();
    }

}
