package com.pb.panasjuk.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        System.out.println("Зарегистрируйтесь на нашем сайте");
        Scanner sc = new Scanner(System.in);
        System.out.println("Придумайте логин от 5 до 20 символов: ");
        String login = sc.nextLine();
        System.out.println("Придумайте пароль от 5 символов:");
        String password = sc.nextLine();

        System.out.println("Повторите введенный пароль:");
        String confirmPassword = sc.nextLine();
        Auth auth = new Auth(login, password);

        try {
            auth.signUp(login, password, confirmPassword);
        } catch (WrongLoginException e1) {
            System.out.println("Исключение: " + e1.getMessage());
            System.out.println("Логин должен быть от 5 до 20 символов. Допустимые значения: латиница и цифры.");
            System.out.println("Регистрация не успешная!");
            return;
        } catch (WrongPasswordException e2) {
            System.out.println("Исключение: " + e2.getMessage());
            System.out.println("Пароль должен быть от 5 символов. Допустимые значения: латиница, цифры, нижнее подчеркивание.");
            System.out.println("Регистрация не успешная!");
            return;
        }

        System.out.println(" ");

        System.out.println("Зайти на сайт");
        System.out.println("Введите логин: ");
        String login2 = sc.nextLine();
        System.out.println("Введите пароль: ");
        String password2 = sc.nextLine();

        try {
            auth.signIn(login2, password2);
        } catch (WrongLoginException e1) {
            System.out.println("Логин или пароль введены неверно!");
        }








    }


}
