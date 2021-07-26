package algorithms.recursion;

public class SquareNumber {
	public static void main(String[] args) {
		int a = 5, result = 0;
		result = squareIterative(a);
		System.out.println("Square Iterative= " + result);
		result = squareRecursive(a);
		System.out.println("Square recursive = " + result);
	}

	private static int squareRecursive(int num) {
		int result = 0;
		if (num == 0) {
			return result;
		}
		// n^2=(n-1)^2+2n -1)
		result = squareRecursive(num - 1) + (2 * num) - 1;

		return result;

	}

	private static int squareIterative(int num) {
		// TODO Auto-generated method stub
		return num * num;
	}

}
