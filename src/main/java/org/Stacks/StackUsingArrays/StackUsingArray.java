package org.Stacks.StackUsingArrays;

public class StackUsingArray {

    private int top;
    private int[] arr;

    public StackUsingArray(){
        top = -1;
        arr = new int[5];
    }

    public void copyElements(int[] smallArray, int[] bigArray){
        for(int i=0;i<smallArray.length;i++){
            smallArray[i] = bigArray[i];
        }
    }

    public void push(int val){
        if(top==arr.length-1){
            int[] newArr = new int[arr.length*10];
            copyElements(arr,newArr);
            arr = newArr;
        }
        top++;
        arr[top] = val;
    }

    public void pop(){
        if(top==-1){
            System.out.println("Stack is Empty :( , Can't Pop!");
            return;
        }
        arr[top] = Integer.MIN_VALUE;
        top--;
    }

    public int peek(){
        if(top==-1){
            System.out.println("Stack is Empty :( , Can't Peek!");
            return -1;
        }
        else{
            System.out.println("Last element of stack is : "+arr[top]);
            return arr[top];
        }
    }

    public void display(){
        for(int i=top;i>=0;i--){
            System.out.println("|__"+arr[i]+"__|");
        }
        System.out.println();
    }
}
