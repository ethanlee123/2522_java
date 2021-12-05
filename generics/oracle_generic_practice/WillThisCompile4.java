package generics.oracle_generic_practice;

class Shape { /* ... */ }
class Circle extends Shape { /* ... */ }
class Rectangle extends Shape { /* ... */ }

class Node<T> { /* ... */ }

public class WillThisCompile4 {

  // public static void main(String[] args) { 
  //   Node<Circle> nc = new Node<>();
  //   Node<Shape>  ns = nc;
  // }
}

// ans: no will not compile b/c of line 12
// b/c Node<Circle> is not a sub type of Node<Shape>

//================================================================
// is this because of covariance?
// this is invariant, is it possible to achieve covariance here?