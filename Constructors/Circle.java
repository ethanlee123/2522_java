package Constructors;

class Shape {
  void draw(){
      System.out.println("no shape yet");
  }
  Shape(){
      System.out.println("creating shape");
      draw();
      System.out.println("finished drawing shape");
  }
}
public class Circle extends Shape {
  int radius = 1;
  Circle(int r){
      radius = r;
      System.out.println("Circle has radius = " + radius);
  }
  void draw(){
      System.out.println("Draw Circle, radius = " + radius);
  }
  public static void main(String[] args){
      new Circle(5);
  }
}

// hint: order of execution is super() -> field initializers -> rest of constructor.
