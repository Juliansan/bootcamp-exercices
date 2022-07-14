package com.ironhack.bootcamp.exercices.s2;

import java.util.Arrays;

public class ArrayLoopMain {
    public static void main(String[] args) {

        int [] numbers = {1, 2, 3, 4, 5};
        int [] new_numbers = new int[numbers.length];
        int [] multipled_numbers = new int[numbers.length];
        int counter = numbers.length;

        for (int i = 0; i < numbers.length; i++) {
            new_numbers[counter - 1] = numbers[i];
            counter -= 1;


        }

        for (int i = 0; i < new_numbers.length; i++) {
           System.out.println(new_numbers[i]);
        }

        // Multiplicar todos los elementos del Array * 100
        for (int i = 0; i < numbers.length; i++) {
            multipled_numbers[i] = numbers[i] * 100;
        }
        for (int num:multipled_numbers) {
            System.out.println(num);
        }
    }
}
