package generics;

import java.util.ArrayList;
import java.util.List;

class Animal {
  String name;
  Animal (String name) {
    this.name = name;
  }
  public String getName() {
    return this.name;
  }
}
class Cat extends Animal {
  Cat (String name) {
    super(name);
  }
}

public class CovarianceList {
  // not covariant
  static void foo(List<Animal> animals) {
    Animal animal = animals.get(0);
    System.out.println("Animal name: " + animal.getName());
  }
  static void arrayFoo(Animal[] animals) {
    Animal animal = animals[0];
    System.out.println("Animal name: " + animal.getName());
  }

  // covariant 
  static void covariantFoo(List<? extends Animal> animals) {
    Animal animal = animals.get(0);
    System.out.println("Animal name: " + animal.getName());
  }
  public static void main(String[] args) {  
    List<Animal> animals = new ArrayList<Animal>();
    animals.add(new Animal("Bart"));
    animals.add(new Animal("Peter"));
    System.out.println("Below is foo(List<Animal> animals)");
    foo(animals);
    // foo(cats); // cant do this b/c arraylist are not covariant

    Cat[] arrayCats = {new Cat("Bob cat"), new Cat("Bobby")};
    System.out.println("Below is arrayFoo(Animal[] animals)");
    arrayFoo(arrayCats);

    List<Cat> cats = new ArrayList<Cat>();
    cats.add(new Cat("Cat 1"));
    cats.add(new Cat("Cat 2"));
    System.out.println("Below is covariantFoo(List<? extends Animal> animals)");
    covariantFoo(animals);
    covariantFoo(cats);
  }
}
