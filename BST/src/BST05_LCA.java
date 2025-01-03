
public class BST05_LCA {

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
		
		System.out.println(LCA(ten, 6, 9).val);
	}
	
	public static BSTNode LCA(BSTNode root, int target1,int target2) {
		if(root == null) {
			return null;
		}
		
		if(target1 < root.val && target2 < root.val) {
			return LCA(root.left, target1, target2);
		}
		if(target1 > root.val && target2 > root.val) {
			return LCA(root.right, target1, target2);
		}
		
		return root;
	}

}
