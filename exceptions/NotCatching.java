package exceptions;

class LetsThrow {
  public static void throwing() throws Exception {
    System.out.println("Throwing exception in throwing method");
    throw new Exception();
  }
}

class LetsCatch {
  public static void noCatching() {
    try {
      System.out.println("not catching");

    } finally {
      System.out.println("Executing finally block");
    }

  }
}

//----------------------------------------------------------------

class ImportantException extends Exception {
  public String toString() {
    return "Important exception";
  }
}
class OverThrownException extends Exception {
  public String toString() {
    return "a trivial exception";
  }
}
class LostMessage {
  public static void f() throws ImportantException {
    throw new ImportantException();
  }
  public static void dispose() throws OverThrownException {
    throw new OverThrownException();
  }
}

public class NotCatching {
  public static void main(String[] args) throws Exception {
    // LetsCatch.noCatching();

    //----------------------

    try {
      LostMessage.f();
    } catch (ImportantException e) {
      System.out.println("catching");
      e.printStackTrace();
    }finally {
      LostMessage.dispose();
    }
  }
}
