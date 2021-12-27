package com.pb.panasjuk.hw13;


import java.util.Queue;

// implements Runnable чтобы запускать в отдельном потоке
class Consumer implements Runnable {
    // Общая очередь
    private final Queue<Integer> sharedQueue;


    public Consumer(Queue<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }


    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Потребляем: " + consume());
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    // Метод, извлекающий элементы из общей очереди
    private Integer consume() throws InterruptedException {
        synchronized (sharedQueue) {
            if (sharedQueue.isEmpty()) { // Если пуста, надо ждать
               System.out.println("Очередь пуста, ждём производство");
                sharedQueue.wait();
            }

       //     System.out.println("Уведомили другой поток на случай, если он ждет");
            sharedQueue.notifyAll();
            return sharedQueue.poll();
        }
    }
}
