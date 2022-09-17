package com.sda;

public class Exercise15 {

//         4. Jak wyżej, ale dopisuj tylko imiona, które składają się z mniej, niż 5 znaków.

    public static void main(String[] args) {
        String[] names = {"Kamil", "Sue", "Kate", "Jan", "Jakub"};

        StringBuilder namesString = new StringBuilder();

        for (String name : names) {
            if (name.length() < 5) {
                namesString.append(name).append(", ");
            }
        }

        System.out.println(namesString.substring(0, namesString.length() - 2));
    }
}
