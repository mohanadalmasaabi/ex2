package com.company;



    public class tasl_2 {
        public static void main(String[] args){

            float earthWeightalmassabi;
            float marsWeightalmassabi;
            double marsWeightalmassabiInDouble;
            int marsWeightalmassabiInInt;

            earthWeightalmassabi = 50;
            marsWeightalmassabi = earthWeightalmassabi*0.38F;
            System.out.println(earthWeightalmassabi + " kg on Earth is " + marsWeightalmassabi + " kg on Mars.");

            marsWeightalmassabiInDouble = marsWeightalmassabi;
            System.out.println("Mass on Mars after converting to double is: " + marsWeightalmassabiInDouble);

            System.out.printf("Mass on Mars displayed after converting it into four decimal points is: %.4f %n", marsWeightalmassabiInDouble);

            marsWeightalmassabiInInt = (int)marsWeightalmassabiInDouble;
            System.out.println("After being casted to integer: " + marsWeightalmassabiInInt);

            char c = (char)marsWeightalmassabiInInt;
            System.out.println("ASCII table equivalent to marsWeightLusajoInInt is " + c);

            int MathExampleOnChar = c*c;
            System.out.println("An Example of a Mathematical operation on char is: " +  MathExampleOnChar);
        }
    }

