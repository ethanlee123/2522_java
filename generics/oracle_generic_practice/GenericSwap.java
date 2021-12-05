package generics.oracle_generic_practice;

public class GenericSwap {
  static <T> void swap(T[] array, int index1, int index2) {
    T temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
  }
  static <T> void printArray(T[] array) {
    for (T element: array) {
      System.out.print(element + ", ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    Integer[] intArr = {1, 2, 3, 4};
    printArray(intArr);
    swap(intArr, 0, 2);
    printArray(intArr);

    System.out.println();
    
    String[] strArr = {"a", "b", "c", "d", "e", "f"};
    printArray(strArr);
    swap(strArr, 1, 5);
    printArray(strArr);
  }
}
