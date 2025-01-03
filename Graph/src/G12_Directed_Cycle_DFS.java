import java.util.*;

public class G12_Directed_Cycle_DFS {

	/*
	 * Cant be solved by DFS. This needs recursion
	 */
	public static void main(String[] args) {
		int[][] graph = {
				{0,1,0,0,0,0,0,0,0,0},
				{0,0,1,0,0,0,0,0,0,0},
				{0,0,0,1,0,0,1,0,0,0},
				{0,0,0,0,1,0,0,0,0,0},
				{0,0,0,0,0,1,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,1,0,0,0,0,0},
				{0,1,0,0,0,0,0,0,1,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,1,0,0}
		};
		
		int[] vis = new int[graph.length];
		int[] path = new int[graph.length];
		Stack<Integer> s = new Stack();

		boolean isCycle = false;
		for(int i = 0; i < graph.length; i++) {
			if(vis[i] != 1) {
				isCycle = isCycle || cycle(graph, i, vis, path, s);
			}
		}
		
		System.out.println(isCycle);
	}
	
	public static boolean cycle(int[][] graph, int node, int[] vis, int[] path, Stack<Integer> s) {
		s.push(node);
		vis[node] = 1;
		path[node] = 1;
			
			for(int i = 0; i < graph[node].length; i++) {
				if(graph[node][i] == 1) {
					if(vis[i] != 1) {
						s.push(i);
						boolean isCycle = cycle(graph, i, vis, path, s);
						if(isCycle) {
							return true;
						}
					} else if(path[i] == 1) {
						return true;
					}
				}
			}
			path[node] = 0;
		return false;
	}
}
