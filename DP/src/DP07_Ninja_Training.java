
// https://www.naukri.com/code360/problems/ninja-s-training_3621003
public class DP07_Ninja_Training {

	public static void main(String[] args) {
		int[][] arr = {
				{18,11,19},
				{4,13,7},
				{1,8,13}
		};
		
		int[] dp = new int[arr.length];
		
		System.out.println(train(arr, 0, -1, dp));
	}
	
	public static  int train(int[][] arr, int curDay, int lastTask, int[] dp) {
		if(curDay == arr.length) {
			return 0;
		}
		
		if(dp[curDay] != 0) {
			return dp[curDay];
		}
		
		int max = Integer.MIN_VALUE;
		
		for(int task = 0; task < arr[curDay].length; task++) {
			if(task != lastTask) {
				int res = arr[curDay][task] + train(arr, curDay+1, task, dp);
				max = Math.max(max, res);
			}
		}
		
		dp[curDay] = max;
		return dp[curDay];
	}

}
