package com.kodilla.good.patterns.challenges;

public class User {
    private String userName;
    private String firstName;
    private String surname;

    public User(String userName, String firstName, String surname) {
        this.userName = userName;
        this.firstName = firstName;
        this.surname = surname;
    }

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }
}
