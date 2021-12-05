package generics.WildCard;

import java.util.ArrayList;
import java.util.List;

class A {
  int data;
  A(int data) { 
    this.data = data;
  }
  public int getData() { return data; }
}
class B extends A {
  B(int data) {
    super(data);
  }
}
class C extends A {
  C(int data) {
    super(data);
  }
}

public class WhyWildCards {
  public static void processElementsV1(List<A> elements){
    for(A o : elements){
       System.out.println(o.getData());
    }
  }
  public static void processElementsV2(List<?> elements){
    for(Object o : elements){
       System.out.println(o);
    }
  }
  public static void processElementsV3(List<? extends A> elements){
    for(A o : elements){
       System.out.println(o.getData());
    }
  }
  public static void insertElements(List<? super A> list) {
    list.add(new A(9));
    list.add(new B(8));
    list.add(new C(7));
  }
  public static void main(String[] args) {
    List<A> listA = new ArrayList<A>();
    List<B> listB = new ArrayList<B>();

    listA.add(new C(1));
    listA.add(new B(2));

    listB.add(new B(3));
    listB.add(new B(4));

    //http://tutorials.jenkov.com/java-generics/wildcards.html
    // 1.
    //listA = listB; //Cant do this b/c what if we try to insert objects of type C into a list of type B

    //listB = listA; //Cant do this b/c what if listA contains non B objects. If we try to read or take out an object it might not be an object of type B

    // 2.
    // say we want to create a processElements() method that works for all
    processElementsV1(listA);
    // processElements(listB); // this line wont work yet

    // 3. 
    // Generic wild card targets 2 primary needs: (1) reading from generic collection and (2) inserting into generic collection

    // 4.
    // 3 ways to define a collection using generic wildcards:
        // List<?>           listUknown = new ArrayList<A>();
        // List<? extends A> listUknown = new ArrayList<A>();
        // List<? super   A> listUknown = new ArrayList<A>();

    // 5. List<?>
        // means the list typed is unknown - since it is unknown we can only read and we can only treat object read as being Object instances
    System.out.println("===processElementsV2(List<?> list)===");
    processElementsV2(listB);

    // 6. List<? extends A>
        // means the list of objects passed are instances of A or subclasses of A
        // we can safely read and cast these elements to A instances
    System.out.println("===processElementsV3(List<? extends A> list)");
    processElementsV3(listB);

    // but up till this point, we stil cant insert elements into the list b/c you dont know if the list passed is typed to class A, B, or C

    // 7. List<? super A>
        // means the list is of type A or super class of A
        // then it will be safe to insert instances of A or subclasses of A
    System.out.println("===insertElements(List<? super A> list)");
    insertElements(listA);

  }
}
