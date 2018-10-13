package com.company;

import java.util.Scanner;

public class Swap {
    //Swap two integer values without using a temporary extra variable.
    public static void main(String[] args) {
        switcheroo();
    }

    public static void switcheroo() {
        int x, y;

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Input first integer: ");
            x = sc.nextInt();

            System.out.println("Input second integer: ");
            y = sc.nextInt();

            // Operations are performed from left to right, left-most assignment is performed last;
            // right-most assignment writes old x in y and yields old x; x ^ (old)y ^ x <=> (old)y;
            // then left-most assignment writes old y in x.
            x = y ^ x ^ (y = x);
            System.out.println("New values of x and y are "+ x + ", " + y);
        }
        catch(Exception e){
            System.out.println("Please put in valid integers");
        }
    }
}
