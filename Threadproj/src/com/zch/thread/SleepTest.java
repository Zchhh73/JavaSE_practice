package com.zch.thread;

class SleepThread implements Runnable{

    @Override
    public void run() {
        for(int i =1;i<=15;i++){
            System.out.println(Thread.currentThread().getName()+ "正在运行！" + i);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
public class SleepTest {

    public static void main(String[] args) {
        SleepThread st = new SleepThread();
        Thread t = new Thread(st);
        t.start();
        Thread t1 = new Thread(st);
        t1.start();

    }
}
