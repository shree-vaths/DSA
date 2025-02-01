import java.util.*;

class G09_Pair{
	int index;
	int parent;
	
	G09_Pair(int m, int n) {
		index = m;
		parent = n;
	}
}
/*
 * Check if any of neibhor is visited and its not a parent of current node.
 */
public class G11_Undirected_Cycle_DFS {

	public static void main(String[] args) {
//		int[][] graph = {
//				{0,1,1,0},
//				{1,0,1,0},
//				{1,1,0,1},
//				{0,0,1,0}
//		};
		
		int[][] graph = {
				{0,0,1,0},
				{0,0,1,0},
				{1,1,0,1},
				{0,0,1,0}
		};
		
		System.out.println(cycle(graph));
	}
	
	public static boolean cycle(int[][] graph) {
		int[] visited = new int[graph.length];
		Stack<G09_Pair> s = new Stack();
		s.push(new G09_Pair(0, -1));
		visited[0] = 1;
		while(!s.isEmpty()) {
			G09_Pair node = s.pop();
			int index = node.index;
			int parent = node.parent;
			for(int i = 0; i < graph[index].length; i++) {
				if(graph[index][i] == 1) {
					if(visited[i] != 1) {
						s.push(new G09_Pair(i, index));
						visited[i] = 1;
					} else {
						if(i != parent) {
							return true;
						}
					}
				} 
			}
		}
		return false;
	}
	
	

}
