package sandbox;

interface Holiday {
  void boo();
}
/**
* Scary.
*/
class Scary implements Holiday {
 public void boo(){
 System.out.println("Boo!");
 }
}
/**
* Spooky.
*/
class Spooky extends Scary {
 public void boo(){
 System.out.println("Hoo");
 }
}
/**
* Halloween.
*/
public class Halloween {
 
 /**
 * Drives the program.
 * @param args
 */
 public static void main(String[] args){
 foo(new Spooky());
 }
 
 /**
 * @param x
 */
 private static void foo(Holiday x){
 x.boo();
 }
}