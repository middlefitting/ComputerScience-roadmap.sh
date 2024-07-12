package com.example.practice.datastructures.tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * BinaryTree.
 *
 * <p> 기본 구현 및 Traversal Order </p>
 *
 * @param <T>
 */
public class BinaryTree<T extends Number> {
	private static final String sep = " ";

	Node<T> root;

	// Constructor
	public BinaryTree(T key) {
		this.root = new Node<>(key);
	}

	public BinaryTree() {
	}

	// DFS
	public void preOrder(Node<T> node) {
		if (node == null) {
			return;
		}
		System.out.print(sep + node.key);
		preOrder(node.left);
		preOrder(node.right);
	}

	public void inOrder(Node<T> node) {
		if (node == null) {
			return;
		}
		inOrder(node.left);
		System.out.print(sep + node.key);
		inOrder(node.right);
	}

	public void postOrder(Node<T> node) {
		if (node == null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(sep + node.key);
	}

	// BFS
	public void levelOrder() {
		Queue<Node> queue = new LinkedList<>();
		if (root != null) {
			queue.add(root);
		}

		StringBuilder sb = new StringBuilder();
		while (!queue.isEmpty()) {
			Node node = queue.poll();
			sb.append(node.key).append(sep);
			if (node.left != null) {
				queue.add(node.left);
			}
			if (node.right != null) {
				queue.add(node.right);
			}
		}
		System.out.println(sb);
	}

	static class Node<T extends Number> {
		protected T key;
		protected Node left;
		protected Node right;

		public Node(T key) {
			this.key = key;
		}
	}
}
