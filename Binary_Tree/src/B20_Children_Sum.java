
public class B20_Children_Sum {

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
		
		sum(one);
		
		preOrder(one);
	}
	
	public static void sum(B01_Node root) {
		if(root == null) {
			return;
		}
		
		int left = root.left != null ? root.left.data : 0;
		int right = root.right != null ? root.right.data : 0;
		
		if((left + right != 0) && (left + right < root.data)) {
			if(root.left != null) {
				root.left.data = root.data;
			}
			
			if(root.right != null) {
				root.right.data = root.data;
			}
		}
		
		sum(root.left);
		sum(root.right);
		
		int total = 0;
		if(root.left != null) {
			total += root.left.data;
		}
		if(root.right != null) {
			total += root.right.data;
		}
		
		if(total != 0) {
			root.data = total;
		}
		
	}
	
	public static void preOrder(B01_Node root) {
		if(root == null) {
			return;
		}
		
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

}
