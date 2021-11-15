package com.pb.panasjuk.hw7;

public class Pants extends Clothes implements ManClothes, WomenClothes {

    @Override
    public void dressMan() {
        System.out.print("Название: " + getName() + ", ");
        System.out.print("Размер: " + getSize() + ", ");
        System.out.print("Цена: " + getPrice() + ", ");
        System.out.println("Цвет: " + getColor() + ". ");
    }


    @Override
    public void dressWomen() {
        System.out.print("Название: " + getName() + ", ");
        System.out.print("Размер: " + getSize() + ", ");
        System.out.print("Цена: " + getPrice() + ", ");
        System.out.println("Цвет: " + getColor() + ". ");

    }
}
