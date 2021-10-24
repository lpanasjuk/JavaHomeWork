package com.pb.panasjuk.hw3;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Для заполнения массива введите 10 целых чисел");

//Просим пользователя ввести числа для заполнения массива
        for(int i = 0; i < array.length; i++) {
            System.out.println("Введите " + (i + 1) + " целое число:");
            array[i] = sc.nextInt(); //То что ввел пользователь.
        }

//Показываем пользователю массив
        System.out.print("Ваш массив: [ ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");


//Считаем сумму всех элементов.
        System.out.print("Сумма всех элементов массива: ");
        int summ = 0;
        for(int i = 0; i < array.length; i++) {
            summ += array[i];
        }
        System.out.println(summ);

//Считаем количество положительных элементов.
        System.out.print("Кол-во положительных элементов массива: ");
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
            }
        }
        System.out.println(count);

//Производим сортировку
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for(int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]) {
                    sorted = false;
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;

                }
            }
        }


//Показываем пользователю отсортированный массив
        System.out.print("Отсортированный массив: [ ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }
}
