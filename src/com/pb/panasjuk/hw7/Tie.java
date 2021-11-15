package com.pb.panasjuk.hw7;

public class Tie extends Clothes implements ManClothes {

    @Override
    public void dressMan() {
        System.out.print("Название: " + getName() + ", ");
        System.out.print("Размер:" + getSize() + ", ");
        System.out.print("Цена: " + getPrice() + ", ");
        System.out.println("Цвет: " + getColor() + ". ");
    }



}
