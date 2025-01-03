
// https://www.naukri.com/code360/problems/frog-jump_3621012
public class DP03_Frog_Jump_One {

	// Minimal energy to jump to 0 to n
	public static void main(String[] args) {
		int[] energy = {10,30,60,10,60,50};
		int[] dp = new int[energy.length];
		System.out.println(jump(energy,energy.length-1,dp));
	}
	
	public static int jump(int[] energy, int n, int[] dp) {
		if(n == 0) {
			return 0;
		}
		
		if(dp[n] != 0) {
			return dp[n];
		}
		int right = Integer.MAX_VALUE;
		
		int left = Math.abs(energy[n] - energy[n-1]) + jump(energy, n-1, dp);
		if(n > 1) {
			right = Math.abs(energy[n] - energy[n-2]) + jump(energy, n-2, dp);
		}
		
		dp[n] = Math.min(right, left);
		
		return dp[n];
		
	}

}
