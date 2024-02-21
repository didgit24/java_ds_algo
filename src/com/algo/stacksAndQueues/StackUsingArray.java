package com.algo.stacksAndQueues;

public class StackUsingArray {
    // main driver method
    public static void main(String[] args)
    {

        // Integer Stack

        // Creating an object of Stack class
        // Declaring objects of Integer type
        stack<Integer> s1 = new stack<>(3);

        // Pushing elements to integer stack - s1

        // Element 1 - 10
        s1.push(10);
        // Element 2 - 20
        s1.push(20);
        // Element 3 - 30
        s1.push(30);

        // Print the stack elements after pushing the
        // elements
        System.out.println(
                "s1 after pushing 10, 20 and 30 :\n" + s1);

        // Now, pop from stack s1
        s1.pop();

        // Print the stack elements after popping few
        // element/s
        System.out.println("s1 after pop :\n" + s1);

        // String Stack

        // Creating an object of Stack class
        // Declaring objects of Integer type
        stack<String> s2 = new stack<>(3);

        // Pushing elements to string stack - s2

        // Element 1 - hello
        s2.push("hello");
        // Element 2 - world
        s2.push("world");
        // Element 3 - java
        s2.push("java");

        // Print string stack after pushing above string
        // elements
        System.out.println(
                "\ns2 after pushing 3 elements :\n" + s2);

        System.out.println(
                "s2 after pushing 4th element :");

        // Pushing another element to above stack

        // Element 4 - GFG
        s2.push("GFG");

        // Float stack

        // Creating an object of Stack class
        // Declaring objects of Integer type
        stack<Float> s3 = new stack<>(2);

        // Pushing elements to float stack - s3

        // Element 1 - 100.0
        s3.push(100.0f);
        // Element 2 - 200.0
        s3.push(200.0f);

        // Print string stack after pushing above float
        // elements
        System.out.println(
                "\ns3 after pushing 2 elements :\n" + s3);

        // Print and display top element of stack s3
        System.out.println("top element of s3:\n"
                + s3.top());
    }
}
