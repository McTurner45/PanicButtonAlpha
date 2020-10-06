package com.danielkim.soundrecorder.Model;

public class EmegContact {

    String name;
    String phone;
    String Idnum;

    public EmegContact(String name, String phone, String idnum) {
        this.name = name;
        this.phone = phone;
        Idnum = idnum;
    }

    public EmegContact() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdnum() {
        return Idnum;
    }

    public void setIdnum(String idnum) {
        Idnum = idnum;
    }
}
