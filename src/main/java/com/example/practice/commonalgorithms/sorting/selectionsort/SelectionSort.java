package com.example.practice.commonalgorithms.sorting.selectionsort;

/**
 * SelectionSort.
 *
 * <p>
 *
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2024/06/13
 */
public class SelectionSort {
	public static int[] sort(int[] arr, boolean reverse) {
		int len = arr.length;
		int iMin;
		int temp;
		for (int j = 0; j < len; j++) {
			iMin = j;
			for (int i = j + 1; i < len; i++) {
				if (arr[iMin] > arr[i] == !reverse) {
					iMin = i;
				}
			}
			if (iMin != j) {
				temp = arr[iMin];
				arr[iMin] = arr[j];
				arr[j] = temp;
			}
		}
		return arr;
	}
}
