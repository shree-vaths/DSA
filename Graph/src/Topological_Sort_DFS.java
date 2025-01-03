import java.util.*;

public class Topological_Sort_DFS {

	public static void main(String[] args) {
		int[][] graph = {
				{0,0,1,0,0},
				{0,0,1,0,0},
				{0,0,0,1,1},
				{0,0,0,0,0},
				{0,0,0,0,0}
		};
		topological(graph);
	}
	
	public static void topological(int[][] graph) {
		int[] visited = new int[graph.length];
		Stack<Integer> s = new Stack();
		for(int i = 0; i < graph.length; i++) {
			if(visited[i] != 1) {
				sort(graph, i, visited, s);
			}
		}
		
		while(!s.isEmpty()) {
			System.out.print(s.pop() + " ");
		}
	}
	
	public static void sort(int[][] graph,int node, int[] visited, Stack<Integer> s) {
		for(int i = 0; i < graph[node].length; i++) {
			if(graph[node][i] == 1 && visited[i] != 1) {
				sort(graph, i, visited, s);
			}
		}
		s.push(node);
		visited[node] = 1;
	}

}
