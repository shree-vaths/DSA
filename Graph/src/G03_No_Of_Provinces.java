import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// https://www.naukri.com/code360/problems/find-the-number-of-states_1377943

/*
 * G-48 = With Disjoint set, find no of ultimate parent
 */
class GraphNode {
	int index;
	String name;
	
	GraphNode(int i, String str) {
		index = i;
		name = str;
	}
}

class graph {
	ArrayList<Node> list;
	int[][] matrix;
	
	graph(ArrayList<Node> list) {
		this.list = list;
		this.matrix = new int[list.size()][list.size()];
	}
	
	public void addEdge(int i, int j) {
		matrix[i][j] = 1;
		matrix[j][i] = 1;
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
	
	public void DFS(Node node, int[] visited) {
		Stack<Node> s = new Stack();
		s.push(node);
		visited[node.index] = 1;

		while(!s.isEmpty()) {
			Node curNode = s.pop();
			System.out.print(curNode.name + " ");
			ArrayList<Node>  neighbors = getNeighbors(curNode);
			for(Node neighbor : neighbors) {
				if( visited[neighbor.index] != 1) {
					s.push(neighbor);
					visited[neighbor.index] = 1;
				}
			}
		}
		
	}
}

public class G03_No_Of_Provinces {

	public static void main(String[] args) {
		ArrayList<Node> list = 	new ArrayList();
		
		Node nodeA = new Node(0, "A");
		list.add(nodeA);
		list.add(new Node(1, "B"));
		list.add(new Node(2, "C"));
		list.add(new Node(3, "D"));
		list.add(new Node(4, "E"));
		list.add(new Node(5, "F"));
		list.add(new Node(6, "G"));

		
		graph g = new graph(list);
		
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(1, 4);
		g.addEdge(2, 3);
		g.addEdge(3, 4);
		g.addEdge(5, 6);
		
		System.out.println(noOfProvinces(g, list));
	}
	
	public static int noOfProvinces(graph g, ArrayList<Node> list) {
		int count = 0;
		int[] visited = new int[list.size()];
		Arrays.fill(visited, 0);
		for(int i = 0; i < list.size(); i++) {
			Node curNode = list.get(i);
			if(visited[curNode.index] != 1) {
				count++;
				g.DFS(curNode, visited);
			}
		}
		return count;
	}
	
	
	
	

}
