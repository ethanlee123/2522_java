package practice_final_2522;

import java.util.*;
import java.util.function.Predicate;

public class Test2 {

  public static <T> void addEvenAndDisplay(ArrayList<Integer> listA, ArrayList<Integer> listB, Predicate<Integer> myPred) {
    for (int i = 0; i < listA.size(); i++) {
      int tempA = listA.get(i);
      int tempB = listB.get(i);
      if (myPred.test(tempA) && myPred.test(tempB)) {
        System.out.println(" " + (tempA + tempB));
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
    addEvenAndDisplay(listA, listB, thePredicate);

  }
}