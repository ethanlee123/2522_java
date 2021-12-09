package exceptions;
class Annoyance extends Exception {}
class Sneeze extends Annoyance {}

// Q: what is the output?
// Q: Whats happens when you swap Sneeze and Annoyance? Why?
// Q: What happens when you throw new Annoyance();

public class ExtendingException {
  public static void main(String[] args) {
    try {
      throw new Sneeze();
    } catch (Sneeze s) {
      System.err.println("Sneeze caught");
    } catch (Annoyance a) {
      System.err.println("Annoyance caught");
    }
  }
}
