
// https://www.naukri.com/code360/problems/maximum-path-sum-in-the-matrix_797998
// Variable start and variable end
public class DP12_Unique_Path_Min_Sum_2 {

	public static void main(String[] args) {
		int[][] arr = {
				{2,1,3},
				{6,5,4},
				{7,8,9}
		};
		
		int res = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++) {
			res = Math.min(res, pathSum(arr,0,i));
		}
		System.out.println(res);
	}
	
	public static int pathSum(int[][] arr, int i, int j) {
		if(i < 0 || j < 0 || i >= arr.length || j >= arr.length) {
			return Integer.MAX_VALUE;
		}
		
		if(i == arr.length-1) {
			return arr[i][j];
		}

		int[][] dir = {
				{1, 0},
				{1, 1},
				{1, -1}
		};
		
		int min = Integer.MAX_VALUE;
		
		for(int index = 0; index < 3; index++) {
			int newRow = i + dir[index][0];
			int newCol = j + dir[index][1];
			
			int res = pathSum(arr, newRow, newCol);
			min = Math.min(min, res);
		}
		
		return arr[i][j] + min;
	}

}
