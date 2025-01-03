
/*
* This can tell is graph is disconnected in constant time
* This is used in dynamic graphs which change periodically
* This provides function to find parent and union[rank or size]
* 
* This avoids creation of cycle during graph formation
* 
* If we are calculating things after each addition of the node, go for DS
*/

public class Disjoint_Set {
	int[] rank;
	int[] parent;
	
	Disjoint_Set(int size) {
		rank = new int[size+1];
		parent = new int[size+1];
		
		for(int i = 0; i <= size; i++) {
			parent[i] = i;
		}
	}
	
	public int findParent(int val) {
		if(parent[val] == val) {
			return val;
		}
		
		int nextParent = parent[val];
		parent[val] = findParent(nextParent);
		return parent[val];
	}
	
	public void union(int i, int j) {
		int ultimate_i = findParent(i);
		int ultimate_j = findParent(j);
		
		if(ultimate_i == ultimate_j) {
			return;
		}
		
		if(rank[ultimate_i] > rank[ultimate_j]) {
			parent[ultimate_j] = ultimate_i;
		} else if (rank[ultimate_j] > rank[ultimate_i]) {
			parent[ultimate_i] = ultimate_j;
		} else {
			parent[ultimate_j] = ultimate_i;
			rank[ultimate_i] += 1;
		}
	}
}
