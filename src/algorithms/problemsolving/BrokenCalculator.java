package algorithms.problemsolving;

import java.util.ArrayList;
import java.util.List;

/*
 * On a broken calculator that has a number showing on its display, we can perform two possible operations:	
 Double: Multiply the number on the display by 2
 Decrement: Subtract 1 from the number on the display
Initially, the calculator displays the number x. Return the minimum number of operations needed to display the number y. 			
Example:		
Input                  Output             Explanation
x = 2, y = 3         2                        Use double operation and then decrement operation {2 -> 4 -> 3}
x = 5, y = 8        2                        Use decrement and then double {5 -> 4 -> 8}

 */
public class BrokenCalculator {

	public static void main(String[] args) {
		 findOperation(5, 8);
	}

	private static void findOperation(int num, int value) {
		int calculatedValue = 0;
		int count =0;
		boolean isDoubled = false;
		while(calculatedValue < value){
			if(doubleValue(num)<value && !isDoubled)
			{
				calculatedValue += doubleValue(num);
				isDoubled = true;
				count ++;
			}else{
				calculatedValue += subtractOne(num);
				count ++;
			}
			if(calculatedValue == value){
				break;
			}else if(isDoubled){
				calculatedValue += subtractOne(num);
				count ++;
			}else{
				calculatedValue += doubleValue(num);
				count ++;
			}
		}
		System.out.println("output = "+count);

	}

	private static int subtractOne(int num) {
		return num - 1;
	}

	private static int doubleValue(int num) {
		return num * 2;
	}

}
