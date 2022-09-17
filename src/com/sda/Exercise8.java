package com.sda;

import java.util.Scanner;

public class Exercise8 {

    /*
     * 1. Wewnątrz pętli while (np. 5 razy) dowolne dane przy uzyciu Scannera i wyświetlaj w konsoli:
     * <numer iteracji>. Dane: <Twoje pobrane dane>

     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 1;
        while (i < 6) {
            String input = scanner.next();
            System.out.printf("%d. Dane: %s\n", i, input);
            i++;
        }

    }
}
