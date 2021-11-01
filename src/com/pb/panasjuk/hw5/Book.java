package com.pb.panasjuk.hw5;

public class Book {
    private String denomination;
    private String author;
    private int year;

 //конструктор с тремя аргументами
 public Book(String denomination, String author, int year) {
     this.denomination = denomination;
     this.author = author;
     this.year = year;
 }

//переопределение метода toString()
    public String toString() {
      return "[Наименование: " + denomination +
              ", автор книги: " + author +
              ", год издания: " + year +
              " г.]";
    }


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


    /*
//метод который будет печатать всю информацию
    String getInfoBook() {
        return "[Наименование: " + denomination + ", автор книги: " + author + ", год издания: " + year + " г.]";
    }

*/

}



