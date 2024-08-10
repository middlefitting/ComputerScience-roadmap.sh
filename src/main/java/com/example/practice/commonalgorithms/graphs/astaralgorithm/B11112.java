package com.example.practice.commonalgorithms.graphs.astaralgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

/**
 * B11112.
 *
 * <p>
 *
 * </p>
 *
 * @author : middlefitting
 * @see :
 * @since : 2024/08/10
 */
public class B11112 {
	private static final int[][] mvs = {{1, 0,}, {0, 1}, {-1, 0}, {0, -1}};
	private static final char[][] answer = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '#'}};

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int t = Integer.parseInt(br.readLine());

			HashSet<Long> impossible = new HashSet<>();

			while (t-- > 0) {
				br.readLine();
				char[][] arr = new char[3][3];
				for (int i = 0; i < 3; i++) {
					arr[i] = br.readLine().toCharArray();
				}

				int x = 0;
				int y = 0;
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						if (arr[i][j] == '#') {
							x = i;
							y = j;
						}
					}
				}

				HashMap<Long, Integer> visit = new HashMap<>();
				visit.put(arrToLong(arr), calc(arr));
				PriorityQueue<Node> queue = new PriorityQueue<>();
				queue.add(new Node(arr, x, y, 0, calc(arr)));

				int answer = -1;
				while (!queue.isEmpty()) {
					Node node = queue.poll();

					if (node.left == 0) {
						answer = node.depth;
						break;
					}

					for (int[] mv : mvs) {
						int tx = node.x + mv[0];
						int ty = node.y + mv[1];

						if (tx < 0 || ty < 0 || tx >= 3 || ty >= 3) {
							continue;
						}
						char[][] tArr = new char[3][3];
						for (int i = 0; i < 3; i++) {
							for (int j = 0; j < 3; j++) {
								tArr[i][j] = node.arr[i][j];
							}
						}
						tArr[node.x][node.y] = node.arr[tx][ty];
						tArr[tx][ty] = node.arr[node.x][node.y];

						int tLeft = calc(tArr);
						int tDepth = node.depth + 1;

						long hash = arrToLong(tArr);
						if (visit.getOrDefault(hash, Integer.MAX_VALUE) <= tLeft + tDepth) {
							continue;
						}

						if (impossible.contains(hash)) {
							continue;
						}

						visit.put(hash, tLeft + tDepth);
						queue.add(new Node(tArr, tx, ty, tDepth, tLeft));
					}
				}
				if (answer != -1) {
					System.out.println(answer);
				} else {
					System.out.println("impossible");
					for (Long key : visit.keySet()) {
						impossible.add(key);
					}
				}
			}

		} catch (IOException e) {
			throw new RuntimeException();
		}
	}

	static class Node implements Comparable<Node> {
		private char[][] arr;
		private int x;
		private int y;
		private int depth;
		private int left;

		public Node(char[][] arr, int x, int y, int depth, int left) {
			this.arr = arr;
			this.x = x;
			this.y = y;
			this.depth = depth;
			this.left = left;
		}

		@Override
		public int compareTo(Node o) {
			int primaryComparison = Integer.compare(depth + left, o.depth + o.left);
			if (primaryComparison == 0) {
				return Integer.compare(depth, o.depth);
			}
			return primaryComparison;
		}
	}

	private static int calc(char[][] arr) {
		int cnt = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j] != answer[i][j]) {
					cnt++;
				}
			}
		}
		return cnt;
	}

	private static long arrToLong(char[][] arr) {
		long result = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				result = result * 10 + (arr[i][j] == '#' ? 9 : arr[i][j] - '0');
			}
		}
		return result;
	}
}
