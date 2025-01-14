import java.util.*;

public class Shortest_Path_DAG {

	public static void main(String[] args) {
		int[][] graph = {{0, 2, 0, 0, 0, 0, 0},
				 {0, 0, 0, 1, 0, 0, 0},
				 {0, 0, 0, 3, 0, 0, 0},
				 {0, 0, 0, 0, 0, 0, 0},
				 {3, 0, 1, 0, 0, 0, 0},
				 {0, 0, 0, 0, 0, 0, 0},
				 {0, 0, 0, 0, 2, 3, 0}};
		
		int[] vis = new int[graph.length];
		int[] dis = new int[graph.length];
		Stack<Integer> s = new Stack();
		for(int i = 0; i < dis.length; i++) {
			dis[i] = Integer.MAX_VALUE;
		}
		for(int i = 0; i < graph.length; i++) {
			if(vis[i] != 1) {
				topoSort(graph, i, vis, s);
			}
		}
		distance(graph, 6, dis, s);
		for(int i = 0; i < dis.length; i++) {
			System.out.print(dis[i] + " ");
		}
	}
	
	
	public static void topoSort(int[][] graph, int i, int[] vis, Stack<Integer> s) {
		vis[i] = 1;
		for(int ind = 0; ind < graph[i].length; ind++) {
			if(graph[i][ind] > 0 && vis[ind] != 1) {
				topoSort(graph, ind, vis, s);
			}
		}
		s.push(i);
	}
	
	public static void distance(int[][] graph,int i, int[] dis, Stack<Integer> s) {
		dis[i] = 0;
		while(!s.isEmpty()) {
			int node = s.pop();
			int weight = dis[node];
			for(int ind = 0; ind < graph[node].length; ind++) {
				if(graph[node][ind] > 0) {
					int newWeight = weight + graph[node][ind];
					if(newWeight < dis[ind]) {
						dis[ind] = newWeight;
					}
				}
			}
			
			
		}
	}
	

}
