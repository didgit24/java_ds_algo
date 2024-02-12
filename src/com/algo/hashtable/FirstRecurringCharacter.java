package com.algo.hashtable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class FirstRecurringCharacter {

    //Time complexity - O(n)^2   Space complexity - O(1)
    public Integer findMethodBruteForce(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) { //O(n)
            for (int j = i+1; j < inputArray.length; j++) { //O(n)
                if (inputArray[i] == inputArray[j]) {
                    return inputArray[i];
                }
            }
        }
        return null;
    }

    //Time complexity - O(n)    Space complexity - O(n)
    public Integer findMethod(int[] inputArray) {
        Map hashMap = new HashMap(inputArray.length);
        for (int i = 0; i <inputArray.length; i++) { //0(n)
            if(hashMap.containsValue(inputArray[i])) {
                return inputArray[i];
            } else {
                hashMap.put(i, inputArray[i]);
            }
        }
        return null;
    }

    public static void main(String args[]) {
      int[] input = {1,5,3,5};

      FirstRecurringCharacter recurringCharacter = new FirstRecurringCharacter();
      if(null == recurringCharacter.findMethodBruteForce(input)) {
          System.out.println("No characters were found!!!");
      } else {
          System.out.println("Character is: " + recurringCharacter.findMethodBruteForce(input));
      }

        FirstRecurringCharacter recurringCharacter2 = new FirstRecurringCharacter();
        if(null == recurringCharacter2.findMethod(input)) {
            System.out.println("No characters were found!!!");
        } else {
            System.out.println("Character is: " + recurringCharacter2.findMethod(input));
        }
    }
}
