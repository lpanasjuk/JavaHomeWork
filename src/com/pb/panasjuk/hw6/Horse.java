package com.pb.panasjuk.hw6;

public class Horse extends Animal {
    private String run;

//геттеры и сеттеры
    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }


//переопределеяем методы makeNoise, eat
    @Override
    public void makeNoise() {
        System.out.println(getName() + " бегает " + run);

    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("и машет хвостом");

    }

}
