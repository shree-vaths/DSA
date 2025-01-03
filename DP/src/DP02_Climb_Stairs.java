
// https://www.naukri.com/code360/problems/count-ways-to-reach-nth-stairs_798650
public class DP02_Climb_Stairs {

	public static void main(String[] args) {
		int n = 4;
		int[] dp = new int[n];
		System.out.println(climb(3, dp));
	}
	
	public static int climb(int n, int[] dp) {
		if(n < 2) {
			return 1;
		}
		
		if(dp[n] != 0) {
			return dp[n];
		}
		
		dp[n] = climb(n-1, dp) + climb(n-2, dp);
		return dp[n];
	}
}
