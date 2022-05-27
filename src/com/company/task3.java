package com.company;

public class task3 {
    public static void main(String[] args) {


        int randomNumber = (int) (Math.random() * (100 - 1));

        if (randomNumber % 2 == 0) {
            System.out.println(randomNumber + " is an even number.");
        } else {
            System.out.println(randomNumber + " is an odd number.");

        }
    }
}