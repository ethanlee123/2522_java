package streaming_io;
import java.io.*;

public class Redirecting {
  public static void main(String[] args) throws IOException {
    BufferedInputStream input = new BufferedInputStream(
      new FileInputStream("Redirecting.java"));

    PrintStream output = new PrintStream(
      new BufferedOutputStream(
        new FileOutputStream("test.out")));

    System.setIn(input);
    System.setOut(output);
    System.setErr(output);

    BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));

    String s;
    while ((s = br.readLine()) != null) {
      System.out.println(s);
    }

    output.close();
  }
}
