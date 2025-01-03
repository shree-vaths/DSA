import java.util.ArrayList;

public class G02_GrpahMain {

	public static void main(String[] args) {
	ArrayList<Node> list = 	new ArrayList();
		
		Node nodeA = new Node(0, "A");
		list.add(nodeA);
		list.add(new Node(1, "B"));
		list.add(new Node(2, "C"));
		list.add(new Node(3, "D"));
		list.add(new Node(4, "E"));
		
		G01_Graph g = new G01_Graph(list);
		
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		
		g.addEdge(1, 4);
		
		g.addEdge(2, 3);
		
		g.addEdge(3, 4);
		
		//g.DFS(nodeA);
		
		System.out.println();
		
		ArrayList<Node> ls = new ArrayList<Node>();
		
		g.DFS2(nodeA, ls);
		
		for(Node node: ls) {
			System.out.print(node.name + " ");
		}
	}

}
