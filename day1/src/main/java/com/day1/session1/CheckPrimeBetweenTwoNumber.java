package com.day1.session1;

import java.util.Scanner;

public class CheckPrimeBetweenTwoNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("PE the n1");
        int n1 = scanner.nextInt();
        
        System.out.println("PE the n2");
        int n2 = scanner.nextInt();

        int numberOfPrime=calculatePrimeNumberBetweenTwoGivenNumber(n1, n2);
        
        System.out.println("numberOfPrime: "+ numberOfPrime);
        
        scanner.close();
    }

    public static int calculatePrimeNumberBetweenTwoGivenNumber(int n1, int n2){
        int numberOfPrime=0;
        //validation is very imp part of the programming
        for(int i=n1; i<=n2; i++){
            if(isPrimeNumber(i)){
                numberOfPrime++;
            }
        }
        return numberOfPrime;
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
