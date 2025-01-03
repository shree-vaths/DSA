
public class DP04_Frog_Jump_Two {

	// Frog can jump upto k steps.
	// 1 step, 2 step, 3 step and upto k step
	public static void main(String[] args) {
		
	}
	
	public static int jump(int[] energy, int n, int k, int[] dp) {
		if(n == 0) {
			return 0;
		}
		
		if(dp[n] != 0) {
			return dp[n];
		}
		
		int value = Integer.MAX_VALUE;
		int minSteps = Integer.MAX_VALUE;
		
		for(int i = 1; i <= k; i++) {
			if((k - i) >= 0) {
				value = Math.abs(energy[n] - energy[n-i]) + jump(energy, n-i,k, dp);
			}
			minSteps = Math.min(minSteps, value);
		}
		dp[n] = minSteps;
		return dp[n];
		
	}

}
