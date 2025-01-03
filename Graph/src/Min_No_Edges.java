
// https://leetcode.com/problems/number-of-operations-to-make-network-connected/description/
public class Min_No_Edges {

	public static void main(String[] args) {
		int[][] graph = {
			    {0, 1, 1, 1, 0, 0, 0, 0, 0},
			    {1, 0, 1, 0, 0, 0, 0, 0, 0},
			    {1, 1, 0, 1, 0, 0, 0, 0, 0},
			    {1, 0, 1, 0, 0, 0, 0, 0, 0},
			    {0, 0, 0, 0, 0, 1, 0, 0, 0},
			    {0, 0, 0, 0, 1, 0, 1, 0, 0},
			    {0, 0, 0, 0, 0, 1, 0, 0, 0},
			    {0, 0, 0, 0, 0, 0, 0, 0, 1},
			    {0, 0, 0, 0, 0, 0, 0, 1, 0}
			};

		
		
		Disjoint_Set DS = new Disjoint_Set(graph.length-1);
		int[][] vis = new int[graph.length][graph.length];
		
		int extraEdges = 0;
		
		for(int i = 0; i < graph.length; i++) {
			for(int j = 0; j < graph[i].length; j++) {
				if(graph[i][j] == 1 && vis[i][j] == 0) {
					int pi = DS.findParent(i);
					int pj = DS.findParent(j);
					if(pi != pj) {
						DS.union(i, j);
					} else {
						extraEdges++;
					}
					vis[i][j] = 1;
					vis[j][i] = 1;
				}
			}
		}
		
		int noOfComponents = 0;
		
		for(int i = 0; i < DS.parent.length; i++) {
			if(DS.parent[i] == i) {
				noOfComponents++;
			}
		}
		
		System.out.println(noOfComponents);
		System.out.println(extraEdges);
		
		if(extraEdges >= noOfComponents-1) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
