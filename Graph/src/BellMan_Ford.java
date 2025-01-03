
class BFPair {
	int i;
	int j;
	int weight;
	
	BFPair(int i, int j, int w) {
		this.i = i;
		this.j = j;
		weight = w;
	}
}

public class BellMan_Ford {

	/*
	 * Does not work if it has cycle
	 * Its is worst then Dijkstra
	 * https://www.youtube.com/watch?v=FtN3BYH2Zes
	 */
	public static void main(String[] args) {
		int[][] graph = {
				{0,1,0,0,0,0},
				{0,0,4,0,0,0},
				{0,0,0,-1,5,0},
				{0,0,0,0,-5,0},
				{0,0,0,0,0,0}
		};
		
		BFPair[] edges = {
				new BFPair(0,1,1),
				new BFPair(1,2,4),
				new BFPair(2,3,-1),
				new BFPair(2,4,5),
				new BFPair(3,5,-2),
				new BFPair(4,5,-5)
		};
		
		int[] dis = new int[graph.length];
		
		for(int i = 0; i < dis.length; i++) {
			dis[i] = Integer.MAX_VALUE;
		}
		
		BellMan(graph, edges, 0, dis);
		
		for(int i = 0; i < dis.length; i++) {
			System.out.print(dis[i] + " ");
		}
	}
	
	public static void BellMan(int[][] graph, BFPair[] edges, int node, int[] dis) {
		dis[node] = 0;
		
		for(int i = 0; i < edges.length; i++) {
			BFPair edge = edges[i];
			int source = edge.i;
			int dest = edge.j;
			int weight = edge.weight;
			
			int newWeight = weight + dis[source];
			if(newWeight < dis[dest]) {
				dis[dest] = newWeight;
			}
		}
	}

}
