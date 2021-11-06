package com.pb.panasjuk.hw6;

import java.util.Objects;

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
        System.out.println(getName() + " кушает " + getFood() + " и машет хвостиком");

    }


//переопределеяем методы toString, equals, hashCode
    @Override
    public String toString() {
        return "Пони {" +
                "бег = '" + run + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Objects.equals(run, horse.run);
    }

    @Override
    public int hashCode() {
        return Objects.hash(run);
    }




}
