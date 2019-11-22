package java_programms;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class BufferedReaderTest {
	public static void main(String args[]) throws IOException,FileNotFoundException {
		try {
			FileReader f= new FileReader("aravind.txt");
			BufferedReader br= new BufferedReader(f);
			String line= br.readLine();
			while(line!=null) {
				System.out.println((String)line);
				line= br.readLine();
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("File doesn't Exist");
		}
	}
}
