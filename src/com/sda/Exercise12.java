package com.sda;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise12 {

    /*
    *
      1. Wewnątrz pętli while (np. 3 razy) pobieraj produkt do kupienia i wprowadzaj go do utworzonej tablicy typu String.
      Wyświetl wszystkie produkty z wykorzystaniem pętli for, for each, oraz while.
    *
    */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int count = 5;

        String[] arr = new String[count];

        while (i < count) {
            arr[i] = scanner.next();
            i++;
        }

        System.out.println("============== fori loop =================");
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }

        System.out.println("============== foreach loop ==============");
        for (String numb : arr){
            System.out.println(numb);
        }

        System.out.println("============== while loop ================");
        int index = 0;

        while (index < arr.length){
            System.out.println(arr[index]);
            index++;
        }

    }
}
