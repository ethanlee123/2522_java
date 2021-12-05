package exceptions;
class Annoyance extends Exception {}
class Sneeze extends Annoyance {}
public class ExtendingException {
  public static void main(String[] args) {
    try {
      throw new Sneeze();
    } catch (Sneeze s) {
      System.err.println("Sneeze caught");
    } catch (Annoyance a) {
      System.err.println("Annoynace caught");
    }
  }
}
