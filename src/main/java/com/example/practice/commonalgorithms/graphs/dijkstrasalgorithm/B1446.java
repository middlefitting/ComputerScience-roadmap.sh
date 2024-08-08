package com.example.practice.commonalgorithms.graphs.dijkstrasalgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class B1446 {
	private static int n;
	private static int d;
	private static int answer;
	private static HashSet<Integer> visit = new HashSet<>();
	private static HashMap<Integer, LinkedList<Node>> vec = new HashMap<>();
	private static PriorityQueue<Node> queue = new PriorityQueue<>();
	private static HashMap<Integer, Integer> dist = new HashMap<>();
	private static HashSet<Integer> nodes = new HashSet<>();

	public static void main(String[] args) {
		parse();
		dijkstra();
		calcResult();
	}

	private static void calcResult() {
		System.out.println(answer);
	}

	private static void parse() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			d = Integer.parseInt(st.nextToken());
			answer = d;

			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				dist.put(a, a);
				nodes.add(a);
				int b = Integer.parseInt(st.nextToken());
				dist.put(b, b);
				nodes.add(b);
				int tempD = Integer.parseInt(st.nextToken());
				queue.add(new Node(a, a));
				queue.add(new Node(b, b));
				LinkedList<Node> list = vec.getOrDefault(a, new LinkedList<>());
				list.add(new Node(b, tempD));
				vec.put(a, list);
			}

			queue.add(new Node(0, 0));
		} catch (IOException e) {
			throw new RuntimeException();
		}
	}

	private static void dijkstra() {
		while (!queue.isEmpty()) {
			Node a = queue.remove();
			if (visit.contains(a.node)) {
				continue;
			}
			if (a.node <= d) {
				answer = Math.min(answer, a.dist + d - a.node);
			}
			visit.add(a.node);
			// 존재하는 노드에 해당 노드를 거쳐 빠르게 도달할 수 있는 경우를 고려한다.
			for (int other : nodes) {
				if (other > a.node) {
					queue.add(new Node(other, a.dist + other - a.node));
				}
			}
			for (Node b : vec.getOrDefault(a.node, new LinkedList<>())) {
				if (dist.getOrDefault(b.node, Integer.MAX_VALUE) > b.dist + a.dist) {
					dist.put(b.node, b.dist + a.dist);
					queue.add(new Node(b.node, b.dist + a.dist));
				}
			}
		}
	}

	static class Node implements Comparable<Node> {
		private int node;
		private int dist;

		public Node(int node, int dist) {
			this.node = node;
			this.dist = dist;
		}

		@Override
		public int compareTo(Node o) {
			return Integer.compare(dist, o.dist);
		}
	}

}
