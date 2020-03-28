package com.zch.queue;

public class Consumer implements Runnable {

    Queue queue;
    Consumer(Queue queue){
        this.queue = queue;
    }


    @Override
    public void run() {
        while(true){
            queue.getN();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
