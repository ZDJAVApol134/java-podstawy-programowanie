package com.sda;

import java.util.Scanner;

public class Exercise17 {


//    Na podstawie zadanych z konsoli wartości oraz znaku (*, $, #...) narysuj:
//    1. Prostokąt pusty w środku.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length: ");
        int a = scanner.nextInt();

        System.out.println("Enter height: ");
        int h = scanner.nextInt();

        for (int i = 0; i < h; i++) {

            for (int j = 0; j < a; j++) {

                if (i == 0 || i == h - 1) {
                    System.out.print("#  ");
                    continue;
                }

                if (j == 0 || j == a - 1) {
                    System.out.print("#  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }
}
