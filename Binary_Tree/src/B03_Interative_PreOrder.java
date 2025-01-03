import java.util.*;

public class B03_Interative_PreOrder {

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
		
		preOrder(one);
	}
	
	public static void preOrder(B01_Node root) {
		Stack<B01_Node> s = new Stack();
		
		s.push(root);
		
		while(!s.isEmpty()) {
			B01_Node node = s.pop();
			
			if(node.right != null) {
				s.push(node.right);
			}
			if(node.left != null) {
				s.push(node.left);
			}
			
			System.out.print(node.data + " ");
		}
	}

}
