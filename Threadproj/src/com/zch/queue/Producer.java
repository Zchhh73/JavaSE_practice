package com.zch.queue;

public class Producer implements Runnable {

    Queue queue;
    Producer(Queue queue){
        this.queue = queue;
    }

    /**
     * 循环生产n的值
     */
    @Override
    public void run() {
        int i = 0;
        while(true){
            queue.setN(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
