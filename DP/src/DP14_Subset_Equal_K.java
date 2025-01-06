// https://www.naukri.com/code360/problems/subset-sum-equal-to-k_1550954
public class DP14_Subset_Equal_K {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		
		System.out.println(subseq(arr, 0, 7));
	}
	
	public static boolean subseq(int[] arr, int i, int target) {
		if(i == arr.length || target < 0) {
			return false;
		}
		
		if(target == 0) {
			return true;
		}
		
		if(i == arr.length - 1) {
			return target == arr[i];
		}
		
		boolean take = subseq(arr, i+1, target-arr[i]);
		
		boolean notTake = subseq(arr, i+1, target);
		
		if(take == true || notTake == true) {
			return true;
		}
		return false;
	}

}
