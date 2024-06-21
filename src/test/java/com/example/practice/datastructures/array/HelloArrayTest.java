package com.example.practice.datastructures.array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HelloArrayTest {
	@Test
	@DisplayName("자바 정적 배열은 힙메모리에 할당되기 때문에 별도에 메소드로 전달하고 변경하였을때 당연히 영향을 받는다")
	void test() {
		//Arrange
		int value = 10;
		int change = 20;

		int[] arr = {value};

		//Act
		HelloArray.changeArrayValue(0, change, arr);

		//Assert
		Assertions.assertThat(arr[0]).isEqualTo(change);
	}
}
