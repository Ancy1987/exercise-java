package algorithms.problemsolving;

import java.util.Collections;
import java.util.List;


public class RobHouseProblem {

	public static void main(String[] args) {
		int size = 6;
		robberedHouseIterative(size);
		// }
      
	}

	private static void robberedHouseIterative(int size) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= size; i++) {
			for (int j = i + 2; j <= size; j++) {
				System.out.println("list = " + i + "-" + j);
			}
		}
	}

//	private static void iterativeMethod(int numOfHouses,int startWithHouseNo){
//		List<Integer> robbed = Lists.newArrayList();
//		for (int i = startWithHouseNo; i >= 1; i = i - 2) {
//			robbed.add(i);
//		}
//		for (int k = startWithHouseNo + 2; k <= numOfHouses; k = k + 2) {
//			robbed.add(k);
//		}
//		System.out.println("The possible combinations of houses that can robber by Iteration ");
//		Collections.sort(robbed);
//		System.out.println(robbed);
//	}
//	
//	private static void iterativeMethod(int numOfHouses) {
//		List<Integer> robbed1 = Lists.newArrayList();
//		List<Integer> robbed2 = Lists.newArrayList();
//		for (int i = 1; i <= numOfHouses; i++) {
//			if (i % 2 == 0) {
//				robbed2.add(i);
//			} else {
//				robbed1.add(i);
//			}
//		}
//		System.out.println("The possible combinations of houses that can robber by Iteration 2");
//		System.out.println(robbed1 + " " + robbed2);
//	}

}
