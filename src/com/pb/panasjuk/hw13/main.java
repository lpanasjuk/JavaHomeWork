package com.pb.panasjuk.hw13;

import java.util.LinkedList;

public class main {
    public static void main(String[] strings) {
        LinkedList<Integer> sharedQueue = new LinkedList<>();
        int size = 5;
        Thread prodThread = new Thread(new Producer(sharedQueue, size), "Производитель");
        Thread consThread = new Thread(new Consumer(sharedQueue), "Потребитель");
        prodThread.start();
        consThread.start();

    }
}
