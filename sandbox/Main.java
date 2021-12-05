package sandbox;

class Feline {
  void walk() {
    System.out.println("feline walk");
  }
}

class Tiger extends Feline {
  void walk() {
    super.walk();
    System.out.println("tiger walk");
  }
}
public class Main extends  Tiger{
  public void walk() {
    super.walk();
    System.out.println("main walk");
  }
  public static void main(String[] args) {
    Feline f = new Main();
    f.walk();
  }
}
 