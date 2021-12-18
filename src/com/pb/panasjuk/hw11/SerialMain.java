package com.pb.panasjuk.hw11;

import java.time.LocalDateTime;
import java.util.*;
import java.time.LocalDateTime;

public class SerialMain {
    public static void main(String[] args) {

 //создаем одного абонента, ч-з конструктор заполняем поля
        Abonent abonent1 = new Abonent("петров", "21.10.2000", "0663534656 0673334455",
                "Днепр, ул.Барикадная,18/25", LocalDateTime.now());// LocalDateTime.of(2021,12,17,21,57));
     //  Abonent abonent2 = new Abonent("Иванов И.И.", "15.06.1985", "0993534656",
          //     "Днепр, ул.Днепровская,15/27", java.time.LocalDateTime.now());

//создадим список, куда положем первого абонента и еще добавим
        List<Abonent> list = new ArrayList<>();
        list.add(abonent1);
        list.add(new Abonent("иванов", "15.06.1985", "0993534656",
         "Днепр, ул.Днепровская,15/27", LocalDateTime.now()));// LocalDateTime.of(2021,12,15,15,20,15)));
        list.add(new Abonent("сидоров", "30.02.1987", "0980314225",
                "Днепр, ул.Кожемяки,2/10", LocalDateTime.now()));// LocalDateTime.of(2021,12,06,12,20,15)));

// отображение массива
        System.out.println("Отображение всех абонентов");
        for(Abonent str:list) {
            System.out.println (str);
        }

/*
// удаление элемента по значению
          list.remove(abonent1);
*/
// отображение массива
        System.out.println("Отображение всех абонентов после удаления");
        for(Abonent str:list) {
            System.out.println (str);
        }



// поиск элементов
        Scanner sc = new Scanner(System.in);
        System.out.println ("Пожалуйста, введите фамилию для поиска:");
        String name = sc.next();
        for(Abonent str:list) {
            if(str.getFullName().equals(name)) {
                System.out.println("Найден абонент");
                System.out.println(str);
            }
        }

        System.out.println();

// вывод всех записей с сортировкой по указанному полю (можно ограничиться двумя на выбор)
 /*       list.sort(Comparator.comparing(p -> p.fullName));
     //   System.out.println("Сортировка по полю Фамилии " + list);
        System.out.println("Сортировка по полю ФИО = ");
        for(Abonent str:list) {
            System.out.println (str);
        }


//еще одна сортировка по номеру телефона
        list.sort(Comparator.comparing(p -> p.phone));
        //   System.out.println("Сортировка по полю Фамилии " + list);
        System.out.println("Сортировка по номеру телефона = ");
        for(Abonent str:list) {
            System.out.println (str);
        }
*/

// вывод всех записей с сортировкой по указанному полю (можно ограничиться двумя на выбор)
//вывод на екран описания возможных действий с указанием команд
        System.out.println("Выберите вариант сортировки: (name)по фамилии, (phone)по номеру телефона, (full)по фамилии и телефону");
        String act = sc.next();

        if(act.equals("name")){
            list.sort(Comparator.comparing(p -> p.fullName));
            //   System.out.println("Сортировка по полю Фамилии " + list);
            System.out.println("Сортировка по полю ФИО = ");
            for(Abonent str:list) {
                System.out.println (str);
            }
        } else if(act.equals("phone")){
            list.sort(Comparator.comparing(p -> p.phone));
            //   System.out.println("Сортировка по полю Фамилии " + list);
            System.out.println("Сортировка по номеру телефона = ");
            for(Abonent str:list) {
                System.out.println (str);
            }
        } else {
            list.sort(Comparator.comparing(p -> p.fullName));
            //   System.out.println("Сортировка по полю Фамилии " + list);
            System.out.println("Сортировка по полю ФИО = ");
            for(Abonent str:list) {
                System.out.println (str);
            }

            list.sort(Comparator.comparing(p -> p.phone));
            //   System.out.println("Сортировка по полю Фамилии " + list);
            System.out.println("Сортировка по номеру телефона = ");
            for(Abonent str:list) {
                System.out.println (str);
            }
        }






// редактирование элемента
            System.out.println ("Пожалуйста, введите фамилию для изменения:");
            String unam = sc.next();
            System.out.println ("Введите новую фамилию:");
            String unum = sc.next();
            for(Abonent str:list) {
                if(str.getFullName().equals(unam)) {
                    str.setFullName(unum);
                    System.out.println ("Изменено успешно!");
                }
            }





// перебор элементов множества
        for(Abonent str: list) {
            System.out.print(str + " - ");
        }
        System.out.println();

    }
}
