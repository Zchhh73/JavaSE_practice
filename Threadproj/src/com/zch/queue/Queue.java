package com.zch.queue;

public class Queue {
    private int n;
    //flag为false表示没有数据，消费者等待，生产者生产数据。
    //生产数据后，flag为true，生产者等待，消费者消费数据。
    private boolean flag = false;

    public synchronized int getN() {
        //没数字则等待，有数字则消费
        if(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("消费："+n);
        flag = false;
        notifyAll();
        return n;
    }

    public synchronized void setN(int n) {
        //没有数字，flag为false时生产,有数字则等待。
        if(flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("生产："+n);
        this.n = n;
        flag = true;//生产完毕，已经有数据。
        notifyAll();
    }
}
