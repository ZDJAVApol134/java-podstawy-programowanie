package com.sda;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise27 {

    //    6. Napisz program, który zwraca w postaci tablicy zbiór wszystkich liczb mniejszych
    //    od zadanej przez użytkownika liczby oraz:
    //        a) Podzielnych przez 2
    //        b) Podzielnych przez 3
    //        c) Podzielnych przez zadaną przez użytkownika liczbę


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int userInput = scanner.nextInt();

        int dividableBy2 = calculateSize(userInput, 2);
        int dividableBy3 = calculateSize(userInput, 3);

        int[] dividableBy2Arr = createArray(userInput, dividableBy2, 2);
        int[] dividableBy3Arr = createArray(userInput, dividableBy3, 3);

        System.out.printf("Numbers smaller then %d dividable by 2: %s\n", userInput, Arrays.toString(dividableBy2Arr));
        System.out.printf("Numbers smaller then %d dividable by 3: %s\n", userInput, Arrays.toString(dividableBy3Arr));
    }

    private static int[] createArray(int length, int size, int mod) {
        int[] arr = new int[size];

        size = 0;
        for (int i = 0; i < length; i++) {
            if (i % mod == 0) {
                arr[size++] = i;
            }
        }
        return arr;
    }

    private static int calculateSize(int arrayLength, int mod) {
        int counter = 0;
        for (int i = 0; i < arrayLength; i++) {
            if (i % mod == 0) {
                counter++;
            }
        }
        return counter;
    }

}
