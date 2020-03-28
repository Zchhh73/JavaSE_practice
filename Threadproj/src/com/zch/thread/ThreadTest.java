package com.zch.thread;

class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }

    public void run(){
        for(int i = 1;i<=10;i++){
            System.out.println(getName()+"线程正在执行"+i);
        }
    }
}

public class ThreadTest {

    public static void main(String[] args) {
//        System.out.println("主线程1");
        MyThread mt1 = new MyThread("线程1");
        MyThread mt2 = new MyThread("线程2");
        mt1.start();
        mt2.start();
//        System.out.println("主线程2");
    }
}
