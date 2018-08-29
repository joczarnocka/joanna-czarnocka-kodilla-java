package com.kodilla.stream.forumuser;

import java.time.LocalDate;

final public class ForumUser {
    final private int identifier;
    final private String username;
    final private char gender;
    final private LocalDate birthdate;
    final private int postsNumber;

    public ForumUser(final int identifier, final String username, final char gender, final LocalDate birthdate, final int postsNumber) {
        this.identifier = identifier;
        this.username = username;
        this.gender = gender;
        this.birthdate = birthdate;
        this.postsNumber = postsNumber;
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getUsername() {
        return username;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "identifier=" + identifier +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                ", birthdate=" + birthdate +
                ", postsNumber=" + postsNumber +
                '}';
    }
}
