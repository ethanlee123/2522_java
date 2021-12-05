package generics.oracle_generic_practice;


// question: What is the following method converted to after type erasure? 
public class Erasure2 {
  // public static <T extends Comparable<T>>
  //   int findFirstGreaterThan(T[] at, T elem) {
  //   // ...
  // }

  //=== ANSWER ==
  // public static <T extends Comparable<T>>
  //   int findFirstGreaterThan(Comparable[] at, Comparable elem) {
  //   // ...
  // }
}
