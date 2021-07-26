package algorithms.backtracking;

import java.util.ArrayList;
import java.util.List;

/*
 * Given two integers n and k, return all possible combinations of k numbers out of the range [1, n].
 * You may return the answer in any order.
 * https://www.geeksforgeeks.org/make-combinations-size-k/
 */
public class comibinations {

	static List<List<Integer>> result = new ArrayList<>();

	public static void main(String[] args) {
		combine(4, 2);
		System.out.println(result);
	}

	private static void combine(int n, int k) {
		combination(n, k, 1, new ArrayList<>());
	}

	private static void combination(int n, int k, int start, List<Integer> list) {
		if (k == 0) {
			result.add(new ArrayList<>(list));
			return;
		}
		for (int i = start; i <= n - k + 1; i++) {
			System.out.println(i);
			list.add(i);
			System.out.println("add" + list);
			combination(n, k - 1, i + 1, list);
			list.remove(list.size() - 1);
			System.out.println("remove" + list);
		}

	}

}
