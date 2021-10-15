package com.pb.panasjuk.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.print("Введите целое число: ");
        a = scan.nextInt();
        if((a >= 0) && (a <= 14)) {
            System.out.println("Число содержится в промежутке [0-14]");
        } else if ((a >= 15) && (a <= 35)) {
            System.out.println("Число содержится в промежутке [15-35]");
        } else if ((a >= 36) && (a <= 50)) {
            System.out.println("Число содержится в промежутке [36-50]");
        } else if ((a >= 51) && (a <= 100)) {
            System.out.println("Число содержится в промежутке [51-100]");
        } else {
            System.out.println("Число не попадает ни в один из имеющихся промежутков");
        }

    }
}
