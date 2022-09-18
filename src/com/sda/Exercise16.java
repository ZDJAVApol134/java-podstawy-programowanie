package com.sda;

import java.util.Scanner;

public class Exercise16 {


//    Na podstawie zadanych z konsoli wartości oraz znaku (*, $, #...) narysuj:
//    1. Kwadrat pusty w środku (wyłącznie krawędzie).

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length: ");
        int len = scanner.nextInt();

        for (int i = 0; i < len; i++) {

            for (int j = 0; j < len; j++) {

                if (i == 0 || i == len - 1) {
                    System.out.print("#  ");
                    continue;
                }

                if (j == 0 || j == len - 1) {
                    System.out.print("#  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }
}
