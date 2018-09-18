package com.kodilla.good.patterns.challenges.ordering;

public class MailImplInformationService implements InformationService{

    @Override
    public void inform(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName()
                +", zamówienie zostało złożone.");
    }
}
