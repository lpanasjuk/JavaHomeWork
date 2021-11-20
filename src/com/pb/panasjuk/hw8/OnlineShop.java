package com.pb.panasjuk.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        System.out.println("Зарегистрируйтесь на нашем сайте");
        Scanner sc = new Scanner(System.in);
        System.out.println("Придумайте логин от 5 до 20 символов");
        String login = sc.next();
        System.out.println("Придумайте пароль от 5 символов");
        String password = sc.nextLine();
        System.out.println("Повторите введенный пароль");
        String confirmPassword = sc.nextLine();
        Auth auth = new Auth(login, password);

        try {
            auth.signUp();
        } catch (WrongLoginException e1) {
            System.out.println("Логин должен быть от 5 до 20 символов, содержать латиницу и цифры");
        } catch (WrongPasswordException e2) {
            System.out.println("Пароль должен быть от 5 символов, содержать латиницу, цифры, нижнее подчеркивание");
        }

        System.out.println("Зайти на сайт");
        System.out.println("Введите логин: ");
        System.out.println("Введите пароль: ");
        String login2 = sc.next();
        String password2 = sc.nextLine();

        try {
            auth.signIn();
        } catch (WrongLoginException e1) {
            System.out.println("Логин или пароль введены неверно!");
        }








    }


}
