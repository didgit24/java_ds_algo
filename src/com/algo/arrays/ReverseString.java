package com.algo.arrays;

import java.util.Arrays;

public class ReverseString {
    String reverseString(String inputString) {
        String outputString = "";
        char ch;

        for (int i=0; i<inputString.length(); i++) {
            ch = inputString.charAt(i);
            outputString = ch + outputString;
        }

        return outputString;
    }

    String reverseStringBuiltInMethod(String inputString) {
        byte[] strAsByteArray = inputString.getBytes();

        byte[] result = new byte[strAsByteArray.length];

        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];

        String outputString = new String(result);

        return outputString;
    }

    StringBuilder reverseStringBuiltInMethod2(String inputString) {
        StringBuilder outputString = new StringBuilder();

        outputString.append(inputString);

        outputString.reverse();

        return outputString;
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        System.out.println("Reversed string: " + reverseString.reverseString("Input"));

        System.out.println("Reversed string: " + reverseString.reverseStringBuiltInMethod("Input"));

        System.out.println("Reversed string: " + reverseString.reverseStringBuiltInMethod2("Input"));
    }
}
