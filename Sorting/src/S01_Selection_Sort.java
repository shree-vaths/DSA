import java.util.Arrays;

public class S01_Selection_Sort {

	/*
	 * Select maximum item and place it at the end
	 */
	public static void main(String[] args) {
		int[] arr = {3,1,5};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void sort(int[] arr) {
		for(int i  = 0; i < arr.length; i++) {
			
			int max = Integer.MIN_VALUE;
			int maxIndex = -1;
			for(int j = 0; j < arr.length - i; j++) {
				if(arr[j] > max) {
					max = arr[j];
					maxIndex = j;
				}
			}
			int tmp = arr[arr.length - i - 1];
			arr[arr.length - i -1] = arr[maxIndex];
			arr[maxIndex] = tmp;
			
		}
	}

}
