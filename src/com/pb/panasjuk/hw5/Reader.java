package com.pb.panasjuk.hw5;

public class Reader {
    private static int bookCount = 0;


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


    public static int takeBook(String fullName) {
        System.out.println(fullName + " взял " + bookCount + " книги");
        return bookCount;
    }
/*
    public static int takeBook(String fullName, String... denomination) {
        denomination[];
        System.out.println(fullName + " взял книги: " + denomination);
        return bookCount;
    }
*/

    public static int returnBook() {
        return bookCount;
    }

}
