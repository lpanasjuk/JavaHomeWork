package com.pb.panasjuk.hw13;

import java.util.Queue;
import java.util.Random;

// implements Runnable чтобы запускать в отдельном потоке
class Producer implements Runnable {
    // Общая очередь
    private final Queue<Integer> sharedQueue;
    // Максимальный размер
    private final int SIZE;

    // Конструктор
    public Producer(Queue<Integer> sharedQueue, int size) {
        this.sharedQueue = sharedQueue;
        this.SIZE = size;
    }

    @Override
    public void run() {
        // Цикл бесконечен
        while (true) {
            try {
                // В цикле вызывается метод produce
                System.out.println("Производим: " + produce());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



    private int produce() throws InterruptedException {
        synchronized (sharedQueue) { // синхронизация
            if (sharedQueue.size() == SIZE) {
                // Если очередь полна, то ждём
                System.out.println("Очередь полна, ждём потребления");
                sharedQueue.wait();
            }

            // Добавили элемент в очередь.
            int newValue = new Random().nextInt(10);
            sharedQueue.add(newValue);

            // Уведомили другой поток на случай, если он ждет
            sharedQueue.notifyAll();

            return newValue;
        }
    }
}
