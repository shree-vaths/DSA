
// https://www.naukri.com/code360/problems/maximum-sum-of-non-adjacent-elements_843261
public class DP05_Sum_Non_Adjacent_Items {

	public static void main(String[] args) {
		int[] arr = {2,1,4,9};
		int[] dp = new int[arr.length];
		
		System.out.println(sum(arr,dp, 0));
	}
	
	public static int sum(int[] arr,int[] dp, int i) {
		if(i > arr.length-1) {
			return 0;
		}
		if(i == arr.length-1) {
			return arr[i];
		}
		
		if(dp[i] != 0) {
			return dp[i];
		}
		
		int pick = arr[i] + sum(arr,dp, i+2);
		int notPick = 0 + sum(arr,dp, i+1);
		
		dp[i] = Math.max(pick, notPick);
		return dp[i];
	}

}
