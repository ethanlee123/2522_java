package streaming_io;

import java.io.*;

class CustomerFilter extends FilterOutputStream{
  public CustomerFilter(OutputStream out) {
    super(out);
  }

  // convert all numbers to ?
  @Override
  public void write(int b) throws IOException {
    if (b >= 48 && b <= 57) {
      super.write('?');
    } else {
      super.write(b);
    }
  }
  
}
public class Filtered {
  static void closeFile(OutputStream out) throws IOException{
    try {
      if (out != null) out.close();
    } catch (IOException e) {
      System.err.println(e);
    }
  }

  public static void main(String[] args) throws IOException {
    FileOutputStream fout = null;
    CustomerFilter customFilter = null;
    int i;

    try {
      fout = new FileOutputStream("streaming_io\\output.txt");
      customFilter = new CustomerFilter(fout);

      System.out.println("type X to exit: ");
      while ((i = System.in.read()) != 'X') {
        customFilter.write(i);
      }
    } catch (IOException e) {
      System.err.println(e);
    } finally {
      // closing filter stream closes the underlying stream!!!
      Filtered.closeFile(customFilter);

    }
  }
}
