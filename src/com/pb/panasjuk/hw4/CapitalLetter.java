package com.pb.panasjuk.hw4;
import java.util.Scanner;

public class CapitalLetter {

//метод, который возвращает слово с заглавной первой буквой
    public static String CapitalLetter(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }

//ввод строки пользователем, использование метода CapitalLetter()
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String s = sc.nextLine();
        System.out.println("Результат: ");
        String[] vsParts = s.split(" ");
        for(String sp : vsParts) {
            System.out.print(CapitalLetter(sp) + " ");
        }


 }


}

