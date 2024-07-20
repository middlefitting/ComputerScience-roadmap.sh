package com.example.practice.datastructures.tree.binarysearchtree;

import lombok.Getter;

/**
 * BinarySearchTree.
 *
 * <p>
 *	unbalanced tree implementation.<br>
 *	insert, delete <br>
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2024/07/16
 */
@Getter
public class BinarySearchTree<T extends Number & Comparable<T>> {

	private Node<T> root;

	/**
	 * 재귀적 방식으로 데이터를 추가
	 * @param data
	 * @return
	 */
	public BinarySearchTree<T> insert(T data) {
		root = insertData(root, data);
		return this;
	}

	/**
	 * 노드의 추가를 대소 비교 및 재귀적으로 수행
	 * @param data
	 * @return
	 */
	private Node<T> insertData(Node<T> node, T data) {
		if (node == null) {
			return new Node<>(data);
		} else if (data.compareTo(node.data) <= 0) {
			node.left = insertData(node.left, data);
		} else {
			node.right = insertData(node.right, data);
		}
		return node;
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
