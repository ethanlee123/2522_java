package sandbox;

abstract class Shape {
  /**
  * Constructor for objects of type Shape.
  */
  public Shape() {
    System.out.println("Instantiating shape");
    draw();
    System.out.println("Finished drawing shape");
  }
  /**
  * Draws the Shape.
  */
  void draw() {
    System.out.println("Drawing shape");
  }
 }
 /**
 * Circle.
 */
 public class Circle extends Shape {
  private int radius = 1;
  /**
  * Constructs object of type Circle.
  * @param circleRadius
  */
  Circle(int circleRadius) {
    radius = circleRadius;
    System.out.println("Circle has radius = " + radius);
  }
  /**
  * Draws the circle.
  */
  void draw() {
    System.out.println("Drawing Circle radius = " + radius);
  }
  /**
  * Drives the program.
  * @param args
  */
  public static void main(String[] args) {
    Circle orbit = new Circle(5);
  }
 }
