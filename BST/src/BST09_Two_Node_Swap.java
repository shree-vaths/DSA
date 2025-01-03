
public class BST09_Two_Node_Swap {

	static boolean isFirstViolation = false;
	static boolean isSecondViolation = false;
	static BSTNode prevNode = null;
	static BSTNode node1 = null;
	static BSTNode node2 = null;
	static BSTNode node3 = null;
	
	public static void main(String[] args) {
		BSTNode ten = new BSTNode(10);
		BSTNode five = new BSTNode(5);
		BSTNode thirteen = new BSTNode(13);
		BSTNode three = new BSTNode(11);
		BSTNode eleven = new BSTNode(3);
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
		
		inOrder(ten);
		
		System.out.println(node1.val);
		System.out.println(node3.val);
	}
	
	public static void inOrder(BSTNode root) {
		if(root == null) {
			return;
		}
		inOrder(root.left);
		
		BSTNode curNode = root;

		if(prevNode != null && curNode.val < prevNode.val) {
				if(!isFirstViolation) {
					isFirstViolation = true;
					node1 = prevNode;
					node2 = curNode;
				} else {
					isSecondViolation = true;
					node3 = curNode;
					return;
				}
		}
		prevNode = root;
		inOrder(root.right);
	}

}
