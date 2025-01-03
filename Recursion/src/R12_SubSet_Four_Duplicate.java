import java.util.*;

public class R12_SubSet_Four_Duplicate {

	// arr with duplicate elements
	public static void main(String[] args) {
		int[] arr = {1,2,2,3,};
		ArrayList<Integer> list = new ArrayList();
		ArrayList<ArrayList<Integer>> res = new ArrayList();
		subsetDuplicate(arr, 0, list, res);
		for(ArrayList<Integer> l : res) {
			System.out.println(l);
		}
	}
	
	public static void subsetDuplicate(int[] arr, int index, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> res) {
		res.add(new ArrayList(list));
		
		for(int i = index; i < arr.length; i++) {
			if(i != index && arr[i] == arr[i-1]) {
				continue;
			}
			
			list.add(arr[i]);
			subsetDuplicate(arr, i+1, list, res);
			list.remove(list.size() - 1);
		}
	}

}
