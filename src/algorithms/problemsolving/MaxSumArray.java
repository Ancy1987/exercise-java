/*
 Write a recursive code implementation for the problem specified below. Also, explain the problem solving technique you have employed, and why!
Given an integer array, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
Example 1:
Input: [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6. Example 2:
Input: [1] Output: 1
 */

package algorithms.problemsolving;

public class MaxSumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		maxSumIterative(a);
		maxSumRecursiveBottom(a, 0, 0);
		int maxSum = maxSumRecursiveTop(a, a.length - 1,0);
		System.out.println("Maximum sum   = " + maxSum);
	}

	private static void maxSumIterative(int[] a) {
		// String index = "0";
		int maxSum = 0;
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = i; j < a.length; j++) {
				sum += a[j];
				if (sum > maxSum) {
					maxSum = sum;
					// index = i + " to " + j;
				}
			}

		}
		System.out.println("Maximum sum   = " + maxSum);
	}

	private static void maxSumRecursiveBottom(int[] a, int startIndex, int maxSum) {
		int sum = 0;
		if (startIndex < a.length) {
			for (int j = startIndex; j < a.length; j++) {
				sum += a[j];
				if (sum > maxSum) {
					maxSum = sum;
				}
			}
			maxSumRecursiveBottom(a, startIndex + 1, maxSum);
		} else {
			System.out.println("Maximum sum  = " + maxSum);
		}
	}

	private static int maxSumRecursiveTop(int[] a, int index, int maxSum) {
		int sum = 0;
		if (index == 0) {
			return maxSum;
		}
		for (int j = index; j >= 0; j--) {
			sum += a[j];
			if (sum > maxSum) {
				maxSum = sum;
			}
		}
		maxSumRecursiveTop(a, index - 1,maxSum);
		return maxSum;

	}
}
