package sandbox;

public class Big {
  private Small s = new Small();
  /**
  * Small inner class.
  */
  private class Small {
  public int size = 1;

  int getSize() {
    return size;
  }
  }
  /**
  * Drives the program.
  * @param args
  */
  public static void main(String[] args){
  Big b = new Big();
  b.s.getSize();
  }
 }