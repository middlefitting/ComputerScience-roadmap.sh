package com.example.practice.datastructures.stack;

import java.util.LinkedList;

/**
 * HelloStack.
 *
 * <p>
 *
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2024/06/27
 */
public class HelloStack<T> {
	private LinkedList<T> list;

	public HelloStack() {
		list = new LinkedList<>();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public void push(T key) {
		list.addFirst(key);
	}

	public T top() {
		return list.peekFirst();
	}

	public T pop() {
		return list.pollFirst();
	}
}
