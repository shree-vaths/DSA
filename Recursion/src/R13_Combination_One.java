import java.util.ArrayList;
import java.util.List;

public class R13_Combination_One {

	public static void main(String[] args) {
		int[] arr = {2,3,6,7};
		List<ArrayList<Integer>> res = new ArrayList();
		ArrayList<Integer> list = new ArrayList();
		
		combination(arr, 0, 7, list, res);
		
		for(List<Integer> l : res) {
			System.out.println(l);
		}
	}
	
	// You can pick multiple times and two duplicate subsets results are allowed
	public static void combination(int[] arr, int i, int sum, ArrayList<Integer> list, List<ArrayList<Integer>> res) {
		if(i == arr.length) {
			if(sum == 0) {
				res.add(new ArrayList<Integer>(list));
			}
			return;
		}
		
		if(arr[i] <= sum) {
			list.add(arr[i]);
			combination(arr, i, sum-arr[i], list, res);
			list.remove(list.size() - 1);
		}
		combination(arr, i+1, sum, list, res);
	}

}
