
public class BT03_Maze_Obstacle {

	public static void main(String[] args) {
		int[][] graph = {
				{1,1,1},
				{1,0,1},
				{0,1,1}
		};
		
		// 0 is obstacle
		
		countPath(graph, 0, 0, 2, 2, graph.length, "");

		
	}
	
	public static void countPath(int[][] graph, int i, int j, int row, int col, int length, String ans) {
		if(i < 0 || i >= length || j < 0 || j >= length) {
			return;
		}
		
		if(graph[i][j] == 0) {
			return;
		}
		
		if(i == row && j == col) {
			System.out.println(ans);
			return;
		}
		
		countPath(graph, i+1, j, row, col, length, ans + " D");
		countPath(graph, i, j+1, row, col, length, ans + " R");
	}

}
