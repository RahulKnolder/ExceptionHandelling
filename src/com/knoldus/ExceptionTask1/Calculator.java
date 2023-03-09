package com.knoldus.ExceptionTask1;

public class Calculator {


    //Add method
    int add(int firstNumber, int secondNumber) {
        int sum = 0;
        try {
            sum = firstNumber + secondNumber;
        } catch (Exception e) {
            System.out.println("the input is not a valid number.");
        }
        return sum;
    }


    public int converToInteger(String stringInput) {
        int number = 0;
        try {
            number = Integer.parseInt(stringInput);
        } catch (NumberFormatException ex) {
            System.out.println(ex);
        }

        return number;
    }

    //subtract method
    int subtract(int firstNumber, int secondNumber) {
        int sub = 0;
        try {
            sub = firstNumber - secondNumber;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        return sub;
    }


    //product method
    int multiply(int firstNumber, int secondNumber) {
        int product = 1;
        try {
            product = firstNumber * secondNumber;
        } catch (Exception e) {
            System.out.println(e);
        }
        return product;
    }


    //devide method
    public double devide(int firstNumber, int secondNumber) throws CustomException {
        if (secondNumber == 0) {
            //throw custom exception
            throw new CustomException("division by zero is not allowed");
        }
        double quotient = firstNumber / secondNumber;
        return quotient;
    }

}
