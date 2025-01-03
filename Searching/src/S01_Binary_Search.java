
public class S01_Binary_Search {

	public static void main(String[] args) {
		int[] arr = {2, 3, 4, 15, 16, 18, 22, 45};
		System.out.println(search(arr, 22));
	}
	
	
	public static int search(int[] arr, int target) {
		int s = 0;
		int e = arr.length - 1;
		
		while(s <= e) {
			int m = (s+e) / 2;
			
			if(target < arr[m]) {
				e = m - 1;
			} else if(target > arr[m]) {
				s = m + 1;
			} else {
				return m;
			}
		}
		return -1;
	}

}
