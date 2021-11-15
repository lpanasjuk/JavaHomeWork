package com.pb.panasjuk.hw7;

public class Skirt extends Clothes implements WomenClothes {

    @Override
    public void dressWomen() {
        System.out.print("Название: " + getName() + ", ");
        System.out.print("Размер: " + getSize() + ", ");
        System.out.print("Цена: " + getPrice() + ", ");
        System.out.println("Цвет: " + getColor() + ". ");

    }
}
