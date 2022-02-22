package com.vladarsenjtev;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static final int MAX_ARRAY_LENGTH = 4999;
    public static final int MAX_ARRAY_INT = 5000;


    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[random.nextInt(MAX_ARRAY_LENGTH) + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(MAX_ARRAY_INT);
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
        sortArrays(array);
        System.out.println(Arrays.toString(array));
    }

    public static int [] sortArrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] % 2 != 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}