class Shape {
  String shape;
  Shape(String shape) {
    this.shape = shape;
  }
}

// class Rectangle extends Shape {
//   Rectangle() {
//     super("rectangle");
//   }
//   public void draw() {
//     System.out.println("drawing rectangle.");
//   }
// }

// class CallingMethodOfSubclass {
//   public static void main(String[] args) {
//     Shape rectangle = new Rectangle();
//     rectangle.draw();
//   }
// }

/*
 * Notice we get an error when we instantiate an object of type Shape (parent)
 * and try to implement its subclass's (Rectangle) method
 * 
 * How might we fix this?
 *    We can make Shape class abstract and create abstract draw() method
 *    We can change Shape to Rectangle in the main method (although not always a good idea).
 *        b/c think in terms of List<Object> list = new ArrayList<Object>(); and why we use List
 */