package generics;

import java.util.Collection;

interface Sink<T> {
  void flush(T t);
}

public class WildCards {
  public static <T extends String> T writeAll(Collection<T> coll, Sink<? super String> snk) {
    T last = null;
    for (T t: coll) {
        last = t;
        snk.flush(last);
    }
    return last;
  }

  public static void main(String[] args) {
    Sink<Object> s;//DO NOT CHANGE
    Collection<String> cs;//DO NOT CHANGE
    // String str = writeAll(cs, s); // Illegal call

  }
}
