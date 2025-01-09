package org.Stacks.StackUsing2Queues;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queues {

    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public StackUsing2Queues(){
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x){
        if(q1.isEmpty()) q1.add(x);
        else{
            while(!q1.isEmpty()) q2.add(q1.remove());
            q1.add(x);
            while(!q2.isEmpty()) q1.add(q2.remove());
        }
        System.out.println(x + " is added in the Stack Successfully ✅");
    }

    public int pop(){
        if(q1.isEmpty()){
            System.out.println("Stack is Empty, Can't Pop! 😔");
            return -1;
        }
        else{
            System.out.println(q1.peek() + " is removed! 🙃");
            return q1.remove();
        }

    }

    public int peek(){
        if(q1.isEmpty()){
            System.out.println("Stack is Empty, Can't Peek! 😔");
            return -1;
        }
        System.out.println(q1.peek() + " is at the top! 😎");
        return q1.peek();
    }

    public void display(){
        Iterator<Integer> i = q1.iterator();
        System.out.println();
        while (i.hasNext()) {
            Integer val = i.next();
            System.out.println("|__" + val + "__|");
        }
        System.out.println();
    }
}
