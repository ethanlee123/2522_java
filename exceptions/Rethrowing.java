package exceptions;

class Rethrow {

  public static void throwIt() throws Exception {
    System.out.println("throwing in rethrow");
    throw new Exception();
  }
}

public class Rethrowing {
	// public double divide(double num, double denom) throws DivideByZeroException {
	// 	if (denom == 0) {
	// 		throw new DivideByZeroException();
	// 	}
	// 	return num/denom;
	// }
  public static void throwThisFirst() throws Exception {
    try {
      System.out.println("executing throwThisFirst");
      Rethrow.throwIt();
    } catch (Exception e) {
      System.out.println("Rethrowing from throwThisFirst and printing stack trace");
      // e.printStackTrace(System.err);
      throw e;
    } finally {
      System.out.println("does this finally block execute?");
    }
  }
	public static void main(String[] args) throws Exception {
		try {
      Rethrowing.throwThisFirst();
			// print and call divide(1, 0);
		} catch (Exception e) {
      System.out.println("catching exception in main");
      e.fillInStackTrace(); // try commenting this out
      e.printStackTrace(System.err);
			// handle your exception
		}
	}
}
