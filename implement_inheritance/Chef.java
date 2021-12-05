package implement_inheritance;

public class Chef {
  int numberOfPans = 3;
  // notice this is private cant be accessed without getter/setter here
  private int numberOfKnives = 10;
  String chefFirstName;

  static int chefAge = 30;

  // constructor: note if we add parameter here we will need to call super in subclasses
  public Chef(String chefFirstName) {
    this.chefFirstName = chefFirstName;
    System.out.println("Calling Chef constructor");
  }

  public void setChefFirstName(String chefFirstName) {
    this.chefFirstName = chefFirstName;
  }
  public void makeChicken() {
    System.out.println("making chicken");
  }
  public void makeSalad() {
    System.out.println("making salas");
  }
  public void makeSpecial() {
    System.out.println("making special dish");
  }
  
}
