
public class SW10_Binary_Subarray_Sum {

	public static void main(String[] args) {
		int[] arr = {1,0,0,1,1,0};
		int ans1 = count(arr, 3);
		int ans2 = count(arr, 2);
		System.out.println(ans1 - ans2);
	}
	
	public static int count(int[] arr, int goal) {
		int l = 0;
		int r = 0;
		int count = 0;
		int sum = 0;
		
		while(r < arr.length) {
			sum = sum + arr[r];
			
			while(sum > goal) {
				sum = sum - arr[l];
				l++;
			}
			
			if(sum <= goal) {
				count = count + (r - l + 1);
			}
			r++;
		}
		return count;
	}

}
