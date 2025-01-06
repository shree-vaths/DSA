
// https://www.naukri.com/code360/problems/total-unique-paths_1081470
public class DP08_Uniue_Paths {

	public static void main(String[] args) {
		int[][] dp = new int[3][3];
		
		System.out.println(count(0, 0, 2, 2, dp));
	}
	
	public static int count(int i, int j, int targeti, int targetj, int[][] dp) {
		if(i == targeti && j == targetj) {
			return 1;
		}
		
		if(i > targeti || j > targetj) {
			return 0;
		}
		
		if(dp[i][j] != 0) {
			return dp[i][j];
		}
		int right = count(i, j+1, targeti, targetj, dp);
		
		int down = count(i+1, j, targeti, targetj, dp);
		
		dp[i][j] = right + down;
		
		return dp[i][j];
	}

}
