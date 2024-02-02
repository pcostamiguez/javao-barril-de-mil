package br.com.phcm;

public class Stack {

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(5);
        s.push(4);
        System.out.println(s.pop());
        System.out.println(s.top());
        System.out.println(s.isEmpty());
        s.push(4);
        s.push(3);
        s.push(8);
        s.push(4);
        s.push(4);
        s.push(4);
        s.push(4);
        s.push(4);
        System.out.println(s.isFull());
        s.push(4);
        System.out.println(s.isFull());
    }

    //static allocation
    int[] arr;
    int peek;

    //constructor
    public Stack(){
        arr = new int[10];
        peek = -1; //invalid position
    }

    public void push(int e){
        if(!isFull()){
            peek++;
            arr[peek] = e;
        }else{
            throw new ArrayIndexOutOfBoundsException("Array is full.");
        }
    }

    public int pop(){
        if(!isEmpty()){
            int e = arr[peek];
            peek--;
            return e;
        }else{
            throw new IllegalArgumentException("Array is empty.");
        }
    }

    public boolean isEmpty(){
        return (peek == -1);
    }

    public boolean isFull(){
        return (peek == arr.length - 1);
    }

    public int top(){
        return arr[peek];
    }
}
