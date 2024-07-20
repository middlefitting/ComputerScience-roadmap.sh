package com.example.practice.datastructures.tree.binarysearchtree;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class BinarySearchTreeTest {

	@Nested
	@DisplayName("insert test")
	class Insert {
		@Test
		@DisplayName("데이터의 추가는 대소 비교를 통해 잘 수행되어야 한다.")
		void insertSuccess() {
			//Arrange
			BinarySearchTree<Integer> tree = new BinarySearchTree<>();

			//Act
			tree.insert(7);
			tree.insert(5);
			tree.insert(10);
			tree.insert(5);
			tree.insert(9);
			tree.insert(12);

			//Assert
			Assertions.assertThat(tree.getRoot().data == 7);
			Assertions.assertThat(tree.getRoot().left.data == 5);
			Assertions.assertThat(tree.getRoot().left.left.data == 5);
			Assertions.assertThat(tree.getRoot().right.data == 10);
			Assertions.assertThat(tree.getRoot().right.left.data == 9);
			Assertions.assertThat(tree.getRoot().right.right.data == 12);
		}
	}
}
