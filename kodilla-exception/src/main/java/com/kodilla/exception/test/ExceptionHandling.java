package com.kodilla.exception.test;

public class ExceptionHandling extends Exception{
    public static void main(String[] args) throws Exception {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String result = secondChallenge.probablyIWillThrowException(1.2, 1.5);
            System.out.println(result);

        }catch (ExceptionHandling e){
            System.out.println("Exception: " + e);

        }finally {
            System.out.println("Good bye.");
        }
    }
}
