package com.algo.stacksAndQueues;

import java.util.ArrayList;

// user defined class for generic stack
public class stack<T> {
    // Empty array list
    ArrayList<T> A;

    // Default value of top variable when stack is empty
    int top = -1;

    // Variable to store size of array
    int size;

    // Constructor of this class
    // To initialize stack
    stack(int size)
    {
        // Storing the value of size into global variable
        this.size = size;

        // Creating array of Size = size
        this.A = new ArrayList<T>(size);
    }

    // Method 1
    // To push generic element into stack
    void push(T X)
    {
        // Checking if array is full
        if (top + 1 == size) {

            // Display message when array is full
            System.out.println("Stack Overflow");
        }
        else {

            // Increment top to go to next position
            top = top + 1;

            // Over-writing existing element
            if (A.size() > top)
                A.set(top, X);

            else

                // Creating new element
                A.add(X);
        }
    }
    // Method 2
    // To return topmost element of stack
    T top()
    {
        // If stack is empty
        if (top == -1) {

            // Display message when there are no elements in
            // the stack
            System.out.println("Stack Underflow");

            return null;
        }

        // else elements are present so
        // return the topmost element
        else
            return A.get(top);
    }

    // Method 3
    // To delete last element of stack
    void pop()
    {
        // If stack is empty
        if (top == -1) {

            // Display message when there are no elements in
            // the stack
            System.out.println("Stack Underflow");
        }

        else

            // Delete the last element
            // by decrementing the top
            top--;
    }

    // Method 4
    // To check if stack is empty or not
    boolean empty() { return top == -1; }

    // Method 5
    // To print the stack
    // @Override
    public String toString()
    {

        String Ans = "";

        for (int i = 0; i < top; i++) {
            Ans += String.valueOf(A.get(i)) + "->";
        }

        Ans += String.valueOf(A.get(top));

        return Ans;
    }
}
