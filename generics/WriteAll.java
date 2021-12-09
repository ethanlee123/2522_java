package generics;

import java.util.Collection;

public class WriteAll {
  interface Sink<T> {
    void flush(T t);
  }

  public static <T> T writeAll(Collection<T> coll, Sink<? super Object> sink) {
      T last = null;
      for (T t : coll) {
          last = t;
          sink.flush(last);
      }
      return last;
  }
  
  Sink<Object> s;//DO NOT CHANGE
  Collection<Integer> cs;//DO NOT CHANGE
  Integer i = writeAll(cs, s); // Illegal call

}
