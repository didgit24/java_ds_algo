package com.algo.dynamicProgramming;

// Fibonacci Series using Dynamic Programming

//Time complexity O(n), but space complexity increases
class Fibonacci
{
    /* Declare an array to store Fibonacci numbers. */
    private static int[] f;

    static void init(int n)
    {    /* 0th and 1st number of the series are 0 and 1*/
        f = new int[n+1];
        f[0] = 0;
        f[1] = 1;
    }

    static int fib(int n)
    {
        int i;

        for (i = 2; i <= n; i++)
        {
           /* Add the previous 2 numbers in the series
             and store it */
            f[i] = f[i-1] + f[i-2];
        }

        return f[n];
    }

    public static void main (String args[])
    {
        int n = 9;
        init(n);
        System.out.println(fib(n));
    }
} 
