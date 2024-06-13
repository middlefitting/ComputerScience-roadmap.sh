package com.example.practice.commonalgorithms.sorting.insertionsort;

/**
 * InsertionSort.
 *
 * <p>
 *
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2024/06/13
 */
public class InsertionSort {
	public static int[] sort(int[] arr, boolean reverse) {
		int key;

		for (int i = 1; i < arr.length; i++) {
			key = arr[i];
			int j = i - 1;

			while (j >= 0 && (arr[j] > key == !reverse)) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = key;
		}

		return arr;
	}
}
