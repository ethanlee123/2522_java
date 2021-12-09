package practice_final_2522;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class AddEvenDisplay {

  public static <T> void addEvenAndDisplay(ArrayList<T> listA, ArrayList<T> listB, Predicate<T> myPred, BiFunction<T, T, T> arithmetic) {
    for (int i = 0; i < listA.size(); i++) {
      T tempA = listA.get(i);
      T tempB = listB.get(i);
      if (myPred.test(tempA) && myPred.test(tempB)) {
        T result = arithmetic.apply(tempA, tempB);
        System.out.println(" " + result);
      }
    }
  }

  public static void main(String[] args) {
    Predicate<Integer> thePredicate = n -> {
      return n % 2 == 0;
    };
    ArrayList<Integer> listA = new ArrayList<Integer>();
    ArrayList<Integer> listB = new ArrayList<Integer>();
    for (int i = 0; i < 5; i++) {
      listA.add(i);
      listB.add(i);
    }
    BiFunction<Integer, Integer, Integer> multiply = (x, y) -> x * y;
    addEvenAndDisplay(listA, listB, thePredicate, multiply);

  }
}