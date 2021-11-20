package com.pb.panasjuk.hw8;

public class WrongPasswordException extends Exception {

//консутрктор по умолчанию
    public WrongPasswordException() {
    }

//конструктор,кот. принимает сообщение и передает его в конструктор класса Exception
    public WrongPasswordException(String msg) {
        super(msg);
    }
}
