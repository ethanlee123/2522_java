package generics.oracle_generic_practice;

import java.util.List;

public class WillThisCompile2 {
  public static void print(List<? extends Number> list) {
    for (Number n : list)
        System.out.print(n + " ");
    System.out.println();
  }
}


// === Answer: yes