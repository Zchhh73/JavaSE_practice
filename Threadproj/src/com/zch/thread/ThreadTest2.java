package com.zch.thread;

class PrintRunnable implements Runnable {
    int i = 1;

    @Override
    public void run() {
        //获取当前线程的线程名
        while (i <= 10) {
            System.out.println(Thread.currentThread().getName() + "正在运行！" + (i++));
        }
    }
}

public class ThreadTest2 {

    public static void main(String[] args) {
        /*
            多线程处理同一资源的情况
         */
        //1.定义runnable实现类的对象。
        PrintRunnable pr = new PrintRunnable();
        //2.通过thread创建线程类对象。
        Thread t1 = new Thread(pr);
        //3.启动
        t1.start();

        Thread t2 = new Thread(pr);
        t2.start();


    }
}
