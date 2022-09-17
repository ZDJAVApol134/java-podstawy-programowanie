package com.sda;

import java.util.Scanner;

public class Exercise10 {


    /*
     * Wewnątrz pętli while (np. 5 razy) pobierz dowolna liczbe.
     * Zwróć sumę wartości liczb parzystych oraz liczb nieparzystych
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int iterations = 5;
        long oddNumbersSum = 0;
        long evenNumbersSum = 0;

        while (i < iterations) {
            int input = scanner.nextInt();

            if (input % 2 == 0) {
                evenNumbersSum += input;
            } else {
                oddNumbersSum += input;
            }

            i++;
        }

        System.out.println("Odd Numbers Sum: " + oddNumbersSum);
        System.out.println("Even Numbers Sum: " + evenNumbersSum);

    }
}
