
public class B08_Diameter_BT {

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
		
		int[] res = {-1};
		System.out.println(diameter(one, res));
		System.out.println(res[0]);
				
	}
	
	public static int diameter(B01_Node root,int[] res) {
		if(root == null) {
			return 0;
		}
		
		int left = diameter(root.left, res);
		int right = diameter(root.right, res);
		
		int diameter = left + right;
		
		res[0] = Math.max(diameter, res[0]);
		
		return 1 + Math.max(left, right);
	}
	

}
