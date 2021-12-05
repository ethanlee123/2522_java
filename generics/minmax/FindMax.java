package generics.minmax;

import java.util.*;

// Write a generic method to find the maximal element in the range [begin, end) of a list.
public class FindMax {
  //=== if we want to extend multiple bounds
  // static <T extends Object & Comparable<? super T>> 
  // static <T extends Number & Comparable<? super T>> 
  
  static <T extends Comparable<? super T>> 
    T findMax(List<? extends T> list) {
    if (list.size() == 0) {
      return null;
    }
    T max = list.get(0);
    for (T element : list) {
      if (max.compareTo(element) < 0) max = element;
    }
    return max;
  }
  public static void main(String[] args) {
    List<Integer> intList = new ArrayList<>();
    intList.add(3);
    intList.add(6);
    intList.add(11);
    intList.add(9);
    System.out.println("max int: " + findMax(intList));

    List<String> strList = new ArrayList<>();
    strList.add("a");
    strList.add("b");
    strList.add("c");
    System.out.println("max string: " + findMax(strList));
  }
}

//================================================================
//   static <T extends Comparable<? super T>>  comparable is an interface and if we extend nothing, the upper bound is implicitly Object. In this case we extend comparable, is comparable the upperbound? or is object still the upperbound?