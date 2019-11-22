package java_programms;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class BufferedWriterTest {
 public static void main(String args[]) throws IOException {
	 FileWriter f = new FileWriter("aravind.txt");
	 BufferedWriter b = new BufferedWriter(f);
	 b.write("Aravind Babu");
	 b.flush();
	 b.close();
 }
}
