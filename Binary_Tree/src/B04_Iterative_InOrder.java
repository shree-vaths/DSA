import java.util.*;

public class B04_Iterative_InOrder {

	public static void main(String[] args) {
		B01_Node one = new B01_Node(1);
		B01_Node two = new B01_Node(2);
		B01_Node three = new B01_Node(3);
		
		one.left = two;
		one.right = three;
		
		B01_Node four = new B01_Node(4);
		B01_Node five = new B01_Node(5);
		B01_Node six = new B01_Node(6);
		B01_Node seven = new B01_Node(7);
		
		two.left = four;
		two.right = five;
		
		three.left = six;
		three.right = seven;
		
		inOrder(one);
	}
	
	public static void inOrder(B01_Node root) {
		Stack<B01_Node> s = new Stack();
		if(root == null) return;
		B01_Node node = root;
		
		while(true) {
			if(node != null) {
				s.push(node);
				node = node.left;
			} else {
				if(s.isEmpty()) {
					break;
				}
				B01_Node poppedNode = s.pop();
				System.out.print(poppedNode.data + " ");
				node = poppedNode.right;
			}
		}
		
	}

}
