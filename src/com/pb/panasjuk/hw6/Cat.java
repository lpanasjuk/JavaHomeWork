package com.pb.panasjuk.hw6;

import java.util.Objects;

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


//переопределеяем методы toString, equals, hashCode
    @Override
    public String toString() {
        return "Котик {" +
                "любимая игрушка = '" + toys + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(toys, cat.toys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(toys);
    }





}
