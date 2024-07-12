package com.example.practice.datastructures.tree.binarytree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BinaryTreeTest {

	BinaryTree<Integer> tree;

	@BeforeEach
	public void init() {
		tree = new BinaryTree<>(10);
		tree.root.left = new BinaryTree.Node(20);
		tree.root.right = new BinaryTree.Node(30);
		tree.root.left.left = new BinaryTree.Node(40);
		tree.root.left.right = new BinaryTree.Node(50);
	}

	@Test
	@DisplayName("LevelOrder")
	void levelOrder() {
		tree.levelOrder();
	}

	@Test
	@DisplayName("PreOrder")
	void preOrder() {
		tree.preOrder(tree.root);
	}

	@Test
	@DisplayName("InOrder")
	void inOrder() {
		tree.inOrder(tree.root);
	}

	@Test
	@DisplayName("PostOrder")
	void postOrder() {
		tree.postOrder(tree.root);
	}
}
