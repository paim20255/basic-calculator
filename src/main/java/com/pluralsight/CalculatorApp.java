package com.pluralsight;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);

        char add = 'A';
        char subtraction = 'S';
        char multipy = 'M';
        char divide = 'D';


        System.out.println("Enter the first number: ");
        int firstNumber = myScanner.nextInt();

        System.out.println("Enter the second number: ");
        int secondNumber = myScanner.nextInt();
        myScanner.nextLine();

        int result = firstNumber * secondNumber;

        System.out.println("Possible calculations: ");
        System.out.println("(A)dd" );
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");
        System.out.println("Please select an option:  M");

        System.out.println();
        System.out.println(firstNumber + " * " + secondNumber + " = " + result);













    }
}

