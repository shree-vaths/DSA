
public class BST04_Check_If_BST {

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
		
		System.out.println(isBST(ten, Integer.MIN_VALUE, Integer.MAX_VALUE));
	}
	
	public static boolean isBST(BSTNode root, int min, int max) {
		if(root == null) {
			return true;
		}
		
		return (root.val < max && root.val > min) && isBST(root.left, min, root.val) && isBST(root.right, root.val, max);
	}

}
