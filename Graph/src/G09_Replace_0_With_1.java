import java.util.*;

class G10_Pair{
	int i;
	int j;
	G10_Pair(int i1, int j1) {
		i = i1;
		j = j1;
	}
}

public class G09_Replace_0_With_1 {

	public static void main(String[] args) {
		int[][] graph = {
				{1,1,1,1,1},
				{1,0,0,1,0},
				{1,1,0,1,0},
				{1,0,1,0,1},
				{0,0,1,1,1}
		};
		
		replace(graph);
	}
	
	public static void replace(int[][] graph) {
		int[][] visited = new int[graph.length][graph.length];
		int[][] ans = new int[graph.length][graph.length];
		for(int i = 0 ; i < graph.length; i++) {
			for(int j = 0; j < graph[i].length; j++) {
				if(i == 0 || i == graph.length-1 || j == 0 || j == graph.length-1) {
					if(visited[i][j] != 1 && graph[i][j] == 0) {
						DFS(i, j, graph, visited);
					}
				}
				
			}
		}
		
		for(int i = 0; i < visited.length; i++) {
			for(int j = 0; j < visited[i].length; j++) {
				if(visited[i][j] == 1) {
					ans[i][j] = 0;
				} else {
					ans[i][j] = 1;
				}
			}
			System.out.println();
		}
		
		for(int[] row: ans) {
			for(int val: row) {
				System.out.print(val);
			}
			System.out.println();
		}
	}
	
	public static void DFS(int r, int c, int[][] graph, int[][] visited) {
		Stack<G10_Pair> s = new Stack();
		int[][] directions = {
				{-1, 0},
				{0, 1},
				{1, 0},
				{0, -1}
		};
		s.push(new G10_Pair(r, c));
		visited[r][c] = 1;
		
		while(!s.isEmpty()) {
			G10_Pair node = s.pop();
			int row = node.i;
			int col = node.j;
			
			for(int[] dir: directions) {
				int newRow = row + dir[0];
				int newCol = col + dir[1];
				
				if(newRow >= 0 && newRow < graph.length && newCol >= 0 && newCol < graph[c].length) {
					if(graph[newRow][newCol] == 0 && visited[newRow][newCol] != 1) {
						s.push(new G10_Pair(newRow, newCol));
						visited[newRow][newCol] = 1;
					}
				}
			}
		}
	}

}
