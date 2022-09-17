package com.sda;

import java.util.Scanner;

public class Exercise9 {

    /*
     * 2. Stwórz pętle while, która wykona 5 iteracji.
     * Wewnątrz pętli pobieraj z konsoli dowolną wartość typu int.
     * Po wyjściu z pętli zwróć średnia tych wartości.
     *
     * */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i = 0;
        long sum = 0;
        int iterations = 5;

        while (i < iterations) {
            int input = scanner.nextInt();
            sum += input;
            i++;
        }

        System.out.println("Average: " + sum / iterations);
    }
}
