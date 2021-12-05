package implement_inheritance;

public class ItalianChef extends Chef {
  // we inherite all variables unless its private (notice numberOfKnives in Chef.java)
  // we can override the inherited variables
  // private int numberOfPans = 2;

  ItalianChef(String firstName) {
    // must explicitly invoke super constructor or we get error
    super(firstName);
    // inherited from Chef.java, if we do this.setChefFirstName() we need to implement this method
    setChefFirstName(firstName);
  }
  // we inherite all the methods of chef!!

  // we can override the makeSpecial from Chef
  public void makeSpecial() {
    System.out.println("making italian special");
  }
  public void makePasta() {
    System.out.println("making pasta");
  }
  public int getNumberOfPans() {
    return numberOfPans;
  }

  public int getChefAge() {
    return chefAge;
  }
}

/*
 * what can you do in this sub class?
 * 
 *  The inherited fields can be used directly, just like any other fields.
    You can declare a field in the subclass with the same name as the one in the superclass, thus hiding it (not recommended).
    You can declare new fields in the subclass that are not in the superclass.
    The inherited methods can be used directly as they are.
    You can write a new instance method in the subclass that has the same signature as the one in the superclass, thus overriding it.
    You can write a new static method in the subclass that has the same signature as the one in the superclass, thus hiding it.
    You can declare new methods in the subclass that are not in the superclass.
    You can write a subclass constructor that invokes the constructor of the superclass, either implicitly or by using the keyword super.

 * PRIVATE MEMBERS IN SUBCLASS...
 * 
 * are not inherited
 */