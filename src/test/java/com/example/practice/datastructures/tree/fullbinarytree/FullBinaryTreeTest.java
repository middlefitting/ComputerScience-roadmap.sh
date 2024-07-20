package com.example.practice.datastructures.tree.fullbinarytree;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FullBinaryTreeTest {
	@Test
	@DisplayName("포화 이진트리")
	void success() {
		//Arrange
		FullBinaryTree<Integer> tree = new FullBinaryTree<>();

		//Act
		tree.insert(2);
		tree.insert(1);
		tree.insert(4);
		tree.insert(3);
		tree.insert(5);

		//Assert
		Assertions.assertThat(tree.isFullBinaryTree()).isTrue();
	}

	@Test
	@DisplayName("포화 이진트리가 아님")
	void fail() {
		//Arrange
		FullBinaryTree<Integer> tree = new FullBinaryTree<>();

		//Act
		tree.insert(2);
		tree.insert(1);
		tree.insert(4);
		tree.insert(3);

		//Assert
		Assertions.assertThat(tree.isFullBinaryTree()).isFalse();
	}
}
