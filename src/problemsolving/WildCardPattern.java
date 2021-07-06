package problemsolving;

/*
 * Write both the greedy and backtracking implementation for the problem given below:
Given an input string (s) and a pattern (p), implement wildcard pattern matching with support for '?' and '*' where:
§ '?'Matchesanysinglecharacter.
§ '*'Matchesanysequenceofcharacters(includingtheemptysequence).
The matching should cover the entire input string (not partial). Examples:
Input       Output Explanation
s = "aa", p = "a"     False      "a" does not match the entire string "aa".
s = "aa", p = "*"     True       ‘*’ matches any sequence
s = "cb", p = "?a"    False     '?' matches 'c', but the second letter is 'a', which does not match 'b'.
s = "adceb", p = "*a*b" True    The first '*' matches the empty sequence, while the second '*' matches the substring "dce"
s = "acdcb", p = "a*c?b"  False  There should have been only one character between c and b
 */

public class WildCardPattern {

	public static void main(String[] args) {
		// String a = "aa", p = "a";
		String a = "aahhghg", p = "*";
		// String a = "cb", p = "?a";
		// String a = "adceb", p = "*a*b";
		// String a = "acdcb", p = "a*c?b";
		System.out.println("a = " + a);
		System.out.println("p = " + p);
		if (a.equalsIgnoreCase(p)) {
			System.out.println("Result = true");
		} else if (p.equalsIgnoreCase("*")) {
			System.out.println("Result = true");
		} else {
			// System.out.println("Result 3 =" + firstMethod(a, p, 0, 0));
			System.out.println("Result 3 =" + secondMethod(a, p, 0, 0));
		}

	}

	private static boolean secondMethod(String a, String p, int aIndex, int pIndex) {
		// TODO Auto-generated method stub
		System.out.println("a.length()= " + a.length());
		System.out.println("aIndex= " + aIndex);
		if (pIndex == p.length()) {
			return aIndex == a.length();
		}
		char pChar = p.charAt(pIndex);
		char aChar = a.charAt(aIndex);
		System.out.println("aChar= " + aChar);
		System.out.println("pChar= " + pChar);
		if (pChar == '?' || aChar == pChar) {
			return secondMethod(a, p, aIndex + 1, pIndex + 1);
		} else if (pChar == '*' && a.charAt(aIndex) == p.charAt(pIndex + 1)) {
			return secondMethod(a, p, aIndex, pIndex + 1);
		} else if (pChar == '*' && a.charAt(aIndex) != p.charAt(pIndex + 1)) {
			return secondMethod(a, p, aIndex + 1, pIndex);
		}
		return false;
	}
}
