package com.zch.queue;

public class test {

    public static void main(String[] args) {
        Queue queue = new Queue();
        new Thread(new Producer(queue)).start();
        new Thread(new Consumer(queue)).start();
    }


}
