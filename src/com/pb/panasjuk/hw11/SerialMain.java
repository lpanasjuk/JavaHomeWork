package com.pb.panasjuk.hw11;

import java.time.LocalDateTime;
import java.util.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Paths;

public class SerialMain {
    public static void main(String[] args) throws Exception {

        File file = Paths.get("files/abonent.data").toFile();
        FileOutputStream outputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

 //создаем одного абонента, ч-з конструктор заполняем поля
        Abonent abonent1 = new Abonent("петров", "21.10.2000", "0663534656 0673334455",
                "Днепр, ул.Барикадная,18/25", LocalDateTime.now());


//создадим список, куда положем первого абонента и еще добавим
        List<Abonent> list = new ArrayList<>();
        list.add(abonent1);
        list.add(new Abonent("иванов", "15.06.1985", "0993534656",
         "Днепр, ул.Днепровская,15/27", LocalDateTime.now()));
        list.add(new Abonent("сидоров", "30.02.1987", "0980314225",
                "Днепр, ул.Кожемяки,2/10", LocalDateTime.now()));
        list.add(new Abonent("шароваров", "13.05.1995", "0935558877",
                "Днепр, ул.Матросова,2/10", LocalDateTime.now()));

// отображение массива
        System.out.println("Отображение всех абонентов");
        for(Abonent str:list) {
            System.out.println (str);
        }

        System.out.println(); //перенос


// удаление элемента по значению
        Scanner sc = new Scanner(System.in);
        System.out.println ("Введите фамилию для удаления контакта:");
        String nam = sc.next();

        Iterator<Abonent> iterator = list.iterator();
        while (iterator.hasNext()) {
           Abonent item = iterator.next();
           if(item.getFullName().equals(nam)) {
               iterator.remove();
               System.out.println("Успешно удален: " + item);
           }
       }

        System.out.println(); //перенос


// отображение массива после удаления
        System.out.println("Отображение всех абонентов после удаления");
        for(Abonent str:list) {
            System.out.println (str);
        }

        System.out.println(); //перенос


// поиск элементов
        System.out.println ("Введите фамилию для поиска:");
        String name = sc.next();
        for(Abonent str:list) {
            if(str.getFullName().equals(name)) {
                System.out.println("Найден абонент");
                System.out.println(str);
            }
        }

        System.out.println();


// вывод всех записей с сортировкой по указанному полю (можно ограничиться двумя на выбор)
//вывод на екран описания возможных действий с указанием команд
        System.out.println("Выберите вариант сортировки: (name)по Фамилии, (phone)по номеру телефона, (full)по Фамилии и телефону");
        String act = sc.next();

        if(act.equals("name")){
            list.sort(Comparator.comparing(p -> p.fullName));
            System.out.println("Сортировка по Фамилии - ");
            for(Abonent str:list) {
                System.out.println (str);
            }
        } else if(act.equals("phone")){
            list.sort(Comparator.comparing(p -> p.phone));
            System.out.println("Сортировка по номеру телефона - ");
            for(Abonent str:list) {
                System.out.println (str);
            }
        } else {
            list.sort(Comparator.comparing(p -> p.fullName));
            System.out.println("Сортировка по Фамилии - ");
            for(Abonent str:list) {
                System.out.println (str);
            }

            list.sort(Comparator.comparing(p -> p.phone));
            System.out.println("Сортировка по номеру телефона - ");
            for(Abonent str:list) {
                System.out.println (str);
            }
        }

        System.out.println(); //перенос



// редактирование элемента
            System.out.println ("Введите Фамилию для редактирования:");
            String unam = sc.next();
            System.out.println ("Введите новую Фамилии:");
            String unum = sc.next();
            for(Abonent str:list) {
                if(str.getFullName().equals(unam)) {
                    str.setFullName(unum);
                    System.out.println ("Успешно изменено!");
                }
            }


// перебор элементов
        for(Abonent str: list) {
            System.out.println(str);
        }


        // сохраняем в файл
        objectOutputStream.writeObject(list);
        System.out.println("Файл записан! ");

        //закрываем поток и освобождаем ресурсы
        objectOutputStream.close();
    }
}
