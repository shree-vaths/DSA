
// https://www.naukri.com/code360/problems/maze-obstacles_977241
public class DP09_Unique_Path_Obstacle {

	public static void main(String[] args) {
		int[][] arr = {
				{0, 0, 0},
				{0, -1, 0},
				{0, 0, 0}
		};
		int[][] dp = new int[3][3];
		System.out.println(count(arr, 0, 0, 2, 2, dp));
	}
	
	public static int count(int[][] arr, int i, int j, int targeti, int targetj, int[][] dp) {
		if(i > targeti || j > targetj) {
			return 0;
		}
		
		if(i == targeti && j == targetj) {
			return 1;
		}
		
		if(arr[i][j] == -1) {
			dp[i][j] = 0;
			return 0;
		}
		
		if(dp[i][j] != 0) {
			return dp[i][j];
		}
		int right = count(arr, i, j+1, targeti, targetj, dp);
		
		int down = count(arr, i+1, j, targeti, targetj, dp);
		
		dp[i][j] = right + down;
		
		return dp[i][j];
	}

}
