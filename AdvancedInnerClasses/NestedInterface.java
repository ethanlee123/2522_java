package AdvancedInnerClasses;

interface OuterInterface { // making this public will cause a compile error
  static int data = 1; // Recall: variable must be instantiated
  // Recall: method are implicitly public and abstract
  void getPreciseCoordinates(); 
  default void getRoughCoordinates() { 
    System.out.println("get rough coordinates");
  };
  public interface InnerInterface { // making this public has no error

  }
}

class OuterClass {
  interface InterfaceInsideClass {

  }
}

public class NestedInterface {
  
}

// https://www.javatpoint.com/nested-interface
// 1. nested interface must be public

// https://www.freecodecamp.org/news/java-interfaces-explained-with-examples/