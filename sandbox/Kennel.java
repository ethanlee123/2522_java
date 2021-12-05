package sandbox;

interface Animal {
  /**
  * Draws.
  */
  void draw();
 }
 /**
 * Dog.
 */
 class Dog implements Animal {
  /**
  * Draws.
  */
  public void draw() {
  System.out.println("Dog");
  }
 }
 /**
 * Kromfohrlander is a kind of Dog.
 */
 class Kromfohrlander extends Dog {
  /**
  * Draws.
  */
  public void draw() {
  super.draw();
  System.out.println("Kromfohrlander");
  }
 }
 /**
 * Mastiff is a kind of Dog.
 */
 class Mastiff extends Dog implements Animal {
  /**
  * Draws.
  */
  public void draw() {
  System.out.println("Mastiff");
  }
 }
 class ShibaInu extends Kromfohrlander {
  Mastiff m = new Mastiff();
  /**
  * Draws.
  */
  public void draw() {
  m.draw();
  super.draw();
  System.out.println("ShibaInu");
  }
 }
 /**
 * Kennel.
 */
 public class Kennel {
  /**
  * Drives the program.
  * 
  * @param args
  */
  public static void main(String[] args) {
  Animal sasha;
  Dog rex;
  rex = new Mastiff();
  sasha = new ShibaInu();
  sasha.draw();
  rex.draw();
  sasha = rex;
  sasha.draw();
  }
 }
