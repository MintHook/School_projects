import java.util.Arrays;
import java.util.Scanner;

public class ArrayUpdate {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		Scanner in = new Scanner(System.in);
		System.out.print("Choose an index between 0 and 5: ");
		int index = in.nextInt();
		System.out.print("Choose a value to insert at your index: ");
		int replaceWith = in.nextInt();
		in.close();
		for (int i = arr.length - 1; i > index; i--) {
			arr[i] = arr[i - 1];
		}
		arr[index] = replaceWith;
		System.out.println(Arrays.toString(arr));
	}
}
