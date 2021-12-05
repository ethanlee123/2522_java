package FinalKeyword;

class Father {
  // subclass cannot override this method if final
  private void talk() {
    System.out.println("father talking");
  }
}
class Son extends Father {
  private void talk() {
    System.out.println("son talking");
    // super.talk();
  }
}
public class FinalMethods {
  public static void main(String[] args) {
    Son s = new Son();
    // s.talk();
  }
}
