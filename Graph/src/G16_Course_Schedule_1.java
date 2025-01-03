import java.util.*;

public class G16_Course_Schedule_1 {

	public static void main(String[] args) {
//		int n = 5;
//		int[][] edges = {
//				{1,2},
//				{4,3},
//				{2,4},
//				{4,1}
//		};
		
		int n = 5;
		int[][] edges = {
				{1,0},
				{2,1},
				{3,2},
				{1,4}
		};
		
		ArrayList<ArrayList<Integer>> graph = new ArrayList();
		
		for(int i = 0; i < n; i++) {
			graph.add(i, new ArrayList());
		}
		
		for(int i = 0; i < edges.length; i++) {
			graph.get(edges[i][0]).add(edges[i][1]);
		}
		
		schedule(graph, n);
	}
	
	public static void schedule(ArrayList<ArrayList<Integer>> graph, int n) {
		Queue<Integer> q = new LinkedList();
		int[] inDegree = new int[n];
		ArrayList<Integer> ans = new ArrayList();
		
		for(int i = 0; i < graph.size(); i++) {
			ArrayList<Integer> neighbors = graph.get(i);
			for(int val: neighbors) {
				inDegree[val] += 1;
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(inDegree[i] == 0) {
				q.add(i);
			}
		}
		
		while(!q.isEmpty()) {
			int node = q.remove();
			ans.add(node);
			for(int val: graph.get(node)) {
				inDegree[val] -= 1;
				
				if(inDegree[val] == 0) {
					q.add(val);
				}
			}
		}
		
		System.out.println(ans.size() == n ? "Can Schedule" : "Cant Schedule");
	}

}
