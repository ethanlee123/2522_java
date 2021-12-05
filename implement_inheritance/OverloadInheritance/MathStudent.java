package implement_inheritance.OverloadInheritance;


class Student {
  public void eat() {
    System.out.println("student eats");
  };
}
public class MathStudent extends Student {
  public void eat() {
    System.out.println("math student eats");
  };
  public void eat(int x) {
    System.out.println("math student eats" + x + " times");
  };
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.eat();

    MathStudent s2 = new MathStudent();
    s2.eat();

    Student s3 = new MathStudent();
    s3.eat();

    // uncomment below notice how we cannot overload the method
    // s3.eats(3);
  }
}
