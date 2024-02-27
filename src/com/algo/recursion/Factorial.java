package com.algo.recursion;

public class Factorial {

    //iterative function
    public int findFactorialIterative(int number) {
        int factorial = 1;

        if (number == 0 || number == 1) {
            factorial = 1;
        } else if (number == 2) {
            factorial = 2;
        } else {
            for (int i = 2; i <= number; i++) {
                factorial = factorial * i;
            }
        }
        return factorial;
    }

    public int findFactorialRecursive(int number) {
        int factorial = 1;

        // Handling base case
        // If value of n=1 or n=0, it returns 1
        if (number == 0 || number == 1)
            return 1;
        else if (number == 2)
            return 2;

        // Generic case
        // Otherwise we do n*(n-1)!
        return number * findFactorialRecursive(number - 1);
    }

    public static void main(String args[]) {
        Factorial factorial = new Factorial();

        //iterative function  //Time complexity 0(n)
        int output1 = factorial.findFactorialIterative(5);
        System.out.println("Iterative function factorial output: "+ output1);

        //recursive function  //Time complexity 0(n)
        int output2 = factorial.findFactorialRecursive(5);
        System.out.println("Recursive function factorial output: "+ output2);
    }
}
