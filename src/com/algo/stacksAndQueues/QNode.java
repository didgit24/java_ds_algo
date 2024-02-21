package com.algo.stacksAndQueues;

// A linked list (LL) node to store a queue entry
public class QNode {
    int key;
    QNode next;

    // constructor to create a new linked list node
    public QNode(int key)
    {
        this.key = key;
        this.next = null;
    }
}
