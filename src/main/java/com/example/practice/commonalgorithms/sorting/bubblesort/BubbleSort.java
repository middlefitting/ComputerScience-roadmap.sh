package com.example.practice.commonalgorithms.sorting.bubblesort;

/**
 * BubbleSort.
 *
 * <p>
 *
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2024/06/12
 */
public class BubbleSort {
	public static int[] sort(int[] arr, boolean reverse) {
		int temp;
		boolean isSwapped;

		for (int i = arr.length; i > 0; i--) {
			isSwapped = false;
			for (int j = 0; j < i - 1; j++) {
				if (arr[j] > arr[j + 1] == !reverse) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					isSwapped = true;
				}
			}
			if (!isSwapped) {
				break;
			}
		}
		return arr;
	}
}
