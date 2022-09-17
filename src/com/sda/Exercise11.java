package com.sda;

import java.util.Scanner;

public class Exercise11 {

    /*
     * 4. Pobieraj i wyświetlaj dowolny ciąg znaków od użytkownika tak długo, aż nie napisze „exit” uzyj petli do while.
     *
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input;

        do {
            input = scanner.next();
            System.out.println("User input: \"" + input + "\"");
        } while (!input.equalsIgnoreCase("EXIT"));

    }
}
