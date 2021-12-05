package implement_abstract;

// if we extend abstract class shape we must implement its methods
public class Circle extends Shape{
  void draw() {
    // obviously draw a circle...
    System.out.println("Draw circle");
  }
  protected int printSize() {
    System.out.println("print size ...");
    return 0;
  }

}
