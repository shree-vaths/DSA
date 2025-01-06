
public class DP15_Partition_Subseq_Equal_Sum {

	public static void main(String[] args) {
		int[] arr = {2,3,3,3,4,5};
		
		int s= 0;
		
		for(int val: arr) {
			s += val;
		}
		
		if(s%2 == 0) {
			System.out.println(partition(arr, 0, s/2));
		}
	}
	
	public static boolean partition(int[] arr, int i, int target) {
		if(target < 0) {
			return false;
		}
		
		if(i == arr.length-1) {
			return target == arr[arr.length-1];
		}
		
		boolean take = partition(arr, i+1, target-arr[i]);
		
		boolean notTake = partition(arr, i+1, target);
		
		if(take == true || notTake == true) {
			return true;
		}
		return false;
	}

}
