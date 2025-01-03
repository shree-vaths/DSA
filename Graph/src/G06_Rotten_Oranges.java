import java.util.*;

class G06_Pair {
	int i;
	int j;
	int time;
	
	G06_Pair(int i1, int j1, int t) {
		i = i1;
		j = j1;
		time = t;
	}
}

// https://www.naukri.com/code360/problems/rotting-oranges_701655
public class G06_Rotten_Oranges {

	public static void main(String[] args) {
		int[][] graph = {
				{0,1,2},
				{0,1,1},
				{2,1,1}
		};
		
		oranges(graph);
		
		for(int[] row: graph) {
			for(int val: row) {
				System.out.print(val);
			}
			System.out.println();
		}
	}
	
	public static void oranges(int[][] graph) {
		int[][] visited = new int[graph.length][graph.length];
		int rotten = 2;
		int fresh = 1;
		int noOrange = 0;
		
		DFS(graph);
	}
	
	public static void DFS(int[][] graph) {
		Queue<G06_Pair> q = new LinkedList();
		int[][] visited = new int[graph.length][graph.length]; 
		int maxTime = Integer.MIN_VALUE;
		int[][] directions = {
				{-1, 0},
				{0, 1},
				{1, 0},
				{0, -1}
		};
		
		for(int i = 0; i < graph.length; i++) {
			for(int j = 0; j < graph[i].length; j++) {
				if(graph[i][j] == 2) {
					q.add(new G06_Pair(i, j, 0));
					visited[i][j] = 1;
					graph[i][j] = 2;
				}
			}
		}
		
		while(!q.isEmpty()) {
			G06_Pair curNode = q.remove();
			int rowVal = curNode.i;
			int colVal = curNode.j;
			int time = curNode.time;
			maxTime = Math.max(maxTime, time);
			for(int[] direction: directions) {
				int newRow = rowVal + direction[0];
				int newCol = colVal + direction[1];
				
				if(newRow >= 0 && newRow < graph.length && newCol >= 0 && newCol < graph[colVal].length) {
					if(graph[newRow][newCol] == 1 && visited[newRow][newCol] != 1) {
						q.add(new G06_Pair(newRow, newCol, time+1));
						visited[newRow][newCol] = 1;
						graph[newRow][newCol] = 2;
					}
				}
			}
		}
		
		System.out.println(maxTime);
	}

}
