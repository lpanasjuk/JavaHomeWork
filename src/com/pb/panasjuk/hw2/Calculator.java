package com.pb.panasjuk.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;
        System.out.print("Введите первое число: ");
        operand1 = scan.nextInt();
        System.out.print("Введите второе число: ");
        operand2 = scan.nextInt();
        System.out.print("Введите знак арифметической операции (+ - * / ): ");
        scan.nextLine();
        sign = scan.nextLine();
        switch (sign) {
            case "+":
                System.out.println("Результат: " + operand1 + " + " + operand2 + " = " + (operand1 + operand2));
                break;
            case "-":
                System.out.println("Результат: " + operand1 + " - " + operand2 + " = " + (operand1 - operand2));
                break;
            case "*":
                System.out.println("Результат: " + operand1 + " * " + operand2 + " = " + (operand1 * operand2));
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("На ноль делить нельзя!");
                } else {
                    System.out.println("Результат: " + operand1 + " / " + operand2 + " = " + (operand1 / operand2));
                }
                break;
            default:
                System.out.println("Нет результата");

        }

    }
}
