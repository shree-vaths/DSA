
public class DP17_Count_SubSet_Sum_K {

	public static void main(String[] args) {
		int[] arr = {1,2,2,3};
		
		System.out.println(count(arr, 0, 3));
	}
	
	public static int count(int[] arr, int i, int sum) {
		if(sum == 0) {
			return 1;
		}
		
		if(i == arr.length-1) {
			if(arr[i] == sum) {
				return 1;
			}
			return 0;
		}
		
		int take = count(arr, i+1, sum-arr[i]);
		
		int notTake = count(arr, i+1, sum);
		
		return take+notTake;
	}

}
