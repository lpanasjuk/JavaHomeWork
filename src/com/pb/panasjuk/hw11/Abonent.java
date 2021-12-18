package com.pb.panasjuk.hw11;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Abonent implements Serializable, Comparable<Abonent> {
    String fullName;
    String dateOfBirth;
    String phone;
    private String address;
    private LocalDateTime redaction;

//конструктор
    public Abonent(String fullName, String dateOfBirth, String phone, String address, LocalDateTime redaction) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.address = address;
        this.redaction = redaction;
    }

//геттеры и сеттеры


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDob() {
        return dateOfBirth;
    }

    public void setDob(String dob) {
        this.dateOfBirth = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getRedaction() {
        return redaction;
    }

    public void setRedaction(LocalDateTime redaction) {
        this.redaction = redaction;
    }

    @Override
    public int compareTo(Abonent o) {
        return 0;
    }




    @Override
    public String toString() {
        return " " +
                "Фамилия: " + fullName +
                ", дата рождения: " + dateOfBirth +
                ", телефон: " + phone +
                ", адрес: " + address +
                ", последние изменения: " + redaction +
                ' ';
/*
//пробую создать метод для поиска абонента по фамилии
        public void FindNumberPhone(String fullName) {
            List<Abonent> result = new ArrayList<>();
            for(Abonent str:result) {
                if(str.getFullName().equals(fullName)) {
                    System.out.println("Найден абонент");
                    System.out.println(str);
                }
            }
            if (result.size() == 0) System.out.println("абонент с такой фамилией не найден");
        }
*/

    }
}
