package com.example.practice.datastructures.queue;

import java.util.LinkedList;

/**
 * HelloQueue.
 *
 * <p>
 *
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2024/06/27
 */
public class HelloQueue<T> {
	private LinkedList<T> list;

	public HelloQueue() {
		list = new LinkedList<>();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public void push(T key) {
		list.addLast(key);
	}

	public T top() {
		return list.peekFirst();
	}

	public T pop() {
		return list.pollFirst();
	}
}
