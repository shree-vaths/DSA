import java.util.PriorityQueue;

class PrimPair implements Comparable<PrimPair>{
	int weight;
	int node;
	int parent;
	
	PrimPair(int w, int n, int p) {
		weight = w;
		node = n;
		parent = p;
	}
	
	@Override
    public int compareTo(PrimPair other) {
        return Integer.compare(this.weight, other.weight);
    }
}

// https://www.youtube.com/watch?v=4ZlRH0eK-qQ
public class Prims_Algorithm {

	public static void main(String[] args) {
		int[][] graph = {
				{0,2,1,0,0},
				{2,0,1,0,0},
				{1,1,0,2,2},
				{0,0,2,0,1},
				{0,0,2,1,0}
		};
		
		int[] vis = new int[graph.length];
		MST(graph, vis);
	}
	
	public static void MST(int[][] graph, int[] vis) {
		PriorityQueue<PrimPair> pq = new PriorityQueue<PrimPair>();
		int sum = 0;

		pq.add(new PrimPair(0, 0, -1));
		
		while(!pq.isEmpty()) {
			PrimPair pair = pq.remove();
			int weight = pair.weight;
			int node = pair.node;
			int parent = pair.parent;
			
			if(vis[node] == 0) {
				System.out.println(parent + "->" + node);
				sum += weight;
				for(int i = 0; i < graph[node].length; i++) {
					if(graph[node][i] > 0 && vis[i] == 0) {
						pq.add(new PrimPair(graph[node][i], i, node));
					}
				}
				vis[node] = 1;
			}
		}
		
		System.out.println(sum);
	}

}
