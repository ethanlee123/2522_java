package generics.oracle_generic_practice;

public class WillThisCompile3 {
  public class Singleton<T> {
    
    // public static T getInstance() {
    //   if (instance == null)
    //   instance = new Singleton<T>();
      
    //   return instance;
    // }
    // private static T instance = null;

  }
}

// ans: no, will not compile
// 1. cannot create a static field of the type paremeter T
    //b/c static variables are shared among all non static object of the class
    //https://stackoverflow.com/questions/31263222/how-to-define-static-fields-for-type-parameter-in-java-generics

// 2. static methods must have their own type parameter b/c static methods dont belong to an instance, they belong to the class. Since theres no instance to get the type information, it must be specified using <T>

//================================================================
// is there a way to make this code compile?