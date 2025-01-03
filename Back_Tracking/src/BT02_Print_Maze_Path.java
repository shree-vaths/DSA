
public class BT02_Print_Maze_Path {

	public static void main(String[] args) {
		countPath(0, 0, 2, 2, 3, "");
	}
	
	/*
	 * Ways to travel from (0, 0) to (2, 2)
	 */
	public static void countPath(int i, int j, int row, int col, int length, String ans) {
		if(i < 0 || i >= length || j < 0 || j >= length) {
			return;
		}
		
		if(i == row && j == col) {
			System.out.println(ans);
			return;
		}
		
		countPath(i+1, j, row, col, length, ans + " D");
		countPath(i, j+1, row, col, length, ans + " R");
	}

}
