package com.pb.panasjuk.hw11;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SerialMain {
    public static void main(String[] args) {

 //создаем одного абонента, ч-з конструктор заполняем поля
        Abonent abonent1 = new Abonent("Петров В.В", "21.10.2000", "0663534656",
                "Днепр, ул.Барикадная,18/25", LocalDateTime.of(2021,12,17,21,57));
        //Abonent abonent2 = new Abonent("Иванов И.И.", "15.06.1985", "0993534656",
       //         "Днепр, ул.Днепровская,15/27", LocalDateTime.of(2021,12,15,15,20,15));

//создадим список, куда положем первого абонента и еще добавим
        List<Abonent> list = new ArrayList<>();
        list.add(abonent1);
        list.add(new Abonent("Иванов И.И.", "15.06.1985", "0993534656",
         "Днепр, ул.Днепровская,15/27", LocalDateTime.of(2021,12,15,15,20,15)));
        list.add(new Abonent("Сидоров П.П.", "30.02.1987", "0980314225",
                "Днепр, ул.Кожемяки,2/10", LocalDateTime.of(2021,12,06,12,20,15)));

// отображение массива
        System.out.println(list);


// удаление элемента по значению
          list.remove(abonent1);


// отображение массива
         System.out.println(list);

// поиск элементов



// вывод всех записей с сортировкой по указанному полю (можно ограничиться двумя на выбор)


// редактирование элемента


// перебор элементов множества
        for(Abonent str: list) {
            System.out.print(str + " - ");
        }
        System.out.println();

    }
}
