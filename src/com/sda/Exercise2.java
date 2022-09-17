package com.sda;

import java.util.Scanner;

public class Exercise2 {
/*

1. Wprowadź swoje imię z poziomu konsoli i zapisz je do zmiennej typu String. Wypisz na konsolę „Witaj, <imię>”.

*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.printf("Witaj %s", name);
    }

}
