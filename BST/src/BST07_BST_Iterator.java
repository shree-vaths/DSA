import java.util.*;

public class BST07_BST_Iterator {

	public static void main(String[] args) {
		BSTNode ten = new BSTNode(10);
		BSTNode five = new BSTNode(5);
		BSTNode thirteen = new BSTNode(13);
		BSTNode three = new BSTNode(3);
		BSTNode eleven = new BSTNode(11);
		BSTNode six = new BSTNode(6);
		BSTNode fourteen = new BSTNode(14);
		BSTNode two = new BSTNode(2);
		BSTNode four = new BSTNode(4);
		BSTNode nine = new BSTNode(9);
		
		ten.left = five;
		ten.right = thirteen;
		
		five.left = three;
		five.right = six;
		
		thirteen.left = eleven;
		thirteen.right = fourteen;
		
		three.left = two;
		three.right = four;
		
		six.right = nine;
		
		Stack<BSTNode> s = new Stack();
		
		pushAll(s, ten);
		
		hasNext(s);
		
		next(s);
		
		next(s);
		
		hasNext(s);
	}
	
	public static void next(Stack<BSTNode> s) {
		BSTNode root = s.pop();
		System.out.println(root.val);
		if(root.right != null) {
			pushAll(s, root.right);
		}
	}
	
	public static void hasNext(Stack<BSTNode> s) {
		System.out.println(!s.isEmpty());
	}
	
	public static void pushAll(Stack<BSTNode> s, BSTNode root) {
		while(root.left != null && root.right != null) {
			s.push(root);
			root = root.left;
		}
	}

}
