package com.sda;

import java.util.Scanner;

public class Exercise4 {

    /*
    *
    *   1. Pobierz liczbe z konsoli - skorzystaj z metody Scannera „nextInt”.
        Przetestuj liczbe dla każdego przypadku (liczba mniejsza, równa lub większa od 10).
    *
    * */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please input integer");
        int number = input.nextInt();

        if (number == 10) {
            System.out.println("Integer equals 10");
        }
        else if (number < 10) {
            System.out.println("Integer is smaller than 10");
        }
        else {
            System.out.println("Integer is bigger than 10");
        }

    }

}
