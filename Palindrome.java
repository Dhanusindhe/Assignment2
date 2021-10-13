package assignmentday2;

public class Palindrome {

	public static void main(String[] args) {
		String value = "madam";
		String revValue = "";
		int length = value.length();
		for (int i = length - 1; i >= 0; i--) {
			revValue = revValue + value.charAt(i);
		}
		if (revValue.equals(value)) {
			System.out.println("The given " + value + " is a Palindrome");

		} else {
			System.out.println("The given " + value + " is not a Palindrome");
		}
	}
}
