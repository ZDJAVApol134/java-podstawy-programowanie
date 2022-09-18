package com.sda;

import java.util.Arrays;

public class Exercise30 {


    // Napisz program usuwający duplikaty z tablicy i zwracający nową tablicę, np.
    // Tablica wejściowa: [20, 20, 30, 40, 50, 50, 50],
    // Tablica wyjściowa: [20, 30, 40, 50]

    public static void main(String[] args) {

        int[] arr = new int[]{20, 20, 30, 40, 50, 50, 50};
        int[] arrWithoutDuplicate = new int[arr.length];

        int counter = 0;
        int counter2 = 0;
        for (int num : arr) {
            boolean contains = contains(arrWithoutDuplicate, num);
            if (contains) {
                continue;
            }
            arrWithoutDuplicate[counter++] = num;
            counter2++;
        }

        arrWithoutDuplicate = Arrays.copyOf(arrWithoutDuplicate, counter2);
        System.out.println(Arrays.toString(arrWithoutDuplicate));
    }

    private static boolean contains(int[] arr, int numbToCheck) {
        for (int numb : arr) {
            if (numbToCheck == numb) {
                return true;
            }
        }
        return false;
    }

}
