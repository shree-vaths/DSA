
public class B07_Check_Balanced_BT {

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
		
		
		System.out.println(isBalanced2(one));
	}

	public static boolean isBalanced1(B01_Node root) {
		if(root == null) {
			return true;
		}
		
		int leftHeight = B06_Max_Height_Tree.maxHeight(root.left);
		int rightHeight = B06_Max_Height_Tree.maxHeight(root.right);

		
		return (Math.abs(leftHeight-rightHeight) > 1) && isBalanced1(root.left) && isBalanced1(root.right);
		
	}
	
	/*
	 * Return -1 in case its not balanced or regular height of the tree
	 */
	public static int isBalanced2(B01_Node root) {
		if(root == null) {
			return 0;
		}
		
		int leftHeight = isBalanced2(root.left);
		int rightHeight = isBalanced2(root.right);

		if(leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight-rightHeight) > 1) {
			return -1;
		}
		
		return 1 + Math.max(leftHeight, rightHeight);
		
	}

}
