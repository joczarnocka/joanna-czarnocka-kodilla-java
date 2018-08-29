package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "adam", 'M', LocalDate.of(2000, 01, 01), 20));
        userList.add(new ForumUser(2, "barbara", 'K', LocalDate.of(2001, 02, 01), 10));
        userList.add(new ForumUser(3, "cezary", 'M', LocalDate.of(1980, 03, 01), 2));
        userList.add(new ForumUser(4, "dorota", 'K', LocalDate.of(1960, 04, 01), 10));
        userList.add(new ForumUser(5, "edward", 'M', LocalDate.of(1970, 05, 01), 3));
        userList.add(new ForumUser(6, "franciszek", 'M', LocalDate.of(1950, 06, 01), 20));
        userList.add(new ForumUser(7, "genowefa", 'K', LocalDate.of(1940, 07, 20), 20));
        userList.add(new ForumUser(8, "henryk", 'M', LocalDate.of(1930, 07, 20), 0));
    }

    public List<ForumUser> getUserList()
    {
        return new ArrayList<>(userList);
    }

}
