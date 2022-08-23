package com.day1.session1;

import java.util.Scanner;

public class CheckPrimeNoLogic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("PE the no");
        int no = scanner.nextInt();

        boolean isPrime = isPrimeNumber(no);

        if (isPrime) {
            System.out.println("it is a prime no");
        } else {
            System.out.println("it is not a prime no");
        }

        scanner.close();
    }

    public static boolean isPrimeNumber(int no) {
        boolean isPrime = true;

        for (int i = 2; i < no; i++) {
            if (no % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
