
// https://leetcode.com/problems/partition-array-into-two-arrays-to-minimize-sum-difference/description/
// https://www.naukri.com/code360/problems/partition-a-set-into-two-subsets-such-that-the-difference-of-subset-sums-is-minimum_842494
public class DP16_Parition_Min_Sum_Difference {

	public static void main(String[] args) {
		int[] arr = {-36, 36};
		
		int s= 0;
		
		for(int val: arr) {
			s += Math.abs(val);
		}
		System.out.println(subSeq(arr, 0, 0, s));
	}
	
	
	public static int subSeq(int[] arr, int i, int curSum, int totalSum) {
		if(i == arr.length) {
			int otheSum = totalSum - curSum;
			return Math.abs(curSum - otheSum);
		}
		
		int take = subSeq(arr, i+1, curSum+arr[i], totalSum);
		
		int notTake = subSeq(arr, i+1, curSum, totalSum);
		
		return Math.min(take, notTake);
	}

}
