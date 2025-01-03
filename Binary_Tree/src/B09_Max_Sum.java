
public class B09_Max_Sum {

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
		sum(one, res);
		System.out.println(res[0]);
	}
	
	public static int sum(B01_Node root,int[] res) {
		if(root == null) {
			return 0;
		}
		
		int left = sum(root.left, res);
		int right = sum(root.right, res);
		
		
		res[0] = Math.max(root.data + left + right, res[0]);
		
		return root.data + Math.max(left, right);
	}

}
