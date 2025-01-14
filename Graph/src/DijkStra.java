import java.util.*;

// https://www.youtube.com/watch?v=bZkzH5x0SKU&t=97s
// This will not with atleast one negative edge
// This will not also work with negative cycle

class DijkPair implements Comparable<DijkPair>{
	int index;
	int distance;
	
	DijkPair(int d, int i) {
		index = i;
		distance = d;
	}
	
	@Override
    public int compareTo(DijkPair other) {
        return Integer.compare(this.distance, other.distance);
    }
}

public class DijkStra {

	public static void main(String[] args) {
		int[][] graph = {
				{0,4,4,0,0,0},
				{4,0,2,0,0,0},
				{4,2,0,3,1,6},
				{0,0,3,0,0,2},
				{0,0,1,0,0,3},
				{0,0,6,2,3,0}
		};
		
		int[] dis = new int[graph.length];
		
		for(int i = 0; i < dis.length; i++) {
			dis[i] = Integer.MAX_VALUE;
		}
		
		DijkStra(graph, dis, 0);
	}
	
	public static void DijkStra(int[][] graph, int[] dis, int v) {
		PriorityQueue<DijkPair> pq = new PriorityQueue<DijkPair>();
		
		pq.add(new DijkPair(0, 0));
		dis[0] = 0;
		
		while(!pq.isEmpty()) {
			DijkPair node = pq.remove();
			int index = node.index;
			int distance = node.distance;
			
			for(int i = 0; i < graph[index].length; i++) {
				if(graph[index][i] > 0) {
					int newNodeDistance = graph[index][i];
					int MinNewNodeDistance = distance + newNodeDistance;
					if(MinNewNodeDistance < dis[i]) {
						pq.add(new DijkPair(MinNewNodeDistance, i));
						dis[i] = MinNewNodeDistance;
					}
				}
			}
			
		}
		
		for(int val: dis)  {
			System.out.print(val + " ");
		}
		
	}
	

}
