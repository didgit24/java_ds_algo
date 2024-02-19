package com.algo.linkedList.DoublyLinkedList;

class node {
    node prev;
    int data;
    node next;

    // A constructor is called here
    node(int value)
    {

        // By default previous pointer is
        // pointed to NULL
        prev = null;

        // Value is assigned to the data
        data = value;

        // By default next pointer is pointed
        // to NULL
        next = null;
    }
}