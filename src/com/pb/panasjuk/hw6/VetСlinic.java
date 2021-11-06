package com.pb.panasjuk.hw6;

public class VetСlinic {
    public static void main(String[] args) {
        Animal anim = new Animal();
        anim.setName("Барсук");
        anim.makeNoise();
        anim.setFood("Ягоды");
        anim.eat();

        Dog dog = new Dog();
        dog.setName("Собака");
        dog.setNoise("Гав - гав");
        dog.makeNoise();
        dog.setFood("Мясо");
        dog.eat();


        Cat cat = new Cat();
        cat.setName("Котик");
        cat.setToys("Клубок ниток");
        cat.makeNoise();
        cat.setFood("Рыбку");
        cat.eat();

        Horse horse = new Horse();
        horse.setName("Пони");
        horse.setRun("рысью");
        horse.makeNoise();
        horse.setFood("овёс");
        horse.eat();



        Animal[] animals = new Animal[] {anim, dog, cat, horse};
        System.out.println("Список всех животных: ");
        for (Animal a: animals) {
            System.out.println(a.getName());
        }



    }
}
