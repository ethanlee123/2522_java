package generics;

class Stack<T> {}
public class RawTypes {
  public static void main(String[] args) {
    // 2 below say Stack should be parameterized
    Stack s1 = new Stack();
    Stack s2 = new Stack<Double>();

    // below need type safety: since we could add any type to this stack
    Stack<Integer> s3 = new Stack();

    Stack<Integer> s4 = new Stack<>(); // Integer is inferred
    Stack<Integer> s5 = new Stack<Integer>();
  }
}
