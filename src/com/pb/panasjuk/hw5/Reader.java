package com.pb.panasjuk.hw5;

import java.util.Arrays;
import java.util.StringJoiner;

public class Reader {
    private static int bookCount = 0;
    public static int getBookCount() {
        return bookCount;
    }


    private String fullName;
    private int cardNumber;
    private String faculty;
    private String dob;
    private String phone;

//конструктор с пятью аргументами
    public Reader(String fullName, int cardNumber, String faculty, String dob, String phone) {
        this.fullName = fullName;
        this.cardNumber = cardNumber;
        this.faculty = faculty;
        this.dob = dob;
        this.phone = phone;
    }

//переопределение метода toString()
    public String toString() {
        return "[Читатель: " + fullName +
                ", номер читательского билета: " + cardNumber +
                ", факультет: " + faculty +
                ", дата рождения: " + dob +
                ", телефон: " + phone +
                "]";
    }


//геттеры и сеттеры
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }





//перегруженные методы

//первый метод takeBook()
    public void takeBook(String fullName, int bookCount) {
        System.out.println(fullName + " взял " + bookCount + " книги");
        //return bookCount;
    }

    public void takeBook(int bookCount) {
        System.out.println(fullName + " взял " + bookCount + " книги");
        //return bookCount;
    }
//второй метод takeBook()
    public void takeBook(String fullName, String... denominations) {
        System.out.print(fullName + " взял книги: ");

        for(int i = 0; i < denominations.length; i++) {
            System.out.print(denominations[i]);
            if(i < denominations.length - 1){
                System.out.print(", ");
            }
        } System.out.println("");
        //return bookCount;
    }



//третий метод takeBook()
   /*

    public void takeBook(String fullName, int... Book) {
        System.out.println(fullName + " взял книги: ");
        for (Book book : books) {
            System.out.println(book);
        }
        //return bookCount;
    }

*/



//первый метод returnBook()
    public void returnBook(String fullName, int bookCount) {
        System.out.println(fullName + " вернул " + bookCount + " книги");

    }



//второй метод returnBook()

    public void returnBook(String fullName, String... denominations) {
        System.out.print(fullName + " вернул книги: ");

        for(int i = 0; i < denominations.length; i++) {
            System.out.print(denominations[i]);
            if(i < denominations.length - 1){
                System.out.print(", ");
            }
        } System.out.println("");
        //return bookCount;
    }

//третий метод returnBook()
    public void returnBook(Book... books) {
        System.out.println(fullName + " вернул книги: ");
        for(int i = 0; i < books.length; i++) {
            System.out.print(books[i]);
            if(i < books.length - 1){
                System.out.print(", ");
            }
        } System.out.println("");

    }

    /*

*/




}




/*//второй метод takeBook()
    public void takeBook(String fullName, String... denominations) {
        //System.out.println(denominations[0]);
        System.out.print(fullName + " взял книги: ");
        StringJoiner stringJoiner = new StringJoiner(",");


        for(String denomination: denominations) {
            stringJoiner.add("");
            System.out.print(stringJoiner.toString() + denomination);
        }



        */