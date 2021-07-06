package recursion;

public class ReverseString {

	public static void main(String[] args) {
		String text = "Hello world";
		String revStr = "";
		char[] textArray = text.toCharArray();
		revStr = reverseStrIterative(textArray);
		System.out.println("Reverse str Iterative= " + revStr);
		revStr = reverseStrRecursive(textArray, textArray.length - 1);
		revStr = reverseStrRecursive(text, text.length() - 1);
		System.out.println("Reverse str recursive = " + revStr);
	}

	private static String reverseStrRecursive(String text, int index) {
		String revStr = "";
		if (index < 0) {
			return revStr;
		}
		revStr = text.charAt(index) + reverseStrRecursive(text, index - 1);
		return revStr;

	}

	private static String reverseStrRecursive(char[] textArray, int index) {
		String revStr = "";
		if (index < 0) {
			return revStr;
		}
		revStr = textArray[index] + reverseStrRecursive(textArray, index - 1);

		return revStr;

	}

	private static String reverseStrIterative(char[] textArray) {
		// TODO Auto-generated method stub

		String revStr = "";
		for (int i = textArray.length - 1; i >= 0; i--) {
			revStr += textArray[i];
		}
		return revStr;
	}

}
