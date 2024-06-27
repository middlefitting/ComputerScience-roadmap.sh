package com.example.practice.datastructures.queue;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class HelloQueueTest {
	@Nested
	@DisplayName("isEmpty")
	class IsEmpty {
		@Test
		@DisplayName("비어 있는 경우")
		void empty() {
			//Arrange
			HelloQueue<String> queue = new HelloQueue();

			//Act
			boolean result = queue.isEmpty();

			//Assert
			Assertions.assertThat(result).isTrue();
		}

		@Test
		@DisplayName("비어 있지 않은 경우")
		void notEmpty() {
			//Arrange
			HelloQueue<String> queue = new HelloQueue();
			queue.push("Hello World");

			//Act
			boolean result = queue.isEmpty();

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
			HelloQueue<Integer> queue = new HelloQueue<>();
			int first = 10;
			int second = 20;
			queue.push(first);
			queue.push(second);

			//Act
			Integer pop = queue.pop();
			Integer top1 = queue.top();
			Integer top2 = queue.top();

			//Assert
			Assertions.assertThat(pop).isEqualTo(first);
			Assertions.assertThat(top1).isEqualTo(second);
			Assertions.assertThat(top2).isEqualTo(second);
		}

	}
}
