import java.util.*;

public class R15_Permutation_One {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		List<List<Integer>> res = new ArrayList();
		List<Integer> list = new ArrayList();
		int[] visited = new int[arr.length];
		permutation1(arr, res, list, visited);
		
		for(List<Integer> lists : res) {
			for(int i : lists) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	
	public static void permutation1(int[] arr, List<List<Integer>> res, List<Integer> list, int[] visited) {
		boolean allVisited = true;
		for(int j = 0; j < visited.length; j++) {
			if(visited[j] != 1) {
				allVisited = false;
			}
		}
		if(allVisited) {
			res.add(new ArrayList(list));
			return;
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(visited[i] != 1) {
				visited[i] = 1;
				list.add(arr[i]);
				permutation1(arr, res, list, visited);
				list.remove(list.size()-1);
				visited[i] = 0;
			}
		}
		
		
	}

}
