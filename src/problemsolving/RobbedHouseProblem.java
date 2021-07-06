package problemsolving;

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
