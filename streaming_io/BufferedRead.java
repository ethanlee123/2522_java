package streaming_io;
import java.io.*;

public class BufferedRead {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader( // makes it more efficient
      new FileReader("streaming_io\\data.txt"));
  
      String s = new String();
      String s2 = new String();
      while((s = reader.readLine()) != null) {
        s2 += s + "\n";
      }
  
      reader.close();

      System.out.println("s: " + s);
      System.out.println("s2: " + s2);
  }
}
