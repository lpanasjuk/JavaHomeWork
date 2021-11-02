package com.pb.panasjuk.hw5;

import java.util.Arrays;

public class Library {
    public static void main(String[] args) {
        Reader [] readers = new Reader[3];
        readers[0] = new Reader("Петров В.В.", 1251,
                "Экономический факультет", "12.05.1988", "0990001133");
        readers[1] = new Reader("Иванов С.В.", 1252,
                "Факультет Неорганической химии", "21.01.1990", "0990002244");
        readers[2] = new Reader("Сидоров А.П.", 1253,
                "Экономический факультет", "05.10.1992", "0990005566");

        Book [] books = new Book[3];
        books[0] = new Book("Приключения", "Иванов И.И.", 2000);
        books[1] = new Book("Словарь","Сидоров А.В.", 1980);
        books[2] = new Book("Энциклопедия", "Гусев К.В.", 2010);

       /* Reader [] reader1 = new Reader[5];
        Book [] book1 = new Book[3];
        Book [] book2 = new Book[3];
        Book [] book3 = new Book[3];

        reader1[1].setFullName("Петров В.В.");
        reader1[2].setCardNumber(1251);
        reader1[3].setFaculty("Экономический факультет");
        reader1[4].setDob("12.05.1988");
        reader1[5].setPhone("0990001133");


        book1[1].setDenomination("Приключения");
        book1[2].setAuthor("Иванов И.И.");
        book1[3].setYear(2000);

        book2[1].setDenomination("Словарь");
        book2[2].setAuthor("Сидоров А.В.");
        book2[3].setYear(1980);

        book3[1].setDenomination("Энциклопедия");
        book3[2].setAuthor("Гусев К.В.");
        book3[3].setYear(2010);
        */

//вызываем первый раз метод takeBook()
        readers[0].takeBook(readers[0].getFullName(), 3);
        readers[0].takeBook(3);
//вызываем второй раз метод takeBook()
    //    readers[0].takeBook(readers[0].getFullName(), "Приключения", "Словарь", "Энциклопедия");
        readers[0].takeBook(readers[0].getFullName(), books[0].getDenomination(),
                books[1].getDenomination(), books[2].getDenomination());


//вызываем третий раз метод takeBook()
      //  readers[0].takeBook(books[0], books[1], books[2]);
        readers[0].takeBook(books[0].getDenomination(), books[0].getAuthor(), books[0].getYear(), books[0].getDenomination(), books[0].getAuthor(), books[0].getYear()

//вызываем первый раз метод returnBook()
        readers[0].returnBook(readers[0].getFullName(), 3);
//вызываем второй раз метод returnBook()
      //  readers[0].returnBook(readers[0].getFullName(), "Приключения", "Словарь", "Энциклопедия");
        readers[0].returnBook(readers[0].getFullName(), books[0].getDenomination(),
                books[1].getDenomination(), books[2].getDenomination());


//вызываем третий раз метод returnBook()
      //  readers[0].returnBook("");






//печатаем все книги
/* Arrays.toString(Object[] a);
            System.out.println(Arrays.toReader(reader1));
            System.out.println(String.toString(books[0]));
*/

        for (Book book : books) {
            System.out.println(book);
        }
//печатаем всех читателей
        for (Reader reader : readers) {
            System.out.println(reader);
        }


    }
}
