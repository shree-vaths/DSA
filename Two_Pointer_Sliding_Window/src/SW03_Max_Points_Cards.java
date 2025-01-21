// O(k)
// https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/description/
public class SW03_Max_Points_Cards {

	public static void main(String[] args) {
		int[] arr = {6,2,3,4,7,2,1,7,1};
		sum(arr, 4);
	}
	
	public static void sum(int[] arr, int k) {
		int sum = 0;
		int maxSum = 0;
		
		for(int i = 0; i < k; i++) {
			sum = sum + arr[i];
		}
		
		maxSum = Math.max(sum, maxSum);
		
		int rightIndex = arr.length -1;
		for(int i = k -1; i > -1; i--) {
			sum = sum - arr[i];
			sum = sum + arr[rightIndex];
			maxSum = Math.max(maxSum, sum);
			rightIndex--;
		}
		
		System.out.println(maxSum);
	}

}
