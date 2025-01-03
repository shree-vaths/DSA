
public class BT01_No_Of_Path_In_Maze {

	public static void main(String[] args) {
		System.out.println(countPath(0, 0, 2, 2, 3));
	}
	
	/*
	 * Ways to travel from (0, 0) to (2, 2)
	 */
	public static int countPath(int i, int j, int row, int col, int length) {
		if(i < 0 || i >= length || j < 0 || j >= length) {
			return 0;
		}
		
		if(i == row && j == col) {
			return 1;
		}
		
		return countPath(i+1, j, row, col, length) + countPath(i, j+1, row, col, length);
	}

}
