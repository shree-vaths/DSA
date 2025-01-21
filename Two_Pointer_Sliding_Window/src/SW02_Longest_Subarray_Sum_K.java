// O(N)
// https://www.geeksforgeeks.org/longest-subarray-sum-elements-atmost-k/
public class SW02_Longest_Subarray_Sum_K {

	public static void main(String[] args) {
		int[] arr = {2,-5,1,7,10};
		//int[] arr = {10, 10, 10};
		sum(arr, 1);
	}
	
	public static void sum(int[] arr, int target) {
		int l = 0;
		int r = 0;
		int sum = 0;
		int len = 0;
		int maxLen = 0;
		while(r < arr.length) {
			sum = sum + arr[r];
			while(sum > target && l <= r) {
				sum = sum - arr[l];
				l++;
				
			}
			if(sum <= target && l <= r) {
				maxLen = Math.max(r-l+1, maxLen);
			}
			r++;
		}
		
		System.out.println(maxLen);
	}
	
	
	// Generate all subarray and find sum
	public static void bruteForce(int[] arr, int target) {
		int maxSum = Integer.MIN_VALUE;
		int maxLen = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			int sum = 0;
			
			for(int j = i; j < arr.length; j++) {
				sum = sum + arr[j];
				if(sum <= target) {
					maxSum = Math.max(maxSum, sum);
					maxLen = Math.max(maxLen, j-i+1);
				} else {
					// Optimization
					break;
				}
			}
		}
		System.out.println(maxSum);
		System.out.println(maxLen);
	}

}
