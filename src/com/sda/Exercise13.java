package com.sda;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise13 {

    /*
    * 2. Utwórz tablicę przechowującą wartości typu int o rozmiarze zadanym z konsoli.
      Wypełnij ją wartościami wewnątrz pętli for. Zwróć sumę tych wartości.

      * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrLength = scanner.nextInt();

        int[] arr = new int[arrLength];
        long sum = 0;
        for (int i = 0; i < arrLength; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Sum: " + sum);

    }
}
