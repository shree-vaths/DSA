import java.util.*;

class G07_Pair {
	int i;
	int j;
	int lvl;
	
	G07_Pair(int i1, int j1, int t) {
		i = i1;
		j = j1;
		lvl = t;
	}
}

// https://www.naukri.com/code360/problems/distance-of-nearest-cell-having-1-in-a-binary-matrix_1169913
public class G07_Distance_To_Nearest_1 {

	public static void main(String[] args) {
		int[][] graph = {
				{0,0,1},
				{0,0,0},
				{1,0,0}
		};
		
		distance(graph);
	}
	
	public static void distance(int[][] graph) {
		int[][] visited = new int[graph.length][graph.length];
		int[][] dist = new int[graph.length][graph.length];
		
		BFS(graph, visited, dist);
		
		for(int[] row: dist) {
			for(int val: row) {
				System.out.print(val);
			}
			System.out.println();
		}
	}
	
	public static void BFS(int[][] graph, int[][] visited, int[][] dist) {
		Queue<G07_Pair> q = new LinkedList();
		int[][] directions = {
				{-1, 0},
				{0, 1},
				{1, 0},
				{0, -1}
		};
		
		for(int i = 0; i < graph.length; i++) {
			for(int j = 0; j < graph[i].length; j++) {
				if(graph[i][j] == 1) {
					q.add(new G07_Pair(i, j, 0));
					visited[i][j] = 1;
					dist[i][j] = 0;
				}
			}
		}
		
		while(!q.isEmpty()) {
			G07_Pair curNode = q.remove();
			int r = curNode.i;
			int c = curNode.j;
			int lvl = curNode.lvl;
			dist[r][c] = lvl;
			
			for(int[] dir: directions) {
				int newRow = r + dir[0];
				int newCol = c + dir[1];
				
				if(newRow >= 0 && newRow < graph.length && newCol >= 0 && newCol < graph[c].length) {
					if(graph[newRow][newCol] == 0 && visited[newRow][newCol] != 1) {
						q.add(new G07_Pair(newRow, newCol, lvl+1));
						visited[newRow][newCol] = 1;
					}
				}
			}
		}
		
	}
}
