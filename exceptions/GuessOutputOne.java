package exceptions;

public class GuessOutputOne {
  void f() throws Exception {
    throw new Exception();
  }
  void foo() throws Exception {
    System.out.println("starting foo");
    try {
      System.out.println("in try before f()");
      f();
      System.out.println("in try after f()");
    }
    catch(Exception e){
      System.out.println("exception occurred");
      // throw e; // Uncomment this and see what happens
    }
    finally {
      System.out.println("finally");
    }
    System.out.println("after finally");
  }
  public static void main(String[] args) throws Exception {
    GuessOutputOne c = new GuessOutputOne();
    try {
      c.foo();
    } finally {
      System.out.println("main finally");
    }
  }
 }