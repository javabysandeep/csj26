package collectionFramework.listImplementations;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        //assignment: parenthesis validation using stack
        Stack<Integer> stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("On top of stack "+ stack.peek());
        System.out.println("Search in stack "+stack.search(90));
        System.out.println("Is stack empty "+stack.empty());
        System.out.println("remove element from stack "+stack.pop());
        System.out.println("On top of stack "+ stack.peek());

    }

}
