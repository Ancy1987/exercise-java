
/*
 * Given three numbers sum S, prime P, and N, find all N prime numbers after prime P such that their sum is equal to S. 
Example:
					
Input                                   Output         Explanation
					
N = 2, P = 7, S = 28           11, 17           11 and 17 are primes after prime 7 and (11 + 17 = 28)
 */
package algorithms.problemsolving;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberAfter {

	static List<Integer> primeNumber = new ArrayList<Integer>();
	static List<List<Integer>> result = new ArrayList<List<Integer>>();

	public static void main(String[] args) {
		int N = 2, P = 7, S = 28;
		findPrimeNumbers(P, S);
		System.out.println(primeNumber);
		findSumElements(S, N,0,0,new ArrayList<Integer>());
		System.out.println(result);
	}

	private static void findSumElements(int S, int N,int start ,int calSum,List<Integer> elements) {
		if(elements.size()==N && calSum == S) {
			result.add(new ArrayList<>(elements));
			return;
		}
		if(calSum>S || start>primeNumber.size()|| elements.size()>N){
			return;
		}
		calSum += primeNumber.get(start);
		elements.add(primeNumber.get(start));
		findSumElements(S, N, start + 1, calSum, elements);
		elements.remove(elements.size()-1);
	 }

	private static void findPrimeNumbers(int startFrom, int sum) {
		for (int i = startFrom + 1; i <= sum; i++) {
			int countFactor = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					countFactor++;
				}
			}
			if (countFactor == 2) {
				primeNumber.add(i);
			}
		}
	}

}
