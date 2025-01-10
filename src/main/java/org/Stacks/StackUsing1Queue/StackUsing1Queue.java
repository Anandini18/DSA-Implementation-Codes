package org.Stacks.StackUsing1Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsing1Queue {

    private Queue<Integer> q;

    public StackUsing1Queue(){
        q = new LinkedList<>();
    }

    public void push(int x){
        q.add(x);
        while(q.peek()!=x){
            int item = q.remove();
            q.add(item);
        }
        System.out.println(x + " is added in the Stack Successfully ✅");
    }

    public int pop(){
        if(q.isEmpty()){
            System.out.println("Stack is Empty, Can't Pop! 😔");
            return -1;
        }
        else{
            System.out.println(q.peek() + " is removed! 🙃");
            return q.remove();
        }

    }

    public int peek(){
        if(q.isEmpty()){
            System.out.println("Stack is Empty, Can't Peek! 😔");
            return -1;
        }
        System.out.println(q.peek() + " is at the top! 😎");
        return q.peek();
    }

    public void display(){
        Iterator<Integer> i = q.iterator();
        System.out.println();
        while (i.hasNext()) {
            Integer val = i.next();
            System.out.println("|__" + val + "__|");
        }
        System.out.println();
    }

}
