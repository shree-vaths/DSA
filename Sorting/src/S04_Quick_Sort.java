
public class S04_Quick_Sort {

	public static void main(String[] args) {
		int[] arr = {5,4,3,2,1,0};
		sort(arr, 0, arr.length-1);
		
		for(int val: arr) {
			System.out.print(val + " ");
		}
	}
	
	
	public static void sort(int[] arr, int low, int high) {
		if(low >= high) {
			return;
		}
		
		int i = low;
		int j = high;
		int mid = (i + j) / 2;
		int pivot = arr[mid];
		
		while(i<= j) {
			while(arr[i] < pivot) {
				i++;
			}
			
			while(arr[j] > pivot) {
				j--;
			}
			
			if(i <= j) {
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}
		}
		
		sort(arr, low, j);
		sort(arr, i, high);
		
	}
}
