import java.util.*;

class Node {
	int index;
	String name;
	boolean visited;
	
	Node(int i, String str) {
		index = i;
		name = str;
		visited = false;
	}
}

public class G01_Graph {
	ArrayList<Node> list;
	int[][] matrix;
	
	G01_Graph(ArrayList<Node> list) {
		this.list = list;
		this.matrix = new int[list.size()][list.size()];
	}
	
	public void addEdge(int i, int j) {
		matrix[i][j] = 1;
		matrix[j][i] = 1;
	}
	
	public void print() {
		for(int[] row: matrix) {
			for(int val: row) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
	}
	
	public ArrayList<Node> getNeighbors(Node node) {
		int nodeIndex = node.index;
		ArrayList<Node> neighbors = new ArrayList();
		
		for(int i = 0; i < matrix.length; i++) {
			if(matrix[nodeIndex][i] == 1) {
				neighbors.add(list.get(i));
			}
		}
		return neighbors;
	}
	
	public void BFS(Node node) {
		Queue<Node> q = new LinkedList();
		q.add(node);
		node.visited = true;
		
		while(!q.isEmpty()) {
			Node curNode = q.remove();
			System.out.print(curNode.name + " ");
			ArrayList<Node>  neighbors = getNeighbors(curNode);
			for(Node neighbor : neighbors) {
				if(!neighbor.visited) {
					q.add(neighbor);
					neighbor.visited = true;
				}
			}
		}
		
	}
	
	public void DFS(Node node) {
		Stack<Node> s = new Stack();
		s.push(node);
		node.visited = true;
		
		while(!s.isEmpty()) {
			Node curNode = s.pop();
			System.out.print(curNode.name + " ");
			ArrayList<Node>  neighbors = getNeighbors(curNode);
			for(Node neighbor : neighbors) {
				if(!neighbor.visited) {
					s.push(neighbor);
					neighbor.visited = true;
				}
			}
		}
	}
	
	public void DFS2(Node node, ArrayList<Node> ls) {
		ls.add(node);
		node.visited = true;
		ArrayList<Node>  neighbors = getNeighbors(node);
		for(int i = 0; i < neighbors.size(); i++) {
			if(!neighbors.get(i).visited) {
				DFS2(neighbors.get(i), ls);
			}
		}

		
	}
}
