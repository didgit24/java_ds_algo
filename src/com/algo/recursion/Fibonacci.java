package com.algo.recursion;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    //Fibonacci Series
    //0 1 1 2 3 5 8 13 21 34 55 89 144...........

    //iterative //Time complexity 0(n)
    public int getFibonacciIterative(int position) {
        Map<Integer, Integer> fibonacciMap = new HashMap<>();

        //Making first two positions 0 and 1
        fibonacciMap.put(0, 0);
        fibonacciMap.put(1, 1);

        for (int i = 2; i < position + 1; i++) {
            fibonacciMap.put(i, fibonacciMap.get(i - 2) + fibonacciMap.get(i - 1));
        }

        return fibonacciMap.get(position);
    }

    //recursive   //Time complexity 0(2^n)  //Not ideal as iterative is 0(n)
    public int getFibonacciRecursive(int position) {
        if (position < 2) {
            return position;
        }
        return getFibonacciRecursive(position - 1) + getFibonacciRecursive(position - 2);
    }

    public static void main(String args[]) {
        Fibonacci fibonacci = new Fibonacci();

        System.out.println("Fibonacci number: " + fibonacci.getFibonacciRecursive(1));

        System.out.println("Fibonacci number: " + fibonacci.getFibonacciIterative(1));
    }
}
