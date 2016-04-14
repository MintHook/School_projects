import java.util.Scanner;

public class SimpleArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int myArray[] = new int[10];
		
		for(int i = 0; i < myArray.length; i++) {
		    System.out.println("Enter an integer:");
			myArray[i] = in.nextInt();
		}
		
		for(int i = 0; i < 10; i++) {
		    System.out.print(myArray[i]);
		    if (i < 10){
		    	System.out.print(", ");
		    }
		}
		
		System.out.println("\nNow, enter a number to search for: ");
        int search = in.nextInt();
        int found = 0;
        for(int i = 0; i < myArray.length; i++) {
                if(myArray[i] == search) {
                        found++;
                }
        }
        
        in.close();
        System.out.println("Searching for " + search + ", found " + found + " of them." );
	}
}