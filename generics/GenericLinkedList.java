package generics;

public class GenericLinkedList {


  public class LinkedList<T> {
    private Node head;
    class Node {
      T data;
      Node next;
      public Node(T d){data = d;}
    }
    public void add(T d){
      Node temp = new Node(d);
      temp.next = head;
      head = temp;
    }
  }
  

  public static void main(String[] args) {
    
  }
}
