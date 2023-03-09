package com.knoldus.ExceptionTask2;

import java.util.Random;
import java.util.Scanner;


//method to generate random method
public class GuessingGame {
    public int randomNumber() {
        Random rn = new Random();
        int randomNumber = rn.nextInt(100) + 1;
        return randomNumber;
    }


    //guessing game function
    public void guessingGame() {
        Scanner in = new Scanner(System.in);

        //calling random function and storing iit into another variable
        int randomNUmber = randomNumber();
        boolean rightAnswer = false;
        int answer = 0;

        while (!rightAnswer) {

            System.out.println("Guess a number between 1 and 100: ");
            answer = in.nextInt();


            // if answer  is greater than actual
            if (randomNUmber > answer) {
                System.out.println("Too low, try again");
            }

            // if answer is less than actual
            else if (randomNUmber < answer) {
                System.out.println("Too high, try again");
            }

            // answer is equal to actual value
            else {
                System.out.println("Yes, you guessed the number.");
                rightAnswer = true;

                // to terminate and exit form the programe
                System.exit(0);
            }
        }

    }
}



