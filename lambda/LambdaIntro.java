package lambda;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//================================================
// Covers lambda, Consumer, Predicates, and maybe function & bifunction)
//================================================

class JustLambda {
  // 1. simple lambda function
  public void SimpleLambdaUsage() {
    ArrayList<Double> numbers = new ArrayList<Double>();
    numbers.add(9.0);
    numbers.add(8.0);
    numbers.add(1.0);
    numbers.forEach( n -> { System.out.println(n + n); } );
    // ways to write a lambda
      // param -> System.out.println();
      // (param, param2) -> System.out.println(param + param2)
      // (param, param1) -> { 
          // multi line function
      // }
  }

  // 2. how to use Consumer interface with Lambda
  public void UsingConsumerInterfaceToStoreLambdaFunction() {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);
    Consumer<Integer> methodName = (n) -> { System.out.println(n); };
    numbers.forEach( methodName );
  }

  // 3. using Consumer and consumer.accept(x)
  public void UsingConsumerAndAccept() {
    Consumer<String> myConsumer = (message) -> { System.out.println(message); };
    myConsumer.accept("Some random message"); 
  }


  // 4. Lambda expression can also be stored if the variable type is an interface and only has one method.
  @FunctionalInterface
  interface StringFunction {
    String print(String str);
    default void defaultMethod() {}; // we can add this but how do we use it? Used for backwards compatibility
  }
  public void NotUsingConsumer() {
    StringFunction duplicateMsg = (message) -> { 
      return message + message; 
    };
    UsingStringFunctionAsConsumer(duplicateMsg);
  }
  public void UsingStringFunctionAsConsumer(StringFunction strFunc) {
    String result = strFunc.print("this should be repeated ");
    System.out.println(result);
  }

  // 5. using functional interface (much like Consumer)
  public String UsingFunctionalInterface(String str, Function<String, String> fn) {
    return fn.apply(str);
  }

  // 6. Predicates are a functional interface. Accepts an argument and returns a boolean. Usually used to apply a filter to a collection of objects.
  public void UsingPredicateInFilter() {
    Predicate<Integer> greaterThan5 = x -> x > 5; // we can replace filter arg with this
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<Integer> collect = list.stream().filter(x -> x > 5).collect(Collectors.toList());

    System.out.println(collect);
  }

  // 7. Using predicate.and(), predicate.or()
  class User {
    String name, role;
    User(String name, String role) {
      this.name = name;
      this.role = role;
    }
  }
  public void UsingPredicateInFilterAnd() {
    Predicate<Integer> noGreaterThan5 = x -> x > 5;
    Predicate<Integer> noLessThan8 = x -> x < 8;

    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    List<Integer> collect = list.stream()
            .filter(noGreaterThan5.and(noLessThan8))
            .collect(Collectors.toList());

    System.out.println(collect);
  }

  // 8. Using predicate.test()
  public void callProcess() {
    Predicate<User> adminsOnly = user -> user.role.equals("admin");
    List<User> users = new ArrayList<>();
    //add some users to users list
    List<User> admins = process(users, adminsOnly);
    System.out.println(admins);
  }
  public List<User> process(List<User> users, Predicate<User> predicate) {
    List<User> result = new ArrayList<>();
    for (User user: users) {
      if (predicate.test(user)) 
        result.add(user);
    }
    return result;
  }
}
public class LambdaIntro {
  public static void main(String[] args) {
    JustLambda justLambda = new JustLambda();
    // justLambda.UsingConsumerAndAccept();

    // justLambda.NotUsingConsumer();

    justLambda.UsingPredicateInFilter();
  }
}

// Why use lambda?
// A lambda expression can implement a functional interface by defining an anonymous function that can be passed as an argument to some method


// Resources
// https://www.w3schools.com/java/java_lambda.asp
// https://www.baeldung.com/java-8-lambda-expressions-tips
// https://www.geeksforgeeks.org/java-8-predicate-with-examples/