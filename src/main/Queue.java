package main;

import java.util.NoSuchElementException;

/*
* A queue is an abstract data type that serves as a collection
* of elements, with two principal operations:
* - push: which adds an element to the collection, and
* - pop: which removes the element that was first added.
*
* Using a dynamic array, it is possible to implement a queue
* that can add and remove elements in a constant time.
* */
public class Queue {

    private static final int SIZE = 100;

    private int[] queue;
    private int head, tail;

    public Queue() {
        queue = new int[SIZE];
        head = 0;
        tail = 0;
    }

    public void push(int x) {
        queue[tail] = x;
        tail = (tail + 1) % SIZE;
    }

    public int pop() {
        if (empty()) {
            throw new NoSuchElementException("No more elements in the queue");
        }

        int x = queue[head];
        head = (head + 1) % SIZE;
        return x;
    }

    public int size() {
        return (tail - head + SIZE) % SIZE;
    }

    private boolean empty() {
        return head == tail;
    }
}
