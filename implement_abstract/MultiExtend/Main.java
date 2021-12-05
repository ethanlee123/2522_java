package implement_abstract.MultiExtend;
// what if we extend multiple classes and call super.talk()
// we cannot extend multiple classes but we can implement multiple interfaces

class Animal {
  public void talk() {
    System.out.println("Animal talk");
  }
}
class Feline {
  public void talk() {
    System.out.println("Feline talk");
  }
}
// class Cat extends Animal, Feline {
//   public void talk() {
//     System.out.println("Cat talk");
//   }
// }
public class Main {
  
}
