package com.sda;

import java.util.Scanner;

public class Exercise3 {

    /*
    *
    * 2. Wprowadź z poziomu konsoli dwie wartości, dodaj je do siebie i wypisz ich sumę.
    *
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numb1 = scanner.nextInt();
        int numb2 = scanner.nextInt();
        int result = numb1 + numb2;
        System.out.println(result);

//        System.out.println(scanner.nextInt() + scanner.nextInt());
    }

}
