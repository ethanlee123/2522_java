package generics;

class CovariantMethod {
}

public class CovarianceArrays<T> {
  static void foo(Number[] numbers) {
    System.out.println("first number: " + numbers[0]);
  }

  // List<T extends number> arrayList
  T[] array1 = (T[]) new Object();
  static <T extends Number> void copy(T[] source, T[] destination) {
    // double sum = source[0] + destination[0];
    // System.out.println(sum);
  }

  public static void main(String[] args) {
    Number[] numbers = {1.1, 2, 3.45};
    Integer[] integers = {8, 7, 9};
    Double[] doubles = {2.34, 3.45, 5.67}; // notice how they need to be the wrapper classes not primitives
    String[] strings = new String[5];
    foo(numbers);
    foo(integers); 
    // foo(doubles); // this wont work unless wrapper class Double
    // foo(strings);

    copy(integers, doubles);
  }
}
