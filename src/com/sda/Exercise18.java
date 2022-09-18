package com.sda;

import java.util.Scanner;

public class Exercise18 {


//    Na podstawie zadanych z konsoli wartości oraz znaku (*, $, #...) narysuj:
//    Literę „L”, o krawędziach równej długości.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length: ");
        int len = scanner.nextInt();

        System.out.println("Enter sign: ");
        String sign = scanner.next() + " ";

        for (int i = 1; i <= len; i++) {

            if (i == len) {
                for (int j = 0; j < len; j++) {
                    System.out.print(sign);
                }
                continue;
            }

            System.out.println(sign);
        }

    }
}
