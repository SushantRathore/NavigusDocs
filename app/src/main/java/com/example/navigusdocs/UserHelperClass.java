package com.example.navigusdocs;

public class UserHelperClass {

    String name;
    String email;
    String password;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    String phoneNumber;

    public UserHelperClass() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserHelperClass(String name, String phoneNumber ,String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
