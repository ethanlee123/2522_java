package OverridingAccess;

class Stew {
  protected int potatoes = 1;
  protected void stir() {
    System.out.println("Stirring the pot of stew");
  } 
}

public class ChangingAccess extends Stew{
  protected int potatoes = 4;

  // if you try changing below to private or default youll get error
  protected void stir() {
    System.out.println("Stirring the pot of stew in changing Access");
  } 
  public static void main(String[] args) {
    ChangingAccess c = new ChangingAccess();
    Stew s = new ChangingAccess();
    Stew s1 = new Stew();
    System.out.println("initialized to ChangingAccess and type ChangingAccess" + c.potatoes); // output 4
    System.out.println("initialized to ChangingAccess but type Stew" + s.potatoes); // output 1
    System.out.println("initialized to Stew and type Stew" + s1.potatoes); // output 1

    c.stir(); //
    s.stir(); //
    s1.stir(); //
  }
}
