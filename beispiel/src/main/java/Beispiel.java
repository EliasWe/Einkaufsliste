import java.io.*;

public class Beispiel {
	
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		
		try {
			input = reader.readLine();
		} catch (IOException e) {
			System.out.println("Exception: " + e.getMessage());
		}
		
		System.out.print(input.toUpperCase());
	}
}