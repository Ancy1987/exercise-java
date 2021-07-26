package algorithms.problemsolving;

/*
 * There are N houses in a line, each of which contains some value in it. 
 * A thief wishes to rob a few of these houses, but he cannot rob two 
 * adjacent houses because the owner of the robbed houses will inform 
 * the two neighbors. What are the possible combinations of houses that 
 * he can rob?
 */
public class RobbedHouseProblem {

	public static void main(String[] args) {
		int size = 6;
		robHouseRecursive(size, 1);
		// }

	}

	private static void robHouseIterative(int size) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= size; i++) {
			for (int j = i + 2; j <= size; j++) {
				System.out.println("list = " + i + "-" + j);
			}
		}
	}

	private static void robHouseRecursive(int size, int index) {
		// TODO Auto-generated method stub
		if (index < size) {
			for (int j = index + 2; j <= size; j++) {
				System.out.println("list = " + index + "-" + j);
			}
			robHouseRecursive(size, index + 1);
		}
	}
}
