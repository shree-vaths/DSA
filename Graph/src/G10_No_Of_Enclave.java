import java.util.Stack;

// https://leetcode.com/problems/number-of-enclaves/description/
public class G10_No_Of_Enclave {

	public static void main(String[] args) {
		int[][] graph = {
				{0,0,0,1,1},
				{0,0,1,1,0},
				{0,1,0,0,0},
				{0,1,1,0,0},
				{0,0,0,1,1}
		};
		
		count(graph);
	}
	
	public static void count(int[][] graph) {
		int[][] visited = new int[graph.length][graph.length];
		int[] ans = new int[0];
		int count = 0;
		int original = 0;
		
		for(int i = 0 ; i < graph.length; i++) {
			for(int j = 0; j < graph[i].length; j++) {
				if(graph[i][j] == 1) {
					original ++;
				}
				if(i == 0 || i == graph.length-1 || j == 0 || j == graph.length-1) {
					if(visited[i][j] != 1 && graph[i][j] == 1) {
						DFS(i, j, graph, visited);
					}
				}
				
			}
		}
		
		for(int i = 0; i < visited.length; i++) {
			for(int j = 0; j < visited[i].length; j++) {
				if(visited[i][j] == 1) {
					count++;
				}
				System.out.print(visited[i][j]);
			}
			System.out.println();
		}
		
		System.out.println(original - count);
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
					if(graph[newRow][newCol] == 1 && visited[newRow][newCol] != 1) {
						s.push(new G10_Pair(newRow, newCol));
						visited[newRow][newCol] = 1;
					}
				}
			}
		}
	}

}
