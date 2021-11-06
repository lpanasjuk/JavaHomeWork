package com.pb.panasjuk.hw6;

import java.util.Objects;

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


//переопределеяем методы toString, equals, hashCode
    @Override
    public String toString() {
        return "Собака {" +
                "шум = '" + noise + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(noise, dog.noise);
    }

    @Override
    public int hashCode() {
        return Objects.hash(noise);
    }







}
