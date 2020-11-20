package com.example.simplemobileapp;

import java.lang.reflect.Array;
import java.util.Scanner;

public class sorting {


    public static void main(String[] args) {
        System.out.println("Tentukan Jumlah Bilangan: ");
        Scanner input = new Scanner(System.in);
        int swap = 0, i, j;
        int size = input.nextInt();
        int[] array = new int[size];

        System.out.println("Masukkan Bilangan: ");
        for (i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        for (i = 0; i < size - 1; i++) {
            for (j = 0; j < size - i - 1; j++) {
//                System.out.println("[" + array[i] + "," + array[j] + "]" + " -> " + array[j]);
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                swap++;
//                System.out.println("Swap ke - " + swap);
            }
        }
        System.out.println("Hasil: ");
        for (i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

//        System.out.println(" ");
        System.out.print("Jumlah Swap: " + swap);

    }

}