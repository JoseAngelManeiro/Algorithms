package main;

/*
* According to Wikipedia, a stack is an abstract data type that serves as a collection
* of elements, with two principal operations:
* - push: which adds an element to the collection, and
* - pop: which removes the most recently added element that was not yet removed.
*
* Using a dynamic array, it is possible to implement a stack
* that can add and remove elements in a constant time.
* */
public class Stack {

    private static final int SIZE = 100;

    private int[] stack;
    private int size;

    public Stack() {
        stack = new int[SIZE];
        size = 0;
    }

    public void push(int x) {
        stack[size++] = x;
    }

    public int pop() {
        return stack[--size];
    }
}
