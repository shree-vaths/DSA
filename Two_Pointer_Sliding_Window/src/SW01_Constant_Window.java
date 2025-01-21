
public class SW01_Constant_Window {

	public static void main(String[] args) {
		int[] arr = {-1,2,3,3,4,5,-1};
		int k = 4;
		
		sum(arr, 4);
	}
	
	public static void sum(int[] arr, int k) {
		int l = 0;
		int r = k;
		int sum = 0;
		
		for(int i = 0; i < k; i++) {
			sum = sum + arr[i];
		}
		
		int min = sum;
		
		while(r < arr.length) {
			sum = sum - arr[l];
			sum = sum + arr[r];
			l++;
			r++;
			min = Math.max(sum, min);
		}
		
		System.out.println(min);
	}
	
	

}
