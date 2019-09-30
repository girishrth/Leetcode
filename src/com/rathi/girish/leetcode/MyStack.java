package com.rathi.girish.leetcode;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {

	Queue<Integer> q;
    /** Initialize your data structure here. */
    public MyStack() {
        q = new LinkedList<Integer>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        q.offer(x);
        
        for(int i = 1 ; i < q.size() ; i++) {
        	q.offer(q.poll());
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return q.isEmpty() ? -1 : q.poll();
    }
    
    /** Get the top element. */
    public int top() {
        return q.isEmpty() ? -1 : q.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q.isEmpty();
    }
}
