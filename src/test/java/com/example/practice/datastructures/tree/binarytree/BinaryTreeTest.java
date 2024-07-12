package com.example.practice.datastructures.tree.binarytree;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BinaryTreeTest {
	@Test
	@DisplayName("Level Order")
	void bfs() {
		//Arrange
		BinaryTree<Integer> tree = new BinaryTree<>(10);
		tree.root.left = new BinaryTree.Node(20);
		tree.root.left.left = new BinaryTree.Node(30);
		tree.root.left.right = new BinaryTree.Node(40);

		//Act
		tree.levelOrder();

	}
}
