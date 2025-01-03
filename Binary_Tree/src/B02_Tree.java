import java.util.*;

public class B02_Tree {

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
		
		levelOrder(one);
	}
	
	public static void preOrder(B01_Node root) {
		if(root == null) {
			return;
		}
		
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public static void inOrder(B01_Node root) {
		if(root == null) {
			return;
		}
		
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
	
	public static void postOrder(B01_Node root) {
		if(root == null) {
			return;
		}
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}
	
	public static void levelOrder(B01_Node root) {
		if(root == null) {
			return;
		}
		
		Queue<B01_Node> q = new LinkedList();
		q.add(root);
		while(!q.isEmpty()) {
			B01_Node node = q.remove();
			if(node.left != null) {
				q.add(node.left);
			}
			if(node.right != null) {
				q.add(node.right);
			}
			System.out.print(node.data + " ");
		}
		
	}

}
