package com.kodilla.good.patterns.challenges.ordering;

public class OrderDto {
    private User user;
    private boolean IsOrdered;

    public OrderDto(User user, boolean isOrdered) {
        this.user = user;
        IsOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public boolean isOrdered() {
        return IsOrdered;
    }
}
