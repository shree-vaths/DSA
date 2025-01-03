import java.util.*;

public class R14_Combination_Two {

	public static void main(String[] args) {
		int[] arr = {1,2,2,3,};
		ArrayList<Integer> list = new ArrayList();
		ArrayList<ArrayList<Integer>> res = new ArrayList();
		combination2(arr, 0, list, res, 3);
		for(ArrayList<Integer> l : res) {
			System.out.println(l);
		}
	}
	
	public static void combination2(int[] arr, int index, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> res, int target) {
		if(target == 0) {
			res.add(new ArrayList(list));
			return;
		}
		
		for(int i = index; i < arr.length; i++) {
			if(i != index && arr[i] == arr[i-1]) {
				continue;
			}
			if(arr[i] > target) {
				break;
			}
			
			if(arr[i] <= target) {
				list.add(arr[i]);
				combination2(arr, i+1, list, res, target-arr[i]);
				list.remove(list.size() - 1);
			}
		}
	}
}
