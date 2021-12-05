package implement_inheritance;

public class Main {
  public static void italianChop(ItalianChef chef) {
    System.out.println("Italian DICE");
  }
  public static void main(String[] args) {
    Chef normalChef = new Chef("NormalChief");
    normalChef.makeSpecial();
    System.out.println("Normal chef first name: " + normalChef.chefFirstName);

    System.out.println("");

    ItalianChef italianChef = new ItalianChef("Italiano");
    italianChef.makeSpecial();
    italianChef.makePasta();
    System.out.println("Accesing numberOfPans directly: " + italianChef.numberOfPans);
    System.out.println("Accessing chefFirstName directly: " + italianChef.chefFirstName);

    System.out.println("");

    Chef masterChef = italianChef;
    masterChef.makeSpecial();


    italianChop((ItalianChef) masterChef);

    System.out.println("Get chef age using italianChef directly: " + italianChef.chefAge);
    System.out.println("Get chef age using italianChef getter: " + italianChef.getChefAge());
    System.out.println("Get chef age using Chef class static way: " + Chef.chefAge);
  }
}

