package com.pb.panasjuk.hw6;

public class Animal {
    private String name;
    private String food;
    private String location;

//конструктор

    public Animal() {
    }


//геттеры и сеттеры

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


//методы
    public void makeNoise() {
        System.out.println(name + " шумит");
    }

    public void eat() {
        System.out.println(name + " кушает " + food);
    }

    public void sleep() {
        System.out.println(name + " спит...");
    }

    public void resides() {
        System.out.println(name + " проживает " + location);
    }








}
