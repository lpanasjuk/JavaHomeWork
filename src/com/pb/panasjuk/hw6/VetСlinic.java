package com.pb.panasjuk.hw6;

import java.lang.reflect.Constructor;

public class VetСlinic {
    public static void main(String[] args) throws Exception{
        Animal anim = new Animal();
        anim.setName("Барсук");
        anim.makeNoise();
        anim.setFood("Ягоды");
        anim.eat();
        anim.setLocation("В лесу");

        Dog dog = new Dog();
        dog.setName("Собака");
        dog.setNoise("Гав-гав");
        dog.makeNoise();
        dog.setFood("Мясо");
        dog.eat();
        dog.setLocation("В частных домах");

        Cat cat = new Cat();
        cat.setName("Котик");
        cat.setToys("Клубок ниток");
        cat.makeNoise();
        cat.setFood("Рыбку");
        cat.eat();
        cat.setLocation("В квартирах");

        Horse horse = new Horse();
        horse.setName("Пони");
        horse.setRun("рысью");
        horse.makeNoise();
        horse.setFood("овёс");
        horse.eat();
        horse.setLocation("На поляне");


//массив Animal со всеми животными
        Animal[] animals = new Animal[] {anim, dog, cat, horse};
        System.out.println("Список всех животных: ");
        for (Animal a: animals) {
            System.out.println(a.getName());
        }

//проверка toString()
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(horse);



//рефлексия
        System.out.println("Отправляем животных к ветеринару");
        Class clazz = Class.forName("com.pb.panasjuk.hw6.Veterinarian");

        Constructor treatAnimal = clazz.getConstructor(new Class[] {});
        treatAnimal.setAccessible(true);
        Object obj = treatAnimal.newInstance();
        for (int i = 0; i < animals.length; i++)
            ((Veterinarian) obj).treatAnimal(animals[i]);





    }
}
