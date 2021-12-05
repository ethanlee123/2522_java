package streaming_io;
import java.io.*;

public class IOStreamDemo {
  public static void main(String[] args) throws IOException {
    
    // 1. reading input by lines
    BufferedReader reader = new BufferedReader( // makes it more efficient
      new FileReader("IOStreamDemo.java"));

    String s, s2 = new String();
    while((s = reader.readLine()) != null) {
      s2 += s + "\n";
    }
    
    reader.close();

    // 2. reading standard input
    BufferedReader stdin = new BufferedReader( 
      new InputStreamReader(System.in));

    System.out.print("Enter line: ");
    System.out.println(stdin.readLine());
  
    //3. input from memory
    StringReader input = new StringReader(s2);
    int c;
    while ((c = input.read()) != -1) {
      System.out.print((char) c);
    }

    // formatted memory input
    try {
      DataInputStream dataInput = new DataInputStream(
        new ByteArrayInputStream(s2.getBytes()));
    
      while (true)
        System.out.print((char) dataInput.readByte());
    } catch(EOFException e) {
      System.err.println("end of stream");
    }

    // 5. file output
    try {
      BufferedReader in4 = new BufferedReader(
        new StringReader(s2));
        
      PrintWriter out1 = new PrintWriter(
        new BufferedWriter(
          new FileWriter("IODemo.out")));

      int lineCount = 1;
      while((s = in4.readLine()) != null) {
        out1.println(lineCount++ + ": " + s);
      };
      out1.close();
    } catch(EOFException e) {
      System.err.println("end of stream");
    }

    // 6 storing and recovering data
    try {
      // DataOutputStream lets us specify the data type
      DataOutputStream out2 = new DataOutputStream(
        new BufferedOutputStream(
          new FileOutputStream("Data.txt")));

      out2.writeDouble(3.1415);
      out2.writeChars("that was pi\n");
      out2.writeBytes("that was pi\n");
      out2.close();

      DataInputStream in5 = new DataInputStream(
        new BufferedInputStream(
          new FileInputStream("Data.txt")));
      System.out.println(in5.readDouble());
      System.out.println(in5.readLine());
      System.out.println(in5.readLine());
    } catch(EOFException e) {
      System.err.println("end of stream");
    }

    // 7. reading/writing random access files
    RandomAccessFile rf = new RandomAccessFile("rtest.dat", "rw");
    for (int i = 0; i < 10; i++) {
      rf.writeDouble(i * 1.414);
    }
    rf.close();

    // opening file again
    rf = new RandomAccessFile("rtest.dat", "rw");
    rf.seek(5*8); // moves 40 bytes forward
    rf.writeDouble(47.0001);
    rf.close();

    
  }
}

