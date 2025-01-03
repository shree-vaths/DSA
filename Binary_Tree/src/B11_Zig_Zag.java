import java.util.*;

public class B11_Zig_Zag {

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
		
		int[] res = {-1};
		zigZag(one);
	}
	
	public static void zigZag(B01_Node root) {
		if(root == null) {
			return;
		}
		
		Queue<B01_Node> q = new LinkedList();
		q.add(root);
		boolean leftToRight = true;
		
		while(!q.isEmpty()) {
			int size = q.size();
			List<Integer> res = new ArrayList();
			
			for(int i = 0; i < size; i++) {
				B01_Node node = q.remove();
				if(node.left != null) {
					q.add(node.left);
				}
				
				if(node.right != null) {
					q.add(node.right);
				}
				
				if(leftToRight) {
					System.out.print(node.data + " ");
				} else {
					res.addFirst(node.data);
				}
			}
			if(!leftToRight) {
				for(int i = 0; i < res.size(); i++) {
					System.out.print(res.get(i) + " ");
				}
				
				res.clear();
			}
			leftToRight = !leftToRight;
						
			
		}
		
	}

}
