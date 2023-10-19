package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // TODO: create an empty linked list
        
        LinkedList<Integer> list = new LinkedList<Integer>();

        //  - add 4 as the first element of the list
            list.add(0, 4);
        
        //  - then add 5, 6, 8, 2, 9 to the the list
            list.add(5);
            list.add(6);
            list.add(8);
            list.add(2);
            list.add(9);

        //  - add another 2 as the last element of the list   
            list.addLast(2);

        //  - add 4 as the 3rd element of the list
            list.add(2, 4);

        //  - invoke the method element() on the list and print the result on the screen
            System.out.println(list.element());

        //  - return the list
            return list;
    }

    public Stack<Integer> useStack() {
        // TODO: create an empty stack

        Stack<Integer> stack = new Stack<Integer>();

        //  - add 5, 6, 8, 9 to the the stack
            stack.push(5);
            stack.push(6);
            stack.push(8);
            stack.push(9);

        //  - print the first element of the stack on the screen
            System.out.println(stack.firstElement());

        //  - print the last element of the stack on the screen
            System.out.println(stack.lastElement());

        //  - invoke the method pop() on the stack and print the result on the screen
            System.out.println(stack.pop());

        //  - invoke the push(4) method on the stack
            stack.push(4);

        //  - return the stack
            return stack; 

    }

    public ArrayDeque<Integer> useArrayDeque() {
        // TODO: create an empty arrayDeque
        //  - add 5, 6, 8, 9 to the the stack
        //  - print the first element of the queue on the screen
        //  - print the last element of the queue on the screen
        //  - invoke the method poll() on the queue and print the result on the screen
        //  - invoke the element() method on the queue and print the result on the screen
        //  - return the queue
        
        ArrayDeque<Integer> deque = new ArrayDeque<>();
    }

    public HashMap<Integer, String> useHashMap() {
        // TODO: create an empty hash map
        //  - add {1, TypeScript} entry to the map
        //  - add {2, Kotlin} entry to the map
        //  - add {3, Python} entry to the map
        //  - add {4, Java} entry to the map
        //  - add {5, JavaScript} entry to the map
        //  - add {6, Rust} entry to the map
        //  - determine the set of keys from the map and print it on the screen
        //  - determine the set of keys from the map and print it on the screen
        //  - determine whether the map contains "English" as a language and print the result on the screen
        //  - return the map
        throw new RuntimeException("Not implemented");
    }

    public String getName() {
        return "Collections Exercises";
    }
}
