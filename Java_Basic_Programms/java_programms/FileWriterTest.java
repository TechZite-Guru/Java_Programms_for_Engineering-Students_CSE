package java_programms;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriterTest {
	public static void main(String args[]) throws IOException {
		FileWriter f= new FileWriter("babu.txt");
		f.write("Aravind is a B.Tech Student");
		/*char[] ch= {'a','b','c','d'};
		f.write("\n");
		for(char a:ch) {
			f.write(a+"\n");
		}*/
		f.flush();
		f.close();
	}
}
