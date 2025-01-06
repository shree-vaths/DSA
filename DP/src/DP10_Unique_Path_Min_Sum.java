
// https://www.naukri.com/code360/problems/minimum-path-sum_985349
// Fixed start and an end
public class DP10_Unique_Path_Min_Sum {

	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3},
				{4,5,4},
				{7,5,9}
		};
		
		int[][] dp = new int[3][3];
		System.out.println(count(arr, 0, 0, 2, 2, dp));;
	}
	
	public static int count(int[][] arr, int i, int j, int targeti, int targetj, int[][] dp) {
		if(i > targeti || j > targetj) {
			return Integer.MAX_VALUE;
		}
		
		if(i == targeti && j == targetj) {
			return arr[i][j];
		}
		
		if(dp[i][j] != 0) {
			return dp[i][j];
		}
		
		int right = count(arr, i, j+1, targeti, targetj, dp);
		
		int down = count(arr, i+1, j, targeti, targetj, dp);
		
		dp[i][j] = arr[i][j]  + Math.min(right, down);
		
		return dp[i][j];
	}

}
