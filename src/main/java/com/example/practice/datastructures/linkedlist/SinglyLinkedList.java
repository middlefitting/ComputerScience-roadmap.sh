package com.example.practice.datastructures.linkedlist;

import java.util.Optional;

import lombok.NoArgsConstructor;

/**
 * SinglyLinkedList.
 *
 * <p>
 *	단방향 링크드리스트 구현 코드.
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2024/06/22
 */
@NoArgsConstructor
public class SinglyLinkedList {
	public static final String EMPTY_LIST = "Empty List";
	public static final String KEY_NOT_EXIST = "Key does not exist";
	public static final String BAD_ARGUMENT_NULL = "Argument cannot be null";

	private Node head;
	private Node tail;

	public SinglyLinkedList(int key) {
		head = new Node(key);
		tail = head;
	}

	public SinglyLinkedList pushFront(int key) {
		Node node = new Node(key, head);
		this.head = node;
		if (tail == null) {
			tail = head;
		}
		return this;
	}

	public SinglyLinkedList popFront() {
		if (head == null) {
			throw new RuntimeException(EMPTY_LIST);
		}
		head = head.next;
		if (head == null) {
			tail = null;
		}
		return this;
	}

	public int keyTopFront() {
		if (head == null) {
			throw new RuntimeException(EMPTY_LIST);
		}
		return head.key;
	}

	public Optional<Node> TopFront() {
		return Optional.ofNullable(head);
	}

	public SinglyLinkedList pushBack(int key) {
		Node node = new Node(key);
		if (tail == null) {
			head = tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
		return this;
	}

	public SinglyLinkedList popBack() {
		if (tail == null) {
			throw new RuntimeException(EMPTY_LIST);
		}
		if (head == tail) {
			head = tail = null;
		} else {
			Node previousTail = head;
			while (previousTail.next != tail) {
				previousTail = previousTail.next;
			}
			previousTail.next = null;
			tail = previousTail;
		}
		return this;
	}

	public int keyTopBack() {
		if (tail == null) {
			throw new RuntimeException(EMPTY_LIST);
		}
		return tail.key;
	}

	public Optional<Node> TopBack() {
		return Optional.ofNullable(tail);
	}

	public boolean isEmpty() {
		return head == null;
	}

	public Optional<Node> find(int key) {
		Node node = head;
		while (node != null && node.key != key) {
			node = node.next;
		}
		return Optional.ofNullable(node);
	}

	public SinglyLinkedList erase(int key) {
		Node node = head;
		Node previous = null;
		while (node != null && node.key != key) {
			previous = node;
			node = node.next;
		}

		if (node == null) {
			throw new RuntimeException(KEY_NOT_EXIST);
		}

		if (node == head) {
			head = head.next;
			if (head == null) {
				tail = null;
			}
		} else {
			previous.next = node.next;
			if (node == tail) {
				tail = previous;
			}
		}

		return this;
	}

	public SinglyLinkedList addNext(Node previousNode, int key) {
		if (previousNode == null) {
			throw new RuntimeException(BAD_ARGUMENT_NULL);
		}
		Node node = new Node(key, previousNode.next);
		previousNode.next = node;
		if (node.next == null) {
			tail = node;
		}

		return this;
	}

	public static class Node {
		private int key;
		private Node next;

		public Node(int key) {
			this.key = key;
		}

		public Node(int key, Node next) {
			this.key = key;
			this.next = next;
		}

		public Node updateNext(Node next) {
			this.next = next;
			return this;
		}

		public int getKey() {
			return key;
		}
	}
}
