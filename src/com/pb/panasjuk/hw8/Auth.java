package com.pb.panasjuk.hw8;

import java.util.regex.Pattern;

public class Auth {
    private String login;
    private String password;



//конструктор
    public Auth(String login, String password) {
        this.login = null;
        this.password = null;
    }



//метод signUp (регистрация на сайте)
    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if(!Pattern.matches("[a-zA-Z0-9]{5,20}",login)) {
            throw new WrongLoginException("Логин небезопасен!");
        } else {
            this.login = login;
        }

        if (!Pattern.matches("\\w{5,}",password)) {
            throw new WrongPasswordException("Пароль небезопасен!");
        } else if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("При повторении пароля допущена ошибка!");

        } else {
            this.password = password;
            System.out.println("Пользователь зарегистрирован!");
        }



    }

//метода signIn (вход на сайт)
    public void signIn(String login2, String password2) throws WrongLoginException {
        if (!login2.equals(login) || !password2.equals(password)) {
            throw new WrongLoginException("Данные введены неверно");
        } else {
            System.out.println("Вход успешно выполнен!");
        }

    }




}



/*

        if(login.replaceAll("[a-zA-Z0-9]{5,20}")) {
            System.out.println("Пароль безопасный");
        } else {
            throw new WrongLoginException();
        }

        if (password.replaceAll("\\w{5,}") && password.equals(confirmPassword)) {
            System.out.println("Логин надежный");
        } else {
            throw new WrongPasswordException();
        }




            public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if(!login.replaceAll("[a-zA-Z0-9]{5,20}")) {
            throw new WrongLoginException();
        } else {
            this.login = login;
            System.out.println("Логин безопасный");
        }

        if (!password.replaceAll("\\w{5,}")) {
            throw new WrongPasswordException();
        } else if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        } else {
            this.password = password;
            System.out.println("Пароль надежный");
        }
 */