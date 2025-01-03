import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class G13_Directed_Cycle_BFS {

	public static void main(String[] args) {
		int[][] graph = {
				{0,1,0,0},
				{0,0,1,0},
				{0,0,0,1},
				{0,1,0,0}
		};
		
		Topo(graph);
	}
	
	public static void Topo(int[][] graph) {
		Queue<Integer> q = new LinkedList();
		int[] inOrder = new int[graph.length];
		ArrayList<Integer> ans = new ArrayList();
		
		for(int i = 0; i < graph.length; i++) {
			for(int j = 0; j < graph[i].length; j++) {
				if(graph[i][j] == 1) {
					inOrder[j] += 1;
				}
			}
		}
		
		for(int i = 0; i < inOrder.length; i++) {
			if(inOrder[i] == 0) {
				q.add(inOrder[i]);
			}
		}
		
		while(!q.isEmpty()) {
			int node = q.remove();
			ans.add(node);
			for(int col = 0; col < graph[node].length; col++) {
				if(graph[node][col] == 1) {
					inOrder[col] -= 1;
					
					if(inOrder[col] == 0) {
						q.add(col);
					}
				}
				
			}
		}
		
		System.out.println(ans.size() != graph.length);
		
	}

}
