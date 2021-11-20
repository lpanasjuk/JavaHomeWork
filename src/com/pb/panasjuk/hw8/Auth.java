package com.pb.panasjuk.hw8;

import java.util.regex.Pattern;

public class Auth {
    private String login;
    private String password;


//конструктор
    public Auth(String login, String password) {
      /*  this.login = login;
        this.password = password;*/
    }

//метод signUp (регистрация на сайте)
    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if(!Pattern.matches("[a-zA-Z0-9]{5,20}",login)) {
            throw new WrongLoginException();
        } else {
            this.login = login;
            System.out.println("Логин безопасный");
        }

        if (!Pattern.matches("\\w{5,}",password)) {
            throw new WrongPasswordException();
        } else if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        } else {
            this.password = password;
            System.out.println("Пароль надежный");
        }



    }

//метода signIn (вход на сайт)
    public void signIn(String login, String password) throws WrongLoginException {
        if (!login.equals(this.login) && !password.equals(this.password)) {
            throw new WrongLoginException();
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