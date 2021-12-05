package exceptions;
public class ExceptionOrder{

  void f() throws Exception {

                throw new Exception();

  }

  void bar() throws Exception{

                 throw new Exception();

  }

  void foo() throws Exception{

                System.out.println("starting foo");

                try {

                               System.out.println("in try before f()");

                               f();

                               System.out.println("in try after f()");

                }

                catch(Exception e){

                               System.out.println("exception occurred");

                          //  bar();

                 }

                System.out.println("end of foo");

  }

  public static void main(String[] args) {

                ExceptionOrder c = new ExceptionOrder();

                try{       

                               c.foo();

                }

                catch(Exception e){

                               System.out.println("main caught exception");

                }

  }

}