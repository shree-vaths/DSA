
public class S03_Merge_Sort {

	public static void main(String[] args) {
		int[] arr = {3,2,1};
		sort(arr, 0, arr.length);
		
		for(int val: arr) {
			System.out.print(val + " ");
		}
	}
	
	public static void sort(int[] arr, int start, int end) {
		if(end-start == 1) {
			return;
		}
		
		int mid = (start + end) / 2;
		sort(arr, start, mid);
		sort(arr, mid , end);
		
		merge(arr, start, mid, end);
	}
	
	public static void merge(int[] arr, int start, int mid, int end) {
		int k = 0;
		int i = start;
		int j = mid;
		int[] ans = new int[end - start];
		
		while(i < mid && j < end) {
			if(arr[i] < arr[j]) {
				ans[k++] = arr[i];
				i++;
			} else {
				ans[k++] = arr[j];
				j++;
			}
		}
		
		if(i < mid) {
			ans[k++] = arr[i];
			i++;
		}
		
		if(j < end) {
			ans[k++] = arr[j];
			j++;
		}
		
		for(int m = 0; m < ans.length; m++) {
			arr[start + m] = ans[m];
		}
	}

}
