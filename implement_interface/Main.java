package implement_interface;

// interface is a way to achieve abstraction, it is an abstract class

interface WaterBottle {
  String color = "blue"; // default public, static and final 
  // because they cant be instantiated by themselves
  /* NOTE: abstact classes cannot be instantiated in their own right 
   * but can have instance variables that are not final static
   */ 

  void fillUp(); // default public and abstract

  int bottleSize();
}
public class Main {
  public static void main(String[] args) {
    BlenderBottle blenderBottle = new BlenderBottle();
    blenderBottle.fillUp();
    blenderBottle.bottleSize();

    System.out.println("Accessing color from blenderBottle: " + blenderBottle.color);
    System.out.println("Accessing color in a static way: " + WaterBottle.color);
   
  }
}

/*
 * when to use interfaces?
 * use interfaces when we want a contract on some behaviour or functionality
 * achieve security - hide details and only show important details of an object
 * 
 * when to use interfaces from docs oracle
 * - you expect unrelated classes to implement your interface
 * - you want ot specify behaviour but dont care about who implements the behaviours
 * - you want to take advantage of multiple inheritance (because you can only inherite 
 * - one parent class but can implement multiple interfaces)
 */