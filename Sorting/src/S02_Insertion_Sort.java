import java.util.Arrays;

public class S02_Insertion_Sort {

	public static void main(String[] args) {
		int[] arr = {3,1,5,4,2};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void sort(int[] arr) {
		for(int i = 0; i < arr.length -1; i++) {
			
			for(int j = i+1; j > 0; j--) {
				if(arr[j] < arr[j-1]) {
					int tmp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = tmp;
				} else {
					break;
				}
			}
		}
	}

}
