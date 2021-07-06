package problemsolving;

/*
 * a. You are given an integer num. You can swap two digits at most once to get the maximum valued number. Return the maximum valued number you can get. 				
Examples:				
Input        Output                 Explanation				
2736          7236                 Swap the number 2 and the number 7 
9973          9973                 No Swap is required 

 */
public class SwapDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1765;
		int digit = String.valueOf(num).length();
		int leftFirst = (int) Math.pow(10, digit - 1);
		int leftSecond = (int) Math.pow(10, digit - 2);
		int first = num / leftFirst;
		int second = (num - first * leftFirst) / leftSecond;
		int rem = (num - (first * leftFirst + second * leftSecond));
		if (second > first) {
			num = (second * leftFirst) + (first * leftSecond) + rem;
		}
		System.out.println(" Maximum valued number = " + num);
	}

}
