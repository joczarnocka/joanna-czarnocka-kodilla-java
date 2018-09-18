package com.kodilla.good.patterns.challenges.ordering;

public class User {

    private String login;
    private String firstName;
    private String lastName;
    private String address;
    private String email;

    public User(String login, String firstName, String lastName, String address, String email) {
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "[" +
                "login='" + login + '\'' +
                ", imię='" + firstName + '\'' +
                ", nazwisko='" + lastName + '\'' +
                ", adres='" + address + '\'' +
                ", email='" + email + '\'' +
                ']';
    }
}
