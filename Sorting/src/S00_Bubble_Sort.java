import java.util.Arrays;

public class S00_Bubble_Sort {

	/*
	 * This is comparison based sorting
	 * Bubble/ Sinking/Exchange sorting
	 * 
	 */
	public static void main(String[] args) {
		int[] arr = {3,1,5,4,2};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void sort(int[] arr) {
		for(int i = 0; i < arr.length ; i++) {
			
			for(int j = 1; j < arr.length - i; j++) {
				if(arr[j] < arr[j-1]) {
					int tmp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = tmp;
				}
			}
		}
	}
	
	

}
