import java.util.*;

public class BST02_Ceil_Floor {

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
		
		int[] ans = new int[1];
		
		ans[0] = Integer.MIN_VALUE;
		
		ceil(ten, ans, 7);
		
		System.out.println(ans[0]);
	}
	
	/*
	 * Next downward value
	 */
	public static void Floor(BSTNode root, int[] ans, int target) {
		if(root == null) {
			return;
		}
		
		if(root.val == target) {
			ans[0] = root.val;
			return;
		}
		if(target > root.val) {
			ans[0] = root.val;
			Floor(root.right, ans, target);
		} else {
			Floor(root.left, ans, target); 
		}
		
	}
	
	/*
	 * Next upward value
	 */
	public static void ceil(BSTNode root, int[] ans, int target) {
		if(root == null) {
			return;
		}
		
		if(root.val == target) {
			ans[0] = root.val;
			return;
		}
		
		if(target > root.val) {
			ceil(root.right, ans, target);
		} else {
			ans[0] = root.val;
			ceil(root.left, ans, target); 
		}
	}

}
