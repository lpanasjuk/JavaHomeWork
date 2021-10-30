package com.pb.panasjuk.hw4;
import java.util.Arrays;
import java.util.Scanner;



public class Anagram {
//метод, убирающий пробелы и знаки препинания
    public static String repl(String str) {
        return str.toLowerCase().replaceAll("[^\\p{L}]", "");
    }

//Ввод строк пользователем, использование метода repl()
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку 1: ");
        String str1 = sc.nextLine();
        System.out.println("Введите строку 2: ");
        String str2 = sc.nextLine();
        String str11 = repl(str1);
        String str22 = repl(str2);


//массив из строки, сортировка в алфавитном порядке
        char[] chars1 = str11.toCharArray();
        char[] chars2 = str22.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);


//приведение в строки, сравнение
        System.out.println("Результат сравнения: ");
        String str111 = String.valueOf(chars1);
        String str222 = String.valueOf(chars2);
        if(str111.equals(str222)) {
            System.out.print("Строка 1 является анаграммой Строки 2");
        } else {
            System.out.print("Строка 1 НЕ является анаграммой Строки 2");
        }

    }
    }