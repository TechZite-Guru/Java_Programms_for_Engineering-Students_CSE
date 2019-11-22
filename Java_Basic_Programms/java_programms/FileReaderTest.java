package java_programms;
import java.io.FileReader;
import java.io.IOException;
public class FileReaderTest {
	public static void main(String args[]) throws IOException {
		FileReader r= new FileReader("babu.txt");
		int s= r.read();
		while(s!=-1) {
			System.out.print((char)s);
			s=r.read();
		}
	}
}
