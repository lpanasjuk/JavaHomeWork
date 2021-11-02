package com.pb.panasjuk.hw5;


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


//методы takeBook() и returnBook():
//вызываем первый раз метод takeBook()
        readers[0].takeBook(3);


//вызываем второй раз метод takeBook()
        readers[0].takeBook(readers[0].getFullName(), books[0].getDenomination(),
                books[1].getDenomination(), books[2].getDenomination());

//вызываем третий раз метод takeBook()
        readers[0].takeBook(books[0],books[1],books[2]);


//вызываем первый раз метод returnBook()
        readers[0].returnBook(readers[0].getFullName(), 3);

//вызываем второй раз метод returnBook()
        readers[0].returnBook(readers[0].getFullName(), books[0].getDenomination(),
                books[1].getDenomination(), books[2].getDenomination());

//вызываем третий раз метод returnBook()
      readers[0].returnBook(books[0],books[1],books[2]);



//печатаем все книги
        System.out.println("Печатаем все книги: ");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getInfo());
        }


//печатаем всех читателей
        System.out.println("Печатаем всех читателей: ");
        for (Reader reader : readers) {
            System.out.println(reader);
        }

//кол-во книг и читателей в библиотеке
        System.out.println("Кол-во книг в библиотеке: " + Book.getBookCount());
        System.out.println("Кол-во читателей в библиотеке: " + Reader.getReaderCount());

    }
}
