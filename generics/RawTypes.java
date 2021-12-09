package generics;

import java.util.*;

public class RawTypes {
  public static void main(String[] args) {
    // 2 below say Stack should be parameterized
    Stack s1 = new Stack();
    Stack s6 = new Stack<>();
    Stack s2 = new Stack<Double>();

    // below need type safety: since we could add any type to this stack
    Stack<Integer> s3 = new Stack();

    Stack<Integer> s4 = new Stack<>(); // Integer is inferred
    Stack<Integer> s5 = new Stack<Integer>();

    // ### Notice how we can push a string and integer to s1
    s1.push(123);
    System.out.println(s1.peek());
    s1.push("String");
    System.out.println(s1.peek());

    // ### Notice how we can push a string and integer to s2
    s2.push(123);
    System.out.println(s2.peek());
    s2.push("String");
    System.out.println(s2.peek());

    s4.push(123);
    System.out.println(s4.peek());
    // s4.push("String"); // uncomment this, see what happens
    // System.out.println(s4.peek());
  }
}
