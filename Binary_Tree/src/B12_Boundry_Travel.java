
public class B12_Boundry_Travel {

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
		
		boundry(one);
	}
	
	public static void boundry(B01_Node root) {
		leftSide(root);
		leafNodes(root);
	}
	
	public static void leftSide(B01_Node root) {
		if(root == null || (root.left == null && root.right == null)) {
			return;
		}
		
		System.out.print(root.data + " ");
		
		if(root.left != null) {
			leftSide(root.left);
		} else {
			leftSide(root.right);
		}
	}
	
	public static void leafNodes(B01_Node root) {
		if(root == null) {
			return;
		}
		
		if((root.left == null && root.right == null)) {
			System.out.print(root.data + " ");
			return;
		}
		
		leafNodes(root.left);
		leafNodes(root.right);
	}
	
	public static void rightSide(B01_Node root) {
		if(root == null || (root.left == null && root.right == null)) {
			return;
		}
		
		System.out.print(root.data + " ");
		
		if(root.right != null) {
			leftSide(root.right);
		} else {
			leftSide(root.left);
		}
	}

}
