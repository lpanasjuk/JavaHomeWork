package com.pb.panasjuk.hw6;

public class Cat extends Animal {
    private String toys;

//геттеры и сеттеры
    public String getToys() {
        return toys;
    }

    public void setToys(String toys) {
        this.toys = toys;
    }

//переопределеяем методы makeNoise, eat
    @Override
    public void makeNoise() {
        System.out.println(getName() + " шумит когда играет в " + toys);

    }

    @Override
    public void eat() {
        System.out.println(getName() + " кушает " + getFood() + " и посматривает на " + toys);

    }


}
