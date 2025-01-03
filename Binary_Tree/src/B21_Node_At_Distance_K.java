import java.util.*;

public class B21_Node_At_Distance_K {

	public static void main(String[] args) {
		B01_Node one = new B01_Node(1);
		B01_Node two = new B01_Node(2);
		B01_Node three = new B01_Node(3);
		B01_Node four = new B01_Node(4);
		B01_Node five = new B01_Node(5);
		B01_Node six = new B01_Node(6);
		B01_Node seven = new B01_Node(7);
		
		one.right = two;
		one.left = three;
		
		three.left = five;
		three.right = four;
		
		five.left = seven;
		five.right = six;
		
		Map<B01_Node, B01_Node> parent = new HashMap();
		Queue<B01_Node> q = new LinkedList();
		q.add(one);
		parent.put(one, null);
		while(!q.isEmpty()) {
			B01_Node node = q.remove();
			if(node.left != null) {
				parent.put(node.left, node);
				q.add(node.left);
			}
			if(node.right != null) {
				parent.put(node.right, node);
				q.add(node.right);
			}
		}
		findNodeK(five, parent, 2);

	}
	
	
	public static void findNodeK(B01_Node root, Map<B01_Node, B01_Node> parent, int k) {
		int count = 0;
		Map<B01_Node, Boolean> visited = new HashMap();
		visited.put(root, true);
		Queue<B01_Node> q = new LinkedList();
		q.add(root);
		while(!q.isEmpty()) {
			int s = q.size();
			count++;
			for(int i = 0; i < s; i++) {
				B01_Node node = q.remove();
				
				if(node.left != null && !visited.containsKey(node.left)) {
					q.add(node.left);
					visited.put(node.left, true);
					
				}
				if(node.right != null && !visited.containsKey(node.right)) {
					q.add(node.right);
					visited.put(node.right, true);
					
				}
				
				if(parent.get(node) != null && !visited.containsKey(parent.get(node))) {
					q.add(parent.get(node));
					visited.put(parent.get(node), true);
				}
			}
			if(count == k) {
				break;
			}
		}
		
		while(!q.isEmpty()) {
			System.out.print(q.remove().data + " ");
		}
	}

}
