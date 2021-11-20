package com.pb.panasjuk.hw8;

public class WrongLoginException extends Exception {

//консутрктор по умолчанию
    public WrongLoginException() {
    }

//конструктор,кот. принимает сообщение и передает его в конструктор класса Exception
    public WrongLoginException(String msg) {
        super(msg);

    }

}
