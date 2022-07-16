package com.ironhack.bootcamp.exercices.s2;

import java.util.Scanner;

public class FindRandomInt {
    public static void main(String[] args) {

        int number = (int) (Math.random() * 10);
        int tries = 5;
        boolean numberFound = false;
        Scanner sc = new Scanner(System.in);


        int inputNumber;
        while (tries >= 0) {
            System.out.println("Input an Integer: ");
            inputNumber = sc.nextInt();
            if (inputNumber == number) {
                numberFound = true;
                break;
            }

            if (inputNumber > number) {
                System.out.println("Input number is higher than number to be guess");
                System.out.println("tries left: " + tries);
            } else if (inputNumber < number) {
                System.out.println("Input number is lower than number to be guess");
                System.out.println("tries left: " + tries);
            }
            tries--;
        }
        sc.close();
        if (numberFound) {
            System.out.println("Your number is correct: " + number);
            System.out.println("Congrats");
        } else {
            System.out.println("Sorry the number was: " + number);
            System.out.println("Next Time!");
        }
    }
}
