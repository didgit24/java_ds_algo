package com.algo.big0;

import java.sql.Array;
import java.util.Arrays;

public class FunChallenge {

    public int funChallengeBig0(int input) {
        int a = 10; //O(1)
        a = 50 + 3; //O(1)

        for (int i = 0; i<input ; i++) { //O(n)
            anotherFunction();  //O(n)
            boolean randomFlag = true;  //O(n)
            a++; //O(n)
        }
        return a; //O(1)
    }

    public void anotherFunction() {}

    /*
    *
    */

    public void anotherFunChallenge(int input) {
        int a = 5; //O(1)
        int b = 10; //O(1)
        int c = 50; //O(1)

        for (int i = 0; i<input ; i++) { //O(n)
            int x = i + 1; //O(n)
            int y = i + 2; //O(n)
            int z = i + 3; //O(n)
        }

        for (int j = 0; j<input ; j++) { //O(n)
            int p = j * 2; //O(n)
            int q = j * 2; //O(n)
        }

        String whoAmI = "I don't know"; //O(1)
    }

    /*
     *
     */

    public void printFirstItemThenFirstHalfThenSayHi100Times(double[] items) {
        System.out.println(items[0]);

        double middleIndex = Math.floor(items.length / 2);
        double index = 0;

        while (index < middleIndex) {
            System.out.println(items[(int) index]);
            index ++;
        }

        for (int i = 0; i < 100; i++) {
            System.out.println("hi");
        }
    }

    /*
     *
     */

    public void printAllPairs(String[] values) {
        for (int i = 0; i<values.length; i++) { //O(n)
            for (int j = 0; j<values.length; j++) { //O(n)
                    System.out.print("Pairs: " + values[i] + values[j] + " ");
            }
            System.out.println();
        }
    }

    public void boo(int value) {
            for (int j = 0; j<value; j++) { //O(1)
                System.out.print("boooooooo!");
            }
    }

    public void boo2(int value) {
        String[] hiArray = new String[value];
        for (int j = 0; j<value; j++) { //O(1)
            hiArray[j] = "hi"; //)(n)
            System.out.print(hiArray[j] + "boooooooo!");
        }
    }

    public static void main(String args[]) {
        FunChallenge funChallenge = new FunChallenge();
        int output = funChallenge.funChallengeBig0(10);
        //note - Total BigO for the function funChallengeBig0 is O(1)+O(1)+O(1)+O(n)+O(n)+O(n)+O(n) = O(3+4n) = O(n)

        funChallenge.anotherFunChallenge(10);
        //note - Total BigO for the function anotherFunChallenge is O(4+5n) = O(n)

        funChallenge.printFirstItemThenFirstHalfThenSayHi100Times(new double[10]);
        //note - Total BigO for the function printFirstItemThenFirstHalfThenSayHi100Times is O(1+n/2+100) = O(n/2 + 101) = O(n+1) = o(n)
        //note - Drop the constants while calculating

        String[] boxes = new String[]{"1", "2", "3", "4", "5"};
        funChallenge.printAllPairs(boxes);
        //note - Nested loops BigO will be multiplied. Big(n * n) = Big(n^2) = Quadratic Equation

        funChallenge.boo(5);
        //note - Only one variable is getting created in for loop initialization, so space complexity is BigO(1)

        funChallenge.boo2(5);
        //note - Only one variable is getting created in for loop initialization, BigO(1). Array have multiple initialization, BigO(n). So total space complexity. Big(n) + Big(1) = Big(n)
    }
}
