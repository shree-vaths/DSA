
public class B19_LCA {

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
		
		System.out.println(LCA(one, 7, 4).data);
	}
	
	public static B01_Node LCA(B01_Node root, int target1, int target2) {
		if(root == null) {
			return null;
		}
		
		if(root.data == target1 || root.data == target2) {
			return root;
		}
		B01_Node left = LCA(root.left, target1, target2);
		B01_Node right = LCA(root.right, target1, target2);
		
		if(left != null && right != null) {
			return root;
		}
		
		if(left != null) {
			return left;
		} else {
			return right;
		}
	}

}
