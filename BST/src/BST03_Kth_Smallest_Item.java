
public class BST03_Kth_Smallest_Item {

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
		
		int[] count = new int[1];
		print(ten, count, 6);
	}
	
	public static void print(BSTNode root,int[] count, int k) {
		if(root == null) {
			return;
		}
		
		print(root.left,count, k);
		count[0] += 1;
		if(count[0] == k) {
			System.out.println(root.val);
			return;
		}
		print(root.right,count, k);
		
	}
	
	

}
