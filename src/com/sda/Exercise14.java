package com.sda;

public class Exercise14 {

    /*

     3. Stwórz tablicę zawierającą 5 imion. Wewnątrz pętli for-each polacz imiona zapisujac je w zmiennej typu String,
     oddzielając je przecinkami. Wyświetl utworzony łańcuch znaków. Np. „Małgorzata, Jan, Jakub”

    */
    public static void main(String[] args) {

        String[] names = {"Bob", "Sue", "Kate", "Jan", "Jakub"};

        StringBuilder namesString = new StringBuilder();

        for (String name : names) {
            namesString.append(name).append(", ");
        }

        System.out.println(namesString.substring(0, namesString.length() - 2));
    }


}
