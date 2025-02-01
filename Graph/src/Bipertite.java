import java.util.Arrays;

public class Bipertite {

	public static void main(String[] args) {
		int[][] graph  = {
			    {0, 1, 1, 0, 0},
			    {1, 0, 1, 0, 0},
			    {1, 1, 0, 1, 1},
			    {0, 0, 1, 0, 0},
			    {0, 0, 1, 0, 0}
			};

		int[] vis = new int[graph.length];
		Arrays.fill(vis, -1);
		System.out.println(isBipertite(graph, vis, 0, 0));

	}
	
	
	public static boolean isBipertite(int[][] graph, int[] vis, int node, int color) {
		vis[node] = color;
		
		for(int i = 0; i < graph[node].length; i++) {
			if(graph[node][i] == 1) {
				if(vis[i] == -1) {
					boolean val = isBipertite(graph, vis, i, color == 0 ? 1 : 0);
					if(val == false) {
						return false;
					}
				} else if(vis[i] == color){
					return false;
				}
			}
		}
		return true;
	}

}
