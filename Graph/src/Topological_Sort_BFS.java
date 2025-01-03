import java.util.*;

public class Topological_Sort_BFS {

	public static void main(String[] args) {
		int[][] graph = {
				{0,1,1,0},
				{0,0,0,1},
				{0,0,0,1},
				{0,0,0,0}
		};
		
		Topo(graph);
	}
	
	public static void Topo(int[][] graph) {
		Queue<Integer> q = new LinkedList();
		int[] inDegree = new int[graph.length];
		ArrayList<Integer> ans = new ArrayList();
		
		for(int i = 0; i < graph.length; i++) {
			for(int j = 0; j < graph[i].length; j++) {
				if(graph[i][j] == 1) {
					inDegree[j] += 1;
				}
			}
		}
		
		for(int i = 0; i < inDegree.length; i++) {
			if(inDegree[i] == 0) {
				q.add(inDegree[i]);
			}
		}
		
		while(!q.isEmpty()) {
			int node = q.remove();
			ans.add(node);
			for(int col = 0; col < graph[node].length; col++) {
				if(graph[node][col] == 1) {
					inDegree[col] -= 1;
					
					if(inDegree[col] == 0) {
						q.add(col);
					}
				}
				
			}
		}
		
		for(int i : ans) {
			System.out.print(i + " ");
		}
		
	}

}
