package com.pb.panasjuk.hw6;

public class Dog extends Animal {
    private String noise;

//геттеры и сеттеры
    public String getNoise() {
        return noise;
    }

    public void setNoise(String noise) {
        this.noise = noise;
    }


//переопределеяем методы makeNoise, eat
    @Override
    public void makeNoise() {
        System.out.println(getName() + " делает " + noise);

    }

    @Override
    public void eat() {
        System.out.println(getName() + " кушает " + getFood() + " и не только");

    }


}
