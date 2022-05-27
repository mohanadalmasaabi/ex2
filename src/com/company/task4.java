package com.company;

public class task4 { public static void main(String[] args){

    int amountOfBricks;
    int containerCapacity;

    int randomNumber = (int)(Math.random()*(100-50));
    amountOfBricks = randomNumber;
    if(amountOfBricks%2==1){
        System.out.println("Amount of Bricks is: " + amountOfBricks);
    }else{
        System.out.println("The amount of bricks needs to be odd.");
    }

    int randomNumber2 = (int)(Math.random()*(10-5));
    containerCapacity = randomNumber2;
    if(containerCapacity%2==0){
        System.out.println("The amount of Lego blocks that can fit in a container is: " + containerCapacity);
    }else{
        System.out.println("The amount has to be even.");
    }
}

        }


