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

	public final static String NOT_EXIST = "Data not exist!";
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

	public BinarySearchTree<T> delete(T data) {
		root = deleteData(root, data);
		return this;
	}

	private Node<T> deleteData(Node<T> node, T data) {
		if (node == null) {
			throw new RuntimeException(NOT_EXIST);
		} else if (data.compareTo(node.data) < 0) {
			node.left = deleteData(node.left, data);
		} else if (data.compareTo(node.data) > 0) {
			node.right = deleteData(node.right, data);
		} else {
			// leaf node
			if (node.left == null && node.right == null) {
				return null;
			} else if (node.left == null) { // 1 child
				node = node.right;
			} else if (node.right == null) { // 1 child
				node = node.left;
			} else { // 2 child, recursion delete
				Node<T> temp = findMin(node.right);
				node.data = temp.data;
				node.right = deleteData(node.right, temp.data);
			}
		}
		return node;
	}

	public Node<T> findMin(Node<T> node) {
		if (node == null) {
			throw new RuntimeException("bad request");
		} else if (node.left != null) {
			return findMin(node.left);
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
