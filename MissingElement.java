package assignmentday2;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		int[] elements = { 1, 2, 3, 4, 7, 6, 8 };
		Arrays.sort(elements);
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] != i + 1) {
				System.out.println(i + 1);
				break;
			}
		}
	}
}
