
public class R10_Subseq_Two_Sum_All {

	/*
	 * Find sum of all subsets.
	 * Subsets is same as subsequence
	 * Subset is for an array and subsequence is for string
	 * No Duplicate elements
	 * 
	 */
	public static void main(String[] args) {
		int[] arr = {3,1,2};
		sum(arr, 0, 0);
	}
	
	public static void sum(int[] arr, int i, int sum) {
		if(i == arr.length) {
			System.out.print(sum + " ");
			return;
		}
		
		sum(arr, i+1, sum+arr[i]);
		sum(arr, i+1, sum);
	}

}
