package generics;
import java.lang.reflect.Array;
import java.util.*;
class CreateGenericArray<T> {
  // T[] elements = new T[5]; // can't do this, why?
  
  // 1. suppose below is allowed
  // public T[] getArray1(int size) {
  //   T[] genericArray = new T[size];
  //   return genericArray;
  // }

  // 2. then at runtime - erasure
  public Object[] getArray2(int size) {
    Object[] genericArray = new Object[size];
    return genericArray;
  }

  // 3. when we call our method, we're trying to store Object[] into String[]. And this doesnt work
  // String[] myArray = getArray(5);
  // above is equivalent to doing below
  // String[] myArray = new Object[5];
}
// 4. how to create a generic array
class MyStack<E> {
  private E[] elements;
  private E[] anotherList;
  MyStack(Class<E> clazz, int size) {
    elements = (E[]) Array.newInstance(clazz, size);
    anotherList = (E[]) new Object[size];
  }
}
// 5. using arraylist instead of array: often easier
class MyStack2<E> {
  private List<E> elements;
  MyStack2(Class<E> clazz, int size) {
    elements = new ArrayList<>(size);
  }
}
public class GenericArrays {
  public static void main(String[] args) {
  }
}

// https://www.baeldung.com/java-generic-array
// notes:
// 1. arrays check type info at runtime
// 2. generics check for type errors at compile time and dont have type info at runtime