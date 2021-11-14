package com.pb.panasjuk.hw7;

public class Tie extends Clothes implements ManClothes, WomenClothes {
    @Override
    public void ManClothes() {
        System.out.println("Информация о мужской одежде: ");
        System.out.println("Название: " + getName());
        System.out.println("Размер: " + getSize());
        System.out.println("Цена: " + getPrice());
        System.out.println("Цвет: " + getColor());
    }


    @Override
    public void WomenClothes() {
        System.out.println("Информация о женской одежде: ");
        System.out.println("Название: " + getName());
        System.out.println("Размер: " + getSize());
        System.out.println("Цена: " + getPrice());
        System.out.println("Цвет: " + getColor());

    }
}
