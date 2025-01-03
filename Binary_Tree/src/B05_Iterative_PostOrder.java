import java.util.*;

public class B05_Iterative_PostOrder {

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
		
		postOrder(one);
	}
	
	public static void postOrder(B01_Node root) {
		Stack<B01_Node> s1 = new Stack();
		Stack<B01_Node> s2 = new Stack();
		
		if(root == null) {
			return;
		}
		
		s1.push(root);
		
		while(!s1.isEmpty()) {
			B01_Node node = s1.pop();
			
			if(node.left != null) {
				s1.push(node.left);
			}
			
			if(node.right != null) {
				s1.push(node.right);
			}
			
			s2.push(node);
			
		}
		
		while(!s2.isEmpty()) {
			System.out.print(s2.pop().data + " ");
		}
	}

}
