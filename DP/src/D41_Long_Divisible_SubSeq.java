import java.util.ArrayList;
import java.util.Arrays;

public class D41_Long_Divisible_SubSeq {

	public static void main(String[] args) {
		int[] arr = {1,8,7,4};
		
		Arrays.sort(arr);
		
		System.out.println(subseq2(arr, 0, -1));
	}
	
	public static ArrayList<Integer> subseq2(int[] arr, int i, int prev) {
		if(i >= arr.length) {
			return new ArrayList();
		}
		
		ArrayList<Integer> take = new ArrayList();
		
		if(prev == -1 || arr[i] % arr[prev] == 0) {
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
