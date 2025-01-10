package org.Stacks.StackUsing1Queue;

import org.Stacks.StackUsing2Queues.StackUsing2Queues;

public class Main {
    public static void main(String[] args) {
        StackUsing1Queue stack = new StackUsing1Queue();

        // Test 1 : stack.pop();
        // Op : Stack is Empty, Can't pop();
        int p1 = stack.pop();

        // Test 2 : stack.pop();
        // Op : Stack is Empty, Can't push();
        int e1 = stack.peek();

        // Test 3 : pushing -> 1,2,3,4,5
        // Op : 5,4,3,2,1
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.display();

        // Test 4 : pop
        // Op : 4,3,2,1
        int p2 = stack.pop();
        stack.display();

        // Test 5 : peek
        int e2 = stack.peek();
    }
}
