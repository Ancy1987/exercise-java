package algorithms.problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * You have a bag full of gold, silver and bronze coins. If I have to pick 2 coins, what are the various
“combinations” of coin types I would get?
 */

public class CoinCombination {
	public static void main(String[] args) {
		char array[] = { 'G', 'S', 'B' };
		System.out.println("Array = " + Arrays.toString(array));
		List<String> result = coinCombinationCaseA(array, 0, new ArrayList<String>());
		System.out.println("Coin combination = " + result);

	}

	private static List<String> coinCombinationCaseA(char[] array, int i, List<String> result) {
		if (array.length == i) {
			return result;
		}
		for(int j=i;j<array.length;j++){
			String x = "" + array[i] + array[j];
			result.add(x);
		}
		i++;
		return coinCombinationCaseA(array, i, result);

	}

}
