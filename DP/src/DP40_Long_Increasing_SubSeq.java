import java.util.ArrayList;


// Use Binary Serach to solve this as it only takes O(n)
public class DP40_Long_Increasing_SubSeq {

	public static void main(String[] args) {
		int[] arr = {10, 9, 2,5, 3,7,101, 18};
		
		System.out.println(subseq2(arr, 0, -1));
	}
	
	public static int subseq(int[] arr, int i, int prev) {
		if(i >= arr.length) {
			return 0;
		}
		
		int take = Integer.MIN_VALUE;
		
		if(prev == -1 || arr[i] > arr[prev]) {
			take = 1 + subseq(arr, i+1, i);
		}
		
		int noTake = subseq(arr, i+1, prev);
		return Math.max(take, noTake);
	}
	
	public static ArrayList<Integer> subseq2(int[] arr, int i, int prev) {
		if(i >= arr.length) {
			return new ArrayList();
		}
		
		ArrayList<Integer> take = new ArrayList();
		
		if(prev == -1 || arr[i] > arr[prev]) {
			take = subseq2(arr, i+1, i);
			take.addLast(arr[i]);
		}
		
		ArrayList<Integer> noTake = subseq2(arr, i+1, prev);
		if(take.size() > noTake.size()) {
			return take;
		}
		return noTake;
	}
}
