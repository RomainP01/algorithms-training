package com.example.RomainP01.algorithmstraining.datastructures.stackqueue;

import java.util.Iterator;
import java.util.Stack;

class MyQueue {
    private Stack<Integer> classicStack;
    private Stack<Integer> queue;
    public MyQueue() {
        this.classicStack = new Stack<>();
        this.queue = new Stack<>();
    }

    public void push(int x) {
        classicStack.push(x);
        Stack<Integer> copy = (Stack<Integer>) classicStack.clone();
        queue = new Stack<>();
        while (!copy.empty()){
            queue.add(copy.peek());
            copy.pop();
        }
    }

    public int pop() {
        int i = queue.pop();
        Stack<Integer> copy = (Stack<Integer>) queue.clone();
        classicStack = new Stack<>();
        while (!copy.empty()){
            classicStack.add(copy.peek());
            copy.pop();
        }
        return i;
    }

    public int peek() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.empty();
    }
}

class MyQueue2 {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    public MyQueue2() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        if (stack2.empty()){
            while (!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int peek() {
        if (stack2.empty()){
            while (!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean empty() {
        return stack1.empty() && stack2.empty();
    }
}

public class ImplementQueueUsingStack {
}
