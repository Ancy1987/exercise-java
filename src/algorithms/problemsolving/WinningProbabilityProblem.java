/*
  There are N boxes, where N is even, and each box has a value (worth). 
  For example: 4 boxes of values [2, 5, 8, 1]. 
  Two players, A and B, need to share the boxes between them, in this way: 
  Player A chooses either the first or the last box in the set, 
  then player B does the same, and so on until there are no boxes left. 
  At the end, the player who has the largest value wins.
a. Write a recursive program to find out the
i. Winning probability of the player who starts first.
ii. Winning Probability of the player who does not start first.
Note that the above ([2, 5, 8, 1]) is just an example. Do not write your code for that example alone. Write the code for any even N and any values of boxes.
b. Draw the solution tree for the given example: [2, 5, 8, 1]
 */

package algorithms.problemsolving;

public class WinningProbabilityProblem {

	public static void main(String[] args) {
		int a[] = { 2, 5, 8, 1 };
		if (a.length % 2 == 0) {
			findIteratively(a);
			findRecursively(a, 0, a.length - 1, 1, 0, 0);
		} else {
			System.out.println("Not possible array should be even");
		}
	}

	private static void findRecursively(int[] a, int startIndex, int endIndex, int turn, int sumA, int sumB) {
		int size = a.length;
		if (startIndex < size && endIndex > -1) {
			int value = a[startIndex];
			if (a[endIndex] > a[startIndex]) {
				value = a[endIndex];
				endIndex--;
			} else if (startIndex == endIndex) {
				startIndex = size;
			} else {
				startIndex++;
			}
			if (turn == 1) {
				sumA += value;
				turn = 2;
			} else {
				sumB += value;
				turn = 1;
			}
			findRecursively(a, startIndex, endIndex, turn, sumA, sumB);
		} else {
			if (sumA > sumB) {
				System.out.println("Winning probability of the player is high who start first" + sumA + " " + sumB);
			} else {
				System.out.println(
						"Winning probability of the player is high who doesn't start first" + sumA + " " + sumB);
			}
		}

	}

	private static void findIteratively(int[] a) {
		int sumA = 0;
		int sumB = 0;
		int turn = 1;
		for (int i = 0; i < a.length; i++) {

			int value = a[i];
			if (a[a.length - 1] > a[i]) {
				value = a[a.length - 1];
			}
			if(turn == 1){
				sumA += value;
				turn = 2;
			} else {
				sumB += value;
				turn = 1;
			}

		}
		if (sumA > sumB) {
			System.out.println("Winning probability of the player is high who start first" + sumA + " " + sumB);
		} else {
			System.out.println("Winning probability of the player is high who doesn't start first" + sumA + " " + sumB);
		}
	}

}
