package com.example.practice.datastructures.stack;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class HelloStackTest {
	@Nested
	@DisplayName("isEmpty")
	class IsEmpty {
		@Test
		@DisplayName("비어 있는 경우")
		void empty() {
			//Arrange
			HelloStack<String> stack = new HelloStack();

			//Act
			boolean result = stack.isEmpty();

			//Assert
			Assertions.assertThat(result).isTrue();
		}

		@Test
		@DisplayName("비어 있지 않은 경우")
		void notEmpty() {
			//Arrange
			HelloStack<String> stack = new HelloStack();
			stack.push("Hello World");

			//Act
			boolean result = stack.isEmpty();

			//Assert
			Assertions.assertThat(result).isFalse();
		}
	}

	@Nested
	@DisplayName("push top pop")
	class Push {
		@Test
		@DisplayName("push, top, pop 정상 작동 테스트")
		void test() {
			//Arrange
			HelloStack<Integer> stack = new HelloStack<>();
			int first = 10;
			int second = 20;
			stack.push(first);
			stack.push(second);

			//Act
			Integer pop = stack.pop();
			Integer top1 = stack.top();
			Integer top2 = stack.top();

			//Assert
			Assertions.assertThat(pop).isEqualTo(second);
			Assertions.assertThat(top1).isEqualTo(first);
			Assertions.assertThat(top2).isEqualTo(first);
		}

	}
}
