package com.pb.panasjuk.hw11;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Abonent implements Serializable {
    private String fullName;
    private String dateOfBirth;
    private String phone;
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
    public String toString() {
        return " " +
                "ФИО: " + fullName +
                ", дата рождения: " + dateOfBirth +
                ", телефон: " + phone +
                ", адрес: " + address +
                ", последние изменения: " + redaction +
                ' ';
    }
}
