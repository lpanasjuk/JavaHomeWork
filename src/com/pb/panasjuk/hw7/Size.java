package com.pb.panasjuk.hw7;

public enum Size {
    XXS("Детский размер", 32),
    XS("Взрослый размер", 34),
    S("Взрослый размер",36),
    M("Взрослый размер",38),
    L("Взрослый размер",40);

    private String description;
    private int euroSize;


//Создать конструктор принимающий на вход description и euroSize
    Size(String description, int euroSize) {
        this.description = description;
        this.euroSize = euroSize;


    }
}
