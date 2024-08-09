package com.example.practice.commonalgorithms.graphs.bellmanfordsalgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B1865 {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int t = Integer.parseInt(br.readLine());
			for (int k = 0; k < t; k++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int n = Integer.parseInt(st.nextToken());
				int m = Integer.parseInt(st.nextToken());
				int w = Integer.parseInt(st.nextToken());

				LinkedList<Line> lines = new LinkedList<>();

				for (int i = 0; i < m; i++) {
					st = new StringTokenizer(br.readLine());
					int a = Integer.parseInt(st.nextToken());
					int b = Integer.parseInt(st.nextToken());
					int d = Integer.parseInt(st.nextToken());
					lines.add(new Line(a, b, d));
					lines.add(new Line(b, a, d));
				}

				for (int i = 0; i < w; i++) {
					st = new StringTokenizer(br.readLine());
					int a = Integer.parseInt(st.nextToken());
					int b = Integer.parseInt(st.nextToken());
					int d = Integer.parseInt(st.nextToken()) * -1;
					lines.add(new Line(a, b, d));
				}

				if (bellmanFordCycle(n, lines)) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}

			}
		} catch (IOException e) {
			throw new RuntimeException();
		}
	}

	private static boolean bellmanFordCycle(int n, LinkedList<Line> lines) {
		// 시작 정점이 정해져 있지 않으므로 음의 싸이클의 존재 여부만 판별한다.

		int[] dist = new int[n + 1];
		Arrays.fill(dist, 10001);
		for (int i = 0; i < n; i++) {
			for (Line line : lines) {
				if (dist[line.e] > dist[line.s] + line.d) {
					dist[line.e] = dist[line.s] + line.d;
					if (i == n - 1) {
						return true;
					}
				}
			}
		}
		return false;
	}

	static class Line {
		private int s;
		private int e;
		private int d;

		public Line(int s, int e, int d) {
			this.s = s;
			this.e = e;
			this.d = d;
		}
	}
}
