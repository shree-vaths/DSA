// https://www.naukri.com/code360/problems/triangle_1229398
// Fixed start but variable end
public class DP11_Unique_Path_Min_Sum_Triangle {

	public static void main(String[] args) {
		int[][] arr = {
				{2}, 
				{3, 4},
				{6, 5, 7},
				{4, 1, 8, 3}
		};
		
		int[][] dp = new int[arr.length][arr.length];
		
		System.out.println(count(arr, 0, 0, 3, 3, dp));;
	}
	
	public static int count(int[][] arr, int i, int j, int targeti, int targetj, int[][] dp) {
		if(i == arr.length-1) {
			return arr[i][j];
		}
		
		if(dp[i][j] != 0) {
			return dp[i][j];
		}
		
		int diagonal = count(arr, i+1, j+1, targeti, targetj, dp);
		
		int down = count(arr, i+1, j, targeti, targetj, dp);
		
		dp[i][j] = arr[i][j]  + Math.min(diagonal, down);
		
		return dp[i][j];
	}

}
