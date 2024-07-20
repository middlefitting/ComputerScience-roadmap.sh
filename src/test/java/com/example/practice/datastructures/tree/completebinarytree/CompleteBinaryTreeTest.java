package com.example.practice.datastructures.tree.completebinarytree;

import java.util.LinkedList;
import java.util.stream.IntStream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CompleteBinaryTreeTest {

	@Test
	@DisplayName("완전이진트리는 LevelOrder 로 데이터가 추가되어야 한다")
	void test() {
		//Arrange
		CompleteBinaryTree<Integer> completeBinaryTree = new CompleteBinaryTree<>();
		LinkedList<Integer> list = new LinkedList<>();
		IntStream.range(0, 10).forEach(list::add);

		//Act
		list.stream().forEach(completeBinaryTree::insert);
		LinkedList<Integer> result = completeBinaryTree.levelOrder();

		//Assert
		Assertions.assertThat(result).isEqualTo(list);
	}
}
