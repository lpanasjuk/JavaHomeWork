package com.pb.panasjuk.hw7;

public abstract class Clothes {
    private String name;
    private Size size;
    private int price;
    private String color;

//конструктор
    public Clothes(String name, Size size, int price, String color) {
        this.name = name;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public Clothes() {
    }

    //геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    //переопределение метода toString()

    @Override
    public String toString() {
        return "Clothes {" +
                "Тип одежды = '" + name + '\'' +
                ", размер = " + size +
                ", цена = " + price +
                "грн, цвет = '" + color + '\'' +
                '}';
    }
}
