package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge sc = new SecondChallenge();
        try {
            sc.probablyIWillThrowException(3.0,1.5);
        } catch (Exception e) {
            System.out.println("Problem with Second Challenge " + e);
        } finally {
            System.out.println("After all operations");
        }

    }
}
