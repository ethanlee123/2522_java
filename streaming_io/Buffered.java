package streaming_io;
import java.io.*;

public class Buffered {

  static void closeFile(InputStream input, OutputStream output) {
    try {
      if (input != null) input.close();
      if (output != null) output.close();
    } catch (IOException e) {
      System.err.println(e);
    }
  }
  public static void main(String[] args) {
    BufferedInputStream input = null;
    BufferedOutputStream output = null;

    try {
      input = new BufferedInputStream(new FileInputStream("streaming_io\\data.txt"));
      output = new BufferedOutputStream(new FileOutputStream("streaming_io\\newdata.txt"));
      int i;
      while ((i = input.read()) != -1) {
        output.write(i);
      }
    } catch (IOException e) {
      System.err.println(e);
    } finally {
      Buffered.closeFile(input, output);
    }
  }
}
