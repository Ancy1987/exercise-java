package algorithms.recursion;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "aeiou";
		char[] textArray = text.toLowerCase().toCharArray();
		int count = 0;
		count = countVowelIterative(textArray);
		System.out.println("Count Vowels Iterative= " + count);
		count = countVowelRecursive(text, text.length() - 1);
		System.out.println("Count Vowels recursive = " + count);
	}

	private static int isVowel(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return 1;
		}
		return 0;
	}

	private static int countVowelRecursive(String text, int index) {
		int count = 0;
		if (index < 0) {
			return count;
		}
		count = isVowel(text.charAt(index)) + countVowelRecursive(text, index - 1);
		return count;
	}

	private static int countVowelIterative(char[] textArray) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = textArray.length - 1; i >= 0; i--) {
			count += isVowel(textArray[i]);
		}
		return count;
	}

}
