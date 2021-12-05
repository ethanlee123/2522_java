package exceptions;


class ThrowOne {
  public void throwExceptionOne() throws Exception { 
    throw new Exception();
  }
}

class ThrowTwo extends ThrowOne {
  public void throwExceptionTwo() throws Exception { 
    try {
      System.out.println("Start throwExceptionTwo()");
      throwExceptionOne();
      System.out.println("End of throwExceptionTwo()");
    } catch (Exception e) {
      System.out.println("Start catch throwExceptionTwo()");
      throw e;
    } finally {
      System.out.println("finally of throwExceptionTwo()");
    }
    System.out.println("this shouldnt print of throwExceptionTwo()");
  }
}

class ThrowThree extends ThrowTwo {
  public void throwExceptionThree() throws Exception { 
    try {
      System.out.println("Start throwExceptionThree()");
      throwExceptionTwo();
    } finally {
      // notice we dont catch the exception
      System.out.println("finally of throwExceptionThree()");
    }
    System.out.println("this shouldnt print of throwExceptionThree()");
  }
}

public class ExecutionSequence {
  public static void main(String[] args) throws Exception {
    ThrowThree t3 = new ThrowThree();
    // try below without catch
    try {
      System.out.println("Start of main()");
      t3.throwExceptionThree();
      System.out.println("after calling t3.throwExceptionThree()");
    } finally {
      System.out.println("inside finally of main");
    }

    // try below with catch
    // try {
    //   System.out.println("Start of main()");
    //   t3.throwExceptionThree();
    //   System.out.println("after calling t3.throwExceptionThree()");
    // } catch (Exception e) {
    //   System.out.println("inside catch of main");
    // } finally {
    //   System.out.println("inside finally of main");
    // }
    System.out.println("end of main()");
  }  
}
