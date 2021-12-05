package sandbox;

class Cup {
  /**
  * Constructs an object of type Cup.
  * @param marker
  */
  public Cup(int marker) {
  System.out.println("Constructing Cup(" + marker + ")");
  }
  /**
  * Sips the amount.
  * @param marker
  */
  void sip(int amount) {
  System.out.println("sipping(" + amount + ")");
  }
 }
 /**
 * SilverTray.
 */
 class SilverTray {
  static Cup firstCup;
  static Cup secondCup;
  static {
  firstCup = new Cup(1);
  secondCup = new Cup(2);
  }
  /**
  * Constructs an object of type SilverTray.
  * @param guest
  */
  SilverTray(String guest) {
  System.out.println("Constructing a SilverTray for " + guest);
  }
 }

 /**
 * SilverPlatter.
 */
 public class SilverPlatter {
  static SilverTray elizabeth = new SilverTray("elizabeth");
  static SilverTray phillip = new SilverTray("phillip");
  /**
  * Drives the program.
  * @param args
  */
  public static void main(String[] args) {
  System.out.println("Executing the main method");
  }
 }
