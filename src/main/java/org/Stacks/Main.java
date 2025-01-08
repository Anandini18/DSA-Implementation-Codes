package org.Stacks;

public class Main {
    public static void main(String[] args) {

        StackUsingArray stack = new StackUsingArray();

        // Test 1 : Popping & Peeking in empty stack
        // Output : Stack is Empty :("

        stack.pop();
        stack.peek();

        // Test 2 : Pushing some values : 1, 2, 3, 4, 5 and displaying them
        // Output : 1-> 2-> 3-> 4-> 5

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.display();

        // Test 3 : Popping 2 times and then displaying
        // Output : 3-> 2-> 1

        stack.pop();
        stack.pop();
        stack.display();

        // Test 4 : Checking the element at the top
        // Output : 3

        stack.peek();

    }
}
