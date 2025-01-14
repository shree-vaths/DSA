// https://www.youtube.com/watch?v=FtN3BYH2Zes&t=421s
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
		BFPair[] edges = {
				new BFPair(0,1,4),
				new BFPair(2,1,-10),
				new BFPair(0,3,5),
				new BFPair(3,2,3)
		};
		
		int[] dis = new int[4];
		
		for(int i = 0; i < dis.length; i++) {
			dis[i] = Integer.MAX_VALUE;
		}
		
		BellMan(edges, 0, dis);
		
		for(int i = 0; i < dis.length; i++) {
			System.out.print(dis[i] + " ");
		}
	}
	
	public static void BellMan(BFPair[] edges, int node, int[] dis) {
		dis[node] = 0;
		
		for(int ver = 0; ver < 4; ver++) {
			for(int i = 0; i < edges.length; i++) {
				BFPair edge = edges[i];
				int source = edge.i;
				int dest = edge.j;
				int weight = edge.weight;
				
				int newWeight = weight + dis[source];
				if(dis[source] != Integer.MAX_VALUE && newWeight < dis[dest]) {
					dis[dest] = newWeight;
				}
			}
		}
	}

}
