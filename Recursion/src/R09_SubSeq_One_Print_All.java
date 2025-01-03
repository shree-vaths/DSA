
/*
 * Subarray is continuous and also ordered
 * Subsequence may not be continuous but its ordered
 */
import java.util.*;

public class R09_SubSeq_One_Print_All {

	public static void main(String[] args) {
		int[] arr = {3,1,2};
		List<ArrayList<Integer>> res = new ArrayList();
		ArrayList<Integer> list = new ArrayList();
		subseq2(arr, 0, list, res);
		
		for(List<Integer> l : res) {
			System.out.println(l);
		}
	}
	
	public static void subseq(int[] arr, int i, ArrayList<Integer> list, List<ArrayList<Integer>> res) {
		if(i == arr.length) {
			res.add(new ArrayList<Integer>(list));
			return;
		}
		
		list.add(arr[i]);
		subseq(arr, i+1, list, res);
		list.remove(list.size() - 1);
		subseq(arr, i+1, list, res);
	}
	
	/*
	 * For every element there are multiple options
	 */
	public static void subseq2(int[] arr, int index, ArrayList<Integer> list, List<ArrayList<Integer>> res) {
		res.add(new ArrayList(list));
		
		for(int i = index; i < arr.length; i++) {
			if(i != index && arr[i] == arr[i-1]) {
				continue;
			}
			
			list.add(arr[i]);
			subseq2(arr, i+1, list, res);
			list.remove(list.size() - 1);
		}
	}

}
