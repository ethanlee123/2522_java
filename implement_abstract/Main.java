package implement_abstract;

/*
 * When to use?
 * - When you want to share code among several closely related classes
 * - you expect classes that extend have many common methods/fields or require 'protected'
 * - you want to declare non static or non final fields
 */

public class Main {
  public static void main(String[] args) {
    Circle circle = new Circle();
    circle.draw();
    circle.printSize();
  }
}
