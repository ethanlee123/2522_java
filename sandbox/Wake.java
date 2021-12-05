package sandbox;

import java.util.Stack;

public class Wake {
  Wake(String time) {
    Awake(time);
  }
  public void Awake(String time) {
    System.out.println("Time is " + time);
  }

  public static void main(String[] args) {
    Stack q = new Stack<Double>();
    Wake a = new Wake("up");
  }
}
