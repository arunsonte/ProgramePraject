package com.ar;


import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int result = 1;

        for(int i = 1; i <= num; i++) {
            result *= i;
        }

        System.out.println("Factorial of " + num + " is " + result);
    }
}
