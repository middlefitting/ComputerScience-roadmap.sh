package com.example.practice.datastructures.tree.fullbinarytree;

public class FullBinaryTree<T extends Number & Comparable<T>> {

	public final static String NOT_EXIST = "Data not exist!";
	private Node<T> root;

	public FullBinaryTree<T> insert(T data) {
		root = insertData(root, data);
		return this;
	}

	private Node<T> insertData(
		Node<T> node, T data) {
		if (node == null) {
			return new Node<>(data);
		} else if (data.compareTo(node.data) <= 0) {
			node.left = insertData(node.left, data);
		} else {
			node.right = insertData(node.right, data);
		}
		return node;
	}

	public boolean isFullBinaryTree() {
		if (root == null) {
			throw new RuntimeException("empty tree");
		}
		return isFullBinary(root);
	}

	private boolean isFullBinary(Node<T> node) {
		return node != null
			&& ((node.left == null && node.right == null) || (isFullBinary(node.left) && isFullBinary(node.right)));
	}

	static class Node<T extends Number & Comparable<T>> {
		protected T data;
		protected Node<T> left;
		protected Node<T> right;

		public Node(T data) {
			this.data = data;
		}
	}
}
