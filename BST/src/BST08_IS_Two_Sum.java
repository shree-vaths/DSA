import java.util.Stack;

public class BST08_IS_Two_Sum {

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
		
		Stack<BSTNode> s1 = new Stack();
		Stack<BSTNode> s2 = new Stack();
		
		pushAllLeft(s1, ten);
		
		pushAllRight(s2, ten);
		
		
		int traget = 4;
		
		int start = 0;
		int end = 0;
		
		while(start < end) {
			
		}
	}
	
	public static void before(Stack<BSTNode> s) {
		BSTNode root = s.pop();
		System.out.println(root.val);
		if(root.left != null) {
			pushAllRight(s, root.left);
		}
	}
	
	public static void next(Stack<BSTNode> s) {
		BSTNode root = s.pop();
		System.out.println(root.val);
		if(root.right != null) {
			pushAllLeft(s, root.right);
		}
	}
	
	public static void hasNext(Stack<BSTNode> s) {
		System.out.println(!s.isEmpty());
	}
	
	public static void pushAllLeft(Stack<BSTNode> s, BSTNode root) {
		while(root.left != null && root.right != null) {
			s.push(root);
			root = root.left;
		}
	}
	
	public static void pushAllRight(Stack<BSTNode> s, BSTNode root) {
		while(root.right != null && root.right != null) {
			s.push(root);
			root = root.right;
		}
	}
	
	
	
	
	

}
