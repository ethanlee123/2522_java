package FinalKeyword;

// CANNOT INHERIT (extends FinalThings) FINAL CLASS
class Another {
  private void privateMeth() {
    System.out.println("private method are automatically final");
  }
}

final class FinalThings {
  // making this arg final prevents accidental reassignment
  void finalArgs(final String args) {
    System.out.println(args);
    String args1 = args;
    args1 = "asd";
  }

  // cannot override this final method
  public static final void finalMeth() {
    System.out.println("this is a final method");
  }

  // overriding this seems like it works but it actually just creates a new method.
  private void privateMeth() {
    System.out.println("private method are automatically final");
  }
  public static void main(final String[] args) {
    FinalThings finalThings = new FinalThings();
    finalThings.privateMeth();
    // Another another = new Another();
    // another.privateMeth();
  }

}


