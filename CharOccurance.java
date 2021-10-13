package assignmentday2;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "Welcome To Chennai";

		char letter = ('e');
		char[] charArray = str.toCharArray();
		int count = 0;
		for (int i = 0; i < charArray.length; i++) {
			if (str.charAt(i) == letter) {
				count++;
			}
		}
		System.out.println("No of " + letter + " char occarance = " + count);
	}
}