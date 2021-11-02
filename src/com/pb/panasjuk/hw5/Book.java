package com.pb.panasjuk.hw5;

public class Book {
    private static int bookCount = 0;
    public static int getBookCount() {
        return bookCount;
    }

//поля
    private String denomination;
    private String author;
    private int year;

 //конструктор с тремя аргументами
 public Book(String denomination, String author, int year) {
     this.denomination = denomination;
     this.author = author;
     this.year = year;
     bookCount++;
 }

//переопределение метода toString()
    public String toString() {
      return "" + denomination +
              " (" + author +
              " " + year +
              " г.)";
    }



//геттеры и сеттеры
    public String getDenomination() {
     return denomination;
    }

    public void setDenomination(String denomination) {
     this.denomination = denomination;
    }

    public String getAuthor() {
     return author;
    }

    public void setAuthor(String author) {
     this.author = author;
    }

    public int getYear() {
     return year;
    }

    public void setYear(int year) {
     this.year = year;
    }


//для получения инфы по всем книгам
    String getInfo() {
        return "[Название: " + denomination + ", автор: " + author + ", год издания: "
                + year + "]";
    }


}

