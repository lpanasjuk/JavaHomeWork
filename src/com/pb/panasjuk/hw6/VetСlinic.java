package com.pb.panasjuk.hw6;

import java.lang.reflect.Constructor;

public class VetСlinic {
    public static void main(String[] args) throws Exception{
        Animal anim = new Animal();
        System.out.println("Что делают наши животные: ");
        anim.setName("Барсук");
        anim.setFood("Ягоды");
        anim.setLocation("В лесу");
        anim.makeNoise();
        anim.eat();


        Dog dog = new Dog();
        dog.setName("Собака");
        dog.setNoise("Гав-гав");
        dog.setFood("Мясо");
        dog.setLocation("В частных домах");
        dog.makeNoise();
        dog.eat();


        Cat cat = new Cat();
        cat.setName("Котик");
        cat.setToys("Клубок ниток");
        cat.setFood("Рыбку");
        cat.setLocation("В квартирах");
        cat.makeNoise();
        cat.eat();


        Horse horse = new Horse();
        horse.setName("Пони");
        horse.setRun("рысью");
        horse.setFood("овёс");
        horse.setLocation("На поляне");
        horse.makeNoise();
        horse.eat();



//массив Animal со всеми животными
        Animal[] animals = new Animal[] {anim, dog, cat, horse};
        System.out.println("Список всех животных: ");
        for (Animal a: animals) {
            System.out.println(a.getName());
        }

//проверка toString()
        System.out.println("Особенности животных: ");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(horse);



//рефлексия
        System.out.println("Отправляем животных к ветеринару:");
        Class clazz = Class.forName("com.pb.panasjuk.hw6.Veterinarian");

        Constructor treatAnimal = clazz.getConstructor(new Class[] {});
        treatAnimal.setAccessible(true);
        Object obj = treatAnimal.newInstance();
        for (int i = 0; i < animals.length; i++)
            ((Veterinarian) obj).treatAnimal(animals[i]);





    }
}
