package algorithms.divideandconqure;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int array[] = { 9, 26, 11, 20, 18, 5, 15 };
		System.out.println("Array = " + Arrays.toString(array));
		mergeSort(array,array.length);
		System.out.println("Sorted Array = " + Arrays.toString(array));

	}

	private static void mergeSort(int[] array,int size) {
		if (size > 1) {
			int mid = size / 2;
			int[] leftArray = new int[mid];
			int[] rightArray = new int[size - mid];
			for (int i = 0,j=0,k=0; i < size; i++) {
				if (i < mid) {
					leftArray[j++] = array[i];
				} else {
					rightArray[k++] = array[i];
				}

			}
			mergeSort(leftArray,mid);
			mergeSort(rightArray,size-mid);
			merge(array, leftArray, rightArray,mid,size-mid);
		}

	}


	private static void merge(int[] array, int[] leftArray, int[] rightArray,int left,int right) {
		int i = 0, j = 0, k = 0;
		while (i < left && j < right) {
			if (leftArray[i] <= rightArray[j]) {
				array[k++] = leftArray[i++];
			}
			else {
				array[k++] = rightArray[j++];
			}
		}
		while (i < left) {
			array[k++] = leftArray[i++];
		}
		while (j < right) {
			array[k++] = rightArray[j++];
		}
		}



}
