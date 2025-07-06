package com.programmingKC.dsa.pattern.graph.BFS;

import java.util.LinkedList;
import java.util.Queue;

import java.util.LinkedList;
import java.util.Queue;

class NearestExit {
	public int nearestExit(char[][] maze, int[] entrance) {
		int m = maze.length, n = maze[0].length;
		int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] { entrance[0], entrance[1], 0 });

		maze[entrance[0]][entrance[1]] = '+';

		while (!queue.isEmpty()) {
			int[] current = queue.poll();
			int x = current[0], y = current[1], steps = current[2];

			for (int[] dir : directions) {
				int nx = x + dir[0];
				int ny = y + dir[1];

				if (nx >= 0 && nx < m && ny >= 0 && ny < n && maze[nx][ny] == '.') {
					if (nx == 0 || nx == m - 1 || ny == 0 || ny == n - 1) {
						return steps + 1;
					}
					maze[nx][ny] = '+';
					queue.offer(new int[] { nx, ny, steps + 1 });
				}
			}
		}

		return -1;
	}
}

public class NearestExitSol {
	public static void main(String[] args) {
		char[][] maze = { { '+', '+', '.', '+' }, { '.', '.', '.', '+' }, { '+', '+', '+', '.' } };
		int[] entrance = { 1, 2 };

		NearestExit sol = new NearestExit();
		System.out.println(sol.nearestExit(maze, entrance)); // Output: 1
	}
}
