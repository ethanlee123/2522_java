package streaming_io;

import java.io.*;

public class DataStream {
  public static void main(String[] args) {
    FileOutputStream fout = null;
    DataOutputStream dout = null;

    FileInputStream fin = null;
    DataInputStream din = null;

    try {
      fout = new FileOutputStream("streaming_io\\datastream.bin");
      dout = new DataOutputStream(fout);
    
      dout.writeChars("big bean"); // diff between writeChars and writeUTF?
      dout.writeInt(1);
      dout.writeDouble(2.15);
      dout.writeChars("small bean");
      dout.writeInt(2);
      dout.writeDouble(1.893);

      dout.close();
    } catch (IOException e) {
      System.err.println(e);
    }

    // reading file generate from above
    try {
      fin = new FileInputStream("streaming_io\\datastream.bin");
      din = new DataInputStream(fin);
    
      for (int i = 1; i <= 2; i++) {
        System.out.println(din.readUTF() + " " +din.readInt() + " " + din.readDouble());
      }
    } catch (IOException e) {
      System.err.println(e);
    }
  }
}
