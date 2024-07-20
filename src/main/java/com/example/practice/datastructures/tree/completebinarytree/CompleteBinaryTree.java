package com.example.practice.datastructures.tree.completebinarytree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <p>
 *
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2024/07/20
 */
public class CompleteBinaryTree<T extends Number & Comparable<T>> {
	private Node<T> root;

	private Queue<Node<T>> queue = new LinkedList<>();

	public CompleteBinaryTree<T> insert(T data) {
		Node<T> newNode = new Node<>(data);
		if (root == null) {
			root = newNode;
			queue.add(root);
		} else {
			Node<T> current = queue.peek();
			if (current.left == null) {
				current.left = newNode;
			} else {
				current.right = newNode;
				queue.poll();
			}
			queue.add(newNode);
		}

		return this;
	}

	// BFS
	public LinkedList<T> levelOrder() {
		Queue<Node> queue = new LinkedList<>();
		LinkedList<T> result = new LinkedList<>();
		if (root != null) {
			queue.add(root);
		}

		while (!queue.isEmpty()) {
			Node<T> node = queue.poll();
			result.add(node.data);
			if (node.left != null) {
				queue.add(node.left);
			}
			if (node.right != null) {
				queue.add(node.right);
			}
		}
		return result;
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
