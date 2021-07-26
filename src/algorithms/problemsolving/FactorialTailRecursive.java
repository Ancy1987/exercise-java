package algorithms.problemsolving;

public class FactorialTailRecursive {

	public static void main(String[] args) {
		int num = 0;

		System.out.println("Factorial of " + num + " = " + factorial(num));

	}

	private static int factorial(int num) {
		if (num < 1) {
			return 1;
		}
		return num * factorial(num - 1);
	}

}
