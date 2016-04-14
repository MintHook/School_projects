import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a phrase: ");
		String phrase = in.nextLine();

		char[] letters = phrase.toCharArray();
		
		for(int i = letters.length-1; i >= 0; i--) {
	        System.out.print(letters[i]);
	}
		
		in.close();	
	}
}