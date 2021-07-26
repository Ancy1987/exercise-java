package algorithms.divideandconqure;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int array[] = { 9, 26, 11, 20, 18, 5, 15 };
		System.out.println("Array = " + Arrays.toString(array));
		quickSort(array, 0, array.length - 1);
		System.out.println("Sorted Array = " + Arrays.toString(array));
	}

	private static void quickSort(int[] array, int leftMostIndex, int rightMostIndex) {
		if(leftMostIndex < rightMostIndex) {
			int pivotIndex = parition(array, leftMostIndex, rightMostIndex);
			System.out.println("pivotIndex = " + pivotIndex);
			quickSort(array, leftMostIndex, pivotIndex - 1);
			quickSort(array, pivotIndex + 1, rightMostIndex);
		}
	}

	private static int parition(int[] array, int leftMostIndex, int rightMostIndex) {
		System.out.println("parition Array = " + Arrays.toString(array));
		int pivotIndex = array[rightMostIndex];
		int storeIndex = leftMostIndex - 1;
		for (int i = leftMostIndex; i < rightMostIndex; i++) {
			if (array[i] <= pivotIndex) {
				storeIndex++;
				int temp = array[storeIndex];
				array[storeIndex] = array[i];
				array[i] = temp;
			}
		}
		int temp = array[storeIndex + 1];
		array[storeIndex + 1] = array[rightMostIndex];
		array[rightMostIndex] = temp;
		System.out.println("parition Array after= " + Arrays.toString(array));
		return storeIndex + 1;
	}

}
