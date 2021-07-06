package problemsolving;

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
		// TODO Auto-generated method stub
         int x= 2, y=3;
		int doubleOp = 2, decrementOP = -1;
		int count = 0;
		int xDouble = x * doubleOp;
		int xDecrement = x + decrementOP;
		if (y == (xDouble - xDecrement)) {
			count += 2;
			System.out.println("Use double operation and then decrement operation ");
			System.out.println("output = " + count);
		}
	}

}
