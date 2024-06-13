package com.example.practice.commonalgorithms.sorting.bubblesort;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BubbleSortTest {
	@Test
	@DisplayName("Order must be Success")
	void test() {
		//Arrange
		int[] arr = {5, 4, 3, 2, 1};
		int[] arr2 = {3, 4, 3, -2, 1};

		//Act sort
		int[] result = BubbleSort.sort(arr, false);
		int[] result2 = BubbleSort.sort(arr2, false);

		//Assert sort
		Assertions.assertThat(result).isSorted();
		Assertions.assertThat(result2).isSorted();

		//Act reverse sort
		int[] result3 = BubbleSort.sort(arr, true);
		int[] result4 = BubbleSort.sort(arr2, true);

		//Assert reverse sort
		Assertions.assertThat(result3).isSortedAccordingTo((a, b) -> b - a);
		Assertions.assertThat(result4).isSortedAccordingTo((a, b) -> b - a);
	}
}
