package sandbox;

/**
* Student.
*/
public class Student {
 
  static int numStudents = 0; // what if we add final here?
  
  /**
  * Constructs an object of type Student.
  */
  public Student(){
    numStudents++;
  }
  
  /**
  * Drives the program
  * @param args
  */
  public static void main(String[] args){
    Student s1, s2, s3;
    s1= new Student();
    s2= new Student();
    s3= new Student();
    System.out.println("Total number of students is " + s3.numStudents);
  }
}
