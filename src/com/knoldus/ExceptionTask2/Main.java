package com.knoldus.ExceptionTask2;

public class Main {
    public static void main(String[] args) {

        GuessingGame random_object = new GuessingGame();

        //after catching exception it will again invoke the message;
        boolean tryAgain = true;
        while (tryAgain) {
            try {
                random_object.guessingGame();
            } catch (Exception e) {
                System.out.println("invalid input");
            }
        }


    }
}
