import java.io.*;

public class AverageandMax {
	
	public static void main(String[] args) {
		BufferedReader reader = null;

		try {
			String currentLine;

			reader = new BufferedReader(new FileReader("numbers.txt"));
			while ((currentLine = reader.readLine()) != null) {
				System.out.println(currentLine);
			}
		} catch (IOException err) {
			err.printStackTrace();
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException err) {
				err.printStackTrace();
			}
		}
		
		
	}
}