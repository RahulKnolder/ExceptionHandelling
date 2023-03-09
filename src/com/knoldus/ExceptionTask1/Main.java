package com.knoldus.ExceptionTask1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner readNumber = new Scanner(System.in);

        Calculator calculatorObject = new Calculator();


        System.out.println("1 for devide");
        System.out.println("2  for add");
        System.out.println("3 from multiply");
        System.out.println("4 subtract");
        System.out.println("5 for changing string into integer");
        System.out.println("choose");


        //select form the above options
        int Selector = readNumber.nextInt();

        //read input of the variables
        System.out.println("enter 1st number");
        int firstNumber = readNumber.nextInt();
        System.out.println("enter 2nd number");
        int secondNUmber = readNumber.nextInt();


        //switch statement
        switch (Selector) {
            case 1:
                try {
                    System.out.println(calculatorObject.devide(firstNumber, secondNUmber));
                } catch (CustomException ex) {
                    System.out.println(ex);
                }
                break;
            case 2:
                System.out.println(calculatorObject.add(firstNumber, secondNUmber));
                break;
            case 3:
                System.out.println(calculatorObject.multiply(firstNumber, secondNUmber));
                break;
            case 4:
                System.out.println(calculatorObject.subtract(firstNumber, secondNUmber));
                break;
            case 5:
                String input = readNumber.nextLine();
                System.out.println(calculatorObject.converToInteger(input));
                break;
        }
    }
}
