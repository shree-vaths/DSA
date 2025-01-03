
public class BT04_Maze_All_Directions {
	public static void main(String[] args) {
		int[][] visited = new int[3][3];
		printPath(0, 0, 2, 2, 3, visited, "");
	}
	
	/*
	 * Ways to travel from (0, 0) to (2, 2)
	 */
	public static void printPath(int i, int j, int row, int col, int length,int[][] visited, String ans) {
		if(i < 0 || i >= length || j < 0 || j >= length) {
			return;
		}
		
		if(i == row && j == col) {
			System.out.println(ans);
			return;
		}
		
		if(visited[i][j] == 1) {
			return;
		}
		
		visited[i][j] = 1;
		printPath(i-1, j, row, col, length,visited, ans + " U");
		printPath(i+1, j, row, col, length,visited, ans + " D");
		printPath(i, j+1, row, col, length,visited, ans + " R");
		printPath(i, j-1, row, col, length,visited, ans + " L");
		visited[i][j] = 0;

	}
}
