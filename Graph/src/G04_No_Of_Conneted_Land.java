import java.util.*;

class Pair {
	int i;
	int j;
	
	Pair(int i1, int j1) {
		i = i1;
		j = j1;
	}
}

// https://www.naukri.com/code360/problems/number-of-islands_845181
public class G04_No_Of_Conneted_Land {

	public static void main(String[] args) {
		ArrayList<Node> list = 	new ArrayList();
		
		int[][] graph = {
				{0,1,1,0},
				{0,1,1,0},
				{0,0,1,0},
				{0,0,0,0},
				{1,1,0,1}
		};
		noOfConnectedLands(graph);
	}
	
	public static void BFS(int[][] graph, int row, int col, int[][] visited) {
		Queue<Pair> q = new LinkedList();
		q.add(new Pair(row, col));
		visited[row][col] = 1;

		while(!q.isEmpty()) {
			Pair curNode = q.remove();
			int r = curNode.i;
			int c = curNode.j;
			
			for(int m = -1; m < 2; m++) {
				for (int n = -1; n < 2; n++) {
					int rowVal = r+m;
					int colVal = c+n;
					if(rowVal >= 0 && rowVal < graph.length && colVal >= 0 && colVal < graph[col].length) {
						if(graph[rowVal][colVal] == 1 && visited[rowVal][colVal] != 1) {
							q.add(new Pair(rowVal, colVal));
							visited[rowVal][colVal] = 1;
						}
					}
				}
			}
		}
		
	}
	
	public static void DFS(int[][] graph, int row, int col, int[][] visited) {
		visited[row][col] = 1;

			for(int m = -1; m < 2; m++) {
				for (int n = -1; n < 2; n++) {
					int rowVal = row+m;
					int colVal = col+n;
					if(rowVal >= 0 && rowVal < graph.length && colVal >= 0 && colVal < graph[col].length) {
						if(graph[rowVal][colVal] == 1 && visited[rowVal][colVal] != 1) {
							DFS(graph, rowVal, colVal, visited);
						}
					}
				}
			}		
	}
	
	public static void noOfConnectedLands(int[][] graph) {
		int count = 0;
		
		int[][] visited = new int[graph.length][graph.length];
		for (int i = 0; i < graph.length; i++) {
			for(int j = 0; j < graph[i].length; j++) {
				if(graph[i][j] == 1 && visited[i][j] != 1) {
					BFS(graph, i, j, visited);
					count++;
				}
			}
		}
		
		System.out.println(count);
	}

}
