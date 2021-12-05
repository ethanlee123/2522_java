package implement_abstract;

abstract class Shape {
  int xPosition;
  int yPosition;

  void moveTo(int newX, int newY) {
    xPosition = newX;
    yPosition = newY;
  }

  // these methods cannot be private -> compile time error
  abstract void draw(); // note if we have abstract methods we MUST have an abstract class

  // protected only lets us access this method from classes in the same package or sub classes
  // read more on public vs protected and if theres a significance:
    // https://stackoverflow.com/questions/34260507/public-vs-protected-abstract-class-method
  abstract protected int printSize();
}

// NOTE on static methods: they work the same as with any other class