import java.util.*;

// https://www.naukri.com/code360/problems/flood-fill-_1082141
public class G05_Flood_Fill {

	public static void main(String[] args) {
		int[][] graph = {
				{1,1,1},
				{2,2,0},
				{2,2,2}
		};
		
		int initialRow = 2;
		int initialCol = 0;
		int oldColor = 2;
		int newColor = 3;
		
		floodFill(graph, initialRow, initialCol, oldColor, newColor);
		
		for(int[] row: graph) {
			for(int val: row) {
				System.out.print(val);
			}
			System.out.println();
		}
		
	}
	
	public static void floodFill(int[][] graph, int r, int c, int oldColor, int newColor) {
		int[][] visited = new int[graph.length][graph.length];
		
		if(graph[r][c] == oldColor && visited[r][c] != 1) {
			BFS(graph, r, c, oldColor, newColor, visited);
		}
	}
	
	public static void BFS(int[][] graph, int r, int c, int oldVal, int newVal, int[][] visited) {
		Queue<Pair> q = new LinkedList();
		q.add(new Pair(r, c));
		visited[r][c] = 1;
		graph[r][c] = newVal;
		
		int[][] directions = {
				{-1, 0},
				{0, 1},
				{1, 0},
				{0, -1}
		};
		
		while(!q.isEmpty()) {
			Pair curNode = q.remove();
			int row = curNode.i;
			int col = curNode.j;
			
			for(int[] direction : directions) {
				int newRow = row + direction[0];
				int newCol = col + direction[1];
				if(newRow >= 0 && newRow < graph.length && newCol >= 0 && newCol < graph[c].length) {
					if(graph[newRow][newCol] == oldVal && visited[newRow][newCol] != 1) {
						q.add(new Pair(newRow, newCol));
						visited[newRow][newCol] = 1;
						graph[newRow][newCol] = newVal;
					}
				}
				
			}
		}
	}

}
