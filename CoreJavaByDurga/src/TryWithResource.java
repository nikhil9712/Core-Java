import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {

	public static void main(String[] args) throws IOException {
		BufferedReader fileReader = null;
		try {
			fileReader = new BufferedReader(new FileReader("Demo.txt"));

		} finally {
			fileReader.close();
			
			
			AutoCloseable autoCloseable;
		}

		
		// Use Of Try With Resource
		try (BufferedReader fileReader1 = new BufferedReader(new FileReader("Demo.txt"))) {
			//fileReader1 = new BufferedReader(new FileReader("Demo.txt"));
			
			// ByDefault final
		}
		
		
		
		// Gives CTS In JDK 1.7 but not in JDK 1.9
		BufferedReader fileReader3 = new BufferedReader(new FileReader("Demo.txt"));
		try(fileReader3){
			
		}
		

	}
}
