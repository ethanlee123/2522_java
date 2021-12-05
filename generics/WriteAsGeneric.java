package generics;
// write below as a generics

// interface Comparable<T>{
// 	boolean compareTo(T a);
// }

// public static int min(int[]data){
// int result = data[0];
// for (int value : data){
// 		if (result > value)
// 			result = value;
// 	}
// 	return result;
// }

interface Comparable<T>{
	boolean compareTo(T a);
}

public class WriteAsGeneric {
  public static <T extends Comparable<T>> T min(T[] data) {
    T result = null;
    for (T value : data){
        if (result.compareTo(value))
          result = value;
      }
      return result;
    }

}