package com.gradedproject.q2;

import java.util.Scanner;

public class PowerRecursion {
    private static int power(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * power(x, n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base number X: ");
        int x = scanner.nextInt();
        System.out.print("Enter the power N = ");
        int n = scanner.nextInt();
        

        int result = power(x, n);
        System.out.println("X power N is: " + result);
    }
}

