// O(N)
// https://leetcode.com/problems/max-consecutive-ones-iii/description/
public class SW05_Max_Consecutive_1s_3 {

	public static void main(String[] args) {
		int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
		count(arr, 2);
	}
	
	
	public static void count(int[] arr, int k) {
		int l = 0;
		int r = 0;
		int zeros = 0;
		int len = 0;
		int maxLen = 0;
		
		while(r < arr.length) {
			if(arr[r] == 0) {
				zeros++;
			}
			
			while(zeros > k) {
				if(arr[l] == 0) {
					zeros--;
				}
				l++;
			}
			
			if(zeros <= k && l <= r) {
				len = r - l + 1;
				maxLen = Math.max(len, maxLen);
			}
			r++;
		}
		
		System.out.println(maxLen);
		
	}

}
