package com.pb.panasjuk.hw5;


public class Reader {
//кол-во читателей
    private static int readerCount = 0;
    public static int getReaderCount() {
        return readerCount;
    }

//поля
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
        readerCount++;
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





//перегруженные методы:

//первый метод takeBook()
    public void takeBook(int bookCount) {
        System.out.println(fullName + " взял " + bookCount + " книги");
        //return bookCount;
    }


//второй метод takeBook()
    public void takeBook(String... denominations) {
        System.out.print(fullName + " взял книги: ");

        for(int i = 0; i < denominations.length; i++) {
            System.out.print(denominations[i]);
            if(i < denominations.length - 1){
                System.out.print(", ");
            }
        } System.out.println("");

    }



//третий метод takeBook()
     public void takeBook(Book... books) {                                             //обьекты Book и вывод
         System.out.print(fullName + " взял книги: ");
         for(int i = 0; i < books.length; i++) {
             System.out.print(books[i]);
             if(i < books.length - 1){
                 System.out.print(", ");
             }
         }

         System.out.println("");
     }




//первый метод returnBook()
    public void returnBook(int bookCount) {
        System.out.println(fullName + " вернул " + bookCount + " книги");

    }



//второй метод returnBook()
    public void returnBook(String... denominations) {
        System.out.print(fullName + " вернул книги: ");

        for(int i = 0; i < denominations.length; i++) {
            System.out.print(denominations[i]);
            if(i < denominations.length - 1){
                System.out.print(", ");
            }
        } System.out.println("");
    }


//третий метод returnBook()
public void returnBook(Book... books) {                                             //обьекты Book и вывод
    System.out.print(fullName + " вернул книги: ");
    for(int i = 0; i < books.length; i++) {
        System.out.print(books[i]);
        if(i < books.length - 1){
            System.out.print(", ");
        }
    }

    System.out.println("");
}




}