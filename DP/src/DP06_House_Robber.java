import java.util.Arrays;

// https://www.naukri.com/code360/problems/house-robber_839733
public class DP06_House_Robber {

	// First and last element are adjacent and its circle.
	public static void main(String[] args) {
		int[] arr = {2,3,2};
		int[] dp = new int[arr.length];
		int first = sum(Arrays.copyOfRange(arr, 0, arr.length-2), dp, 0);
		dp = new int[arr.length];
		int second = sum(Arrays.copyOfRange(arr, 1, arr.length-1), dp, 0);
		
		System.out.println(Math.max(first, second));

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
