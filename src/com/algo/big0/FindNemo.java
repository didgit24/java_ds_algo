package com.algo.big0;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;

public class FindNemo {

    void findNemo(String[] nemo) {
        double startTime = LocalDateTime.now().getNano() / 1000000;
        for (int i=0; i<nemo.length; i++) {
            if(nemo[i].equals("nemo")) {
                System.out.println("Found NEMO!");
            }
        }
        double endTime = LocalDateTime.now().getNano() / 1000000;
       // System.out.println("Call to find nemo took time: " + Duration.between(endTime,startTime).toMillis());
        System.out.println("Call to find nemo took time in mili: " + (endTime - startTime));
    }

    public static void main(String args[]) {
        String[] nemoArray = new String[]{"nemo"};
        String[] everyOneArray = new String[]{"dory", "roy", "ray", "nemo", "rahul", "birdy", "martin", "max", "tim", "joy"};
        String[] largeArray = new String[100000];

        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = "nemo";
        }

        FindNemo nemo = new FindNemo();
        nemo.findNemo(largeArray);
    }
}
