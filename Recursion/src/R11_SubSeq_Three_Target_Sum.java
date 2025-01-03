import java.util.ArrayList;
import java.util.List;

public class R11_SubSeq_Three_Target_Sum {

	public static void main(String[] args) {
		int[] arr = {1,2,1};
		ArrayList<Integer> list = new ArrayList();
		subseq(arr, 0, list, 0, 2);
	}
	
	public static void subseq(int[] arr, int i, ArrayList<Integer> list, int sum, int target) {
		if(i == arr.length) {
			if(sum == target) {
				System.out.println(list);
			}
			return;
		}
		
		list.add(arr[i]);
		sum += arr[i];
		subseq(arr, i+1, list, sum, target);
		list.remove(list.size() - 1);
		sum -= arr[i];
		subseq(arr, i+1, list, sum, target);
		
	}

}
