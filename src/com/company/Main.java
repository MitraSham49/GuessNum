package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // write your code here


        Random r = new Random(12353);
        int x = 1 + r.nextInt(10);
        int number;
        System.out.println("My random number is " + x);
        boolean done = false;
        String result;
        Scanner scan = new Scanner(System.in);
        while (done != true) {

            System.out.print("Enter your number: ");
            number = scan.nextInt();
            scan.nextLine();


            // add code
            if (number == x)
                System.out.println("you find it");
            else if (number < x)
                System.out.println("too low");
            else
                        System.out.println("too high");


//add code
            System.out.print("Do you want to enter another test score?(y/n)");
            result = scan.nextLine();
            if (result.equalsIgnoreCase("n"))
                done = true;


        }
    }
}