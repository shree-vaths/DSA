import java.util.HashMap;
import java.util.List;

public class B18_Root_Node_Path {

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
		
		path(one, 6);
	}
	
	public static boolean path(B01_Node root, int target) {
		if(root == null) {
			return false;
		}
		
		if(root.data == target) {
			System.out.print(target + " -> ");
			return true;
		}
		boolean left = path(root.left, target);
		boolean right = path(root.right, target);
		
		if(left || right) {
			System.out.print(root.data + " -> ");
			return true;
		}
		
		return false;
	}

}
