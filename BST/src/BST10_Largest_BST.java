
class BST10Pair {
	int min;
	int max;
	int size;
	
	BST10Pair(int s, int i, int j) {
		size = s;
		min = i;
		max = j;
	}
}
public class BST10_Largest_BST {

	public static void main(String[] args) {
		BSTNode ten = new BSTNode(10);
		BSTNode five = new BSTNode(5);
		BSTNode one = new BSTNode(1);
		BSTNode eight = new BSTNode(8);
		BSTNode seven = new BSTNode(7);
		BSTNode fifteen = new BSTNode(15);
		
		ten.left = five;
		ten.right = fifteen;
		
		five.left = one;
		five.right = eight;
		
		fifteen.right = seven;
		
		System.out.println(largestBST(ten).size);
	}
	
	public static BST10Pair largestBST(BSTNode root) {
		if(root == null) {
			return new BST10Pair(0, Integer.MAX_VALUE, Integer.MIN_VALUE);
		}
		
		BST10Pair left = largestBST(root.left);
		BST10Pair right = largestBST(root.right);
		
		int leftSize = left.size;
		int rightSize = right.size;
		
		if(root.val > left.max && root.val < right.min) {
			
			return new BST10Pair(
					1 + Math.max(leftSize, rightSize),
					Integer.min(left.min,root.val),
					Integer.max(right.max, root.val)
			);
		}
		
		return new BST10Pair (
				Math.max(leftSize, rightSize),
				Integer.MAX_VALUE,
				Integer.MIN_VALUE
		);
				
	}

}
