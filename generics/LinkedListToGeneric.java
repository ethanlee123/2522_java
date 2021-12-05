package generics;

class LinkedList {
	private Node head;
	class Node {
		int data;
		Node next;
		public Node(int d){data = d;}
	}
	public void add(int d){
		Node temp = new Node(d);
		temp.next = head;
		head = temp;
	}
}

  public class LinkedListToGeneric<A> {
    private Node head;
    class Node {
      A data;
      Node next;

      public Node(A d){
        data = d;
      }
    }
    public void add(A d){
      Node temp = new Node(d);
      temp.next = head;
      head = temp;
    }

    public static void main(String[] args) {
      LinkedListToGeneric<Integer> list = new LinkedListToGeneric<>();
      list.add(2);
      list.add(4);
      list.add(6);
      list.add(8);
      list.add(10);
    
      while (list.head.next != null) {
        System.out.println(list.head.data);
        list.head = list.head.next;
      }
    }
  }

