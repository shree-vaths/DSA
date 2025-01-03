
public class B06_Max_Height_Tree {

	public static void main(String[] args) {
		B01_Node one = new B01_Node(1);
		B01_Node two = new B01_Node(2);
		B01_Node three = new B01_Node(3);
		B01_Node four = new B01_Node(4);
		B01_Node five = new B01_Node(5);
		B01_Node six = new B01_Node(6);
		B01_Node seven = new B01_Node(7);
		
		one.left = two;
		one.right = three;
		
		three.left = four;
		three.right = six;
		
		four.left = five;
		
		System.out.println(maxHeight(one));
	}
	
	public static int maxHeight(B01_Node root) {
		if(root == null) {
			return 0;
		}
		
		return 1 + Math.max(maxHeight(root.left), maxHeight(root.right));
		
		
	}

}
