package com.zch.thread;


class JoinThread extends Thread{

    public void run() {
        for(int i = 1;i<=10;i++){
            System.out.println(getClass()+"正在执行"+i+"次");
        }

    }
}

public class JoinTest {

    public static void main(String[] args) {
        JoinThread jt = new JoinThread();
        jt.start();
        try {
            jt.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i = 1;i<=10;i++){
            System.out.println("主线程正在执行"+i+"次");
        }
        System.out.println("主线程运行结束");
    }


}
