package com.pb.panasjuk.hw10;

public class Main {
    public static void main(String[] args) {

        System.out.println("---------Float---------");
        NumBox<Float> numbox = new NumBox<>(3);
        System.out.println("Получить элемент массива по индексу: ");
        try {
            numbox.add(0, 5.0F);
            numbox.add(1, 3.1F);
            numbox.add(2, 5.7F);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Массив переполнен! ");
            e.printStackTrace();
        }
        System.out.println("[0] - " + numbox.get(0));
        System.out.println("[1] - " + numbox.get(1));
        System.out.println("[2] - " + numbox.get(2));

        System.out.println("В массиве заполнено элементов - " + numbox.length());
        System.out.println("Среднее арифметическое элементов массива - " + numbox.average());
        System.out.println("Сумма всех эелементов массива - " + numbox.sum());
        System.out.println("Максимальный элемент массива - " + numbox.max());

        System.out.println("---------Double---------");

        NumBox<Double> numbox2 = new NumBox<>(2);
        System.out.println("Получить элемент массива по индексу: ");
        try {
        numbox2.add(0,3.8);
        numbox2.add(1,1.4);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Массив переполнен! ");
            e.printStackTrace();
        }
        System.out.println("[0] - " + numbox2.get(0));
        System.out.println("[1] - " + numbox2.get(1));
        System.out.println("В массиве заполнено элементов - " + numbox2.length());
        System.out.println("Среднее арифметическое элементов массива - " + numbox2.average());
        System.out.println("Сумма всех эелементов массива - " + numbox2.sum());
        System.out.println("Максимальный элемент массива - " + numbox2.max());

        System.out.println("---------Integer---------");

        NumBox<Integer> numbox3 = new NumBox<>(2);
        System.out.println("Получить элемент массива по индексу: ");
        try {
            numbox3.add(0,8);
            numbox3.add(1,5);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Массив переполнен! ");
            e.printStackTrace();
        }
        System.out.println("[0] - " + numbox3.get(0));
        System.out.println("[1] - " + numbox3.get(1));
        System.out.println("В массиве заполнено элементов - " + numbox3.length());
        System.out.println("Среднее арифметическое элементов массива - " + numbox3.average());
        System.out.println("Сумма всех эелементов массива - " + numbox3.sum());
        System.out.println("Максимальный элемент массива - " + numbox3.max());



    }
}


