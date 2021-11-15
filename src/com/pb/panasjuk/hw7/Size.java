package com.pb.panasjuk.hw7;

public enum Size {
    XXS("XXS", "Детский размер",32),
    XS("XS", "Взрослый размер",34),
    S("S","Взрослый размер",36),
    M("M","Взрослый размер",38),
    L("L","Взрослый размер",40);


    private String name;
    private String description;
    private int euroSize;


//Создать конструктор принимающий на вход description и euroSize
    Size(String name, String description, int euroSize) {
        this.name = name;
        this.description = description;
        this.euroSize = euroSize;
    }

//геттеры
    public String getDescription() {
        return description;
    }

    public int getEuroSize() {
        return euroSize;
    }

//toString()
    @Override
    public String toString() {
        return " " + name +
                ", описание: " + description +
                ", европейский размер: " + euroSize +
                "";
    }
}
