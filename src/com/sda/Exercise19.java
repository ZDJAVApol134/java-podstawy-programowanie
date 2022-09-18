package com.sda;

import java.util.Scanner;

public class Exercise19 {

    //    Na podstawie zadanych z konsoli wartości oraz znaku (*, $, #...) narysuj:
    //    Trójkąt prostokątny.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length: ");
        int len = scanner.nextInt();

        System.out.println("Enter sign: ");
        String sign = scanner.next() + " ";

        for (int i = 1; i <= len; i++) {

            for (int j = 1; j <= i; j++) {

                if (i == 1 || i == len) {
                    System.out.print(sign);
                    continue;
                }

                if (j == 1 || j == i) {
                    System.out.print(sign);
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();

        }

    }
}
