package practice_final_2522;

class A {
  // below code is a acts like a constructor. So equivalent to...
  //static {System.out.println("in class A");} AND
  // public A() {System.out.println("in class A");}

  {
    System.out.println("in class A");
  }

  static void staticMethod() {
    System.out.println("in class A static method");
  }
  int i = 10;
}

class B extends A {
  {
    System.out.println("in class B");
  }
  
  static void staticMethod() {
    System.out.println("in class B static method");
  }
  int i = 5;
}

public class Extends {
  
  public static void main(String[] args) {
    A a  = new B();
    System.out.println(a.i);
    A.staticMethod();
  }
}
