
public class DP01_Fib {

	/*
	 * Consider fibonacci with 0 indexing
	 */
	public static void main(String[] args) {
		int n = 6;
		int[] dp = new int[n];
		
		System.out.println(Memoization(n-1, dp));
		
		Tabulation(n-1);
	}
	
	
	public static int Memoization(int n, int[] dp) {
		if(n < 2) {
			return n;
		}
		
		if(dp[n] != 0) {
			return dp[n];
		}
		
		dp[n] = Memoization(n-1, dp) + Memoization(n-2, dp);
		
		return dp[n];
	}
	
	public static void Tabulation(int n) {
		int[] dp = new int[n+1];
		
		dp[0] = 0;
		dp[1] = 1;
		
		for(int i = 2; i <=n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		System.out.println(dp[dp.length-1]);
	}

}
