package com.kodilla.testing.calculator;

public class Calculator {
    int firstNumber;
    int secondNumber;

    public Calculator(int firstNumber, int secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int add(int a, int b){
        int result;
        result = a + b;
        return result;
    }

    public int subtract(int a, int b){
        int result;
        result = a - b;
        return result;
    }
}
