package quiz_two;
//q4 - no errors we dont have to implement methods be class J is abstract
// and we can implement multiple interfaces
interface A {
  void foo();
}
class b implements A {
  public void foo(){};
}
interface X {
  void foo();
}

// q1 - doesnt give error inner class can access all outer class variables and methods
class Foo {
  private Bar b;
  private int x;
  class Bar {
    public void setX(int value) {
      x = value; // does this give error?
    }
    public int getX() {
      return x;
    }
  }
}
abstract class J implements A, X {}

//q2 - does not give error, WORKS b/c polymorphism through interface
interface C {
  void fooC();
}
class D implements C {
  public void fooC() {
    System.out.println("printing fooC method in q2");
  };
}

public class Main {
  public static void main(String[] args) {
      //q1
    Foo foo = new Foo();
    Foo.Bar bar = foo.new Bar();
    bar.setX(1);
    System.out.println("x: " + bar.getX());

    // q2
    C a = new D(); // does this give error?
    a.fooC();
  }


}
