package com.pb.panasjuk.hw3;

import java.util.Random;
import java.util.Scanner;


public class Bingo {
    public static void main(String[] args) {
        System.out.println("Отгадайте число от 0 до 100.");
        System.out.println("Для выхода из программы введите цифру больше 100.");
        System.out.println("Введите число:");
        int counter = 0; //Счетчик попыток.
        Random random = new Random();
        int x = random.nextInt(101); //Задуманное число.
        Scanner sc = new Scanner(System.in);

        while (counter < 100) {
            int y = sc.nextInt(); //То что ввел пользователь.
            counter++;

    //Выход из игры
        if (y >= 101) {
            break;
        }


        if (x > y) {
            System.out.println("Задуманное число больше вводимого");
        } else if (x < y) {
            System.out.println("Задуманное число меньше вводимого");
        } else if (x == y) {
            System.out.println("Поздравляем, Вы угадали с " + counter + " попытки!");
            break;
        }
        }
        System.out.println("Конец игры!");

    }


}
