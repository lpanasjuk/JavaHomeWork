package com.pb.panasjuk.hw4;
import java.util.Arrays;
import java.util.Scanner;

import java.util.regex.Matcher;
import java.util.regex.*;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;


public class Anagram {
//создадим метод, убирающий пробелы и знаки препинания
    public static String repl(String str) {
        return str.toLowerCase().replaceAll("[^\\p{L}]", "");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String str1 = sc.nextLine();
        System.out.println("Введите строку, с которой хотите сравнить первую строку: ");
        String str2 = sc.nextLine();
        String str11 = repl(str1);
        String str22 = repl(str2);

        char[] chars1 = str11.toCharArray();   //сделала массив из строки
        char[] chars2 = str22.toCharArray();   //сделала массив из строки
        Arrays.sort(chars1);   //отсортировала в алфавитном порядке
        Arrays.sort(chars2);   //отсортировала в алфавитном порядке
    /*    for (char c : chars1) {
            System.out.print(c);
        }
        for (char d : chars2) {
            System.out.print(d);
        }*/



        //сравнение
        String str111 = String.valueOf(chars1);
        String str222 = String.valueOf(chars2);
        if(str111.equals(str222)) {
            System.out.print("Строка 1 является анограммой Строки 2");
        } else {
            System.out.print("Строка 1 НЕ является анограммой Строки 2");
        }



        /*
        if (chars1.length != chars2.length){
            System.out.print("Строка 1 НЕ является анограммой Строки 2");
        } else {
            for(int i = 0; i < chars1.length; i++){
                if(chars1[i] != chars2[i]){
                    System.out.print("Строка 1 НЕ является анограммой Строки 2");
                }
            }
            System.out.print("Строка 1 является анограммой Строки 2");
        }


         */

            /*
//аналогично для второй строки
        char[] chars2 = str22.toCharArray();   //сделала массив из строки
        Arrays.sort(chars2);   //отсортировала в алфавитном порядке
        for (char d : chars2) {
            System.out.print(d);

            } */




    /* если да , то "Строка 1 является анограммой Строки 2"
    иначе "Строка 1 НЕ является анограммой Строки 2"
     */

    }
    }