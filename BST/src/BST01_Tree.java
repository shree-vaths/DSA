import java.lang.module.FindException;

class BSTNode {
	int val;
	BSTNode left;
	BSTNode right;
	
	BSTNode(int value) {
		val = value;
		left = null;
		right = null;
	}
}

class BST {
	BSTNode root;
	
	BST() {
		root = null;
	}
	
	public BSTNode insert(BSTNode root, int val) {
		if(root == null) {
			BSTNode node = new BSTNode(val);
			return node;
		}
		
		if(val > root.val) {
			root.right = insert(root.right, val);
		} else {
			root.left = insert(root.left, val);
		}
		
		return root;
	}
	
	public void insert(int val) {
		root = insert(root, val);
	}
	
	public void inOrder(BSTNode root) {
		if(root == null) {
			return;
		}
		
		inOrder(root.left);
		System.out.print(root.val + " ");
		inOrder(root.right);
	}
	
	public boolean search(BSTNode root, int val) {
		if(root == null) {
			return false;
		}
		if(root.val == val) {
			return true;
		}
		
		if(val > root.val) {
			return search(root.right, val);
		} else {
			return search(root.left, val);
		}
	}
	
	public BSTNode findNextMax(BSTNode root) {
		if(root.left == null) {
			return root;
		}
		return findNextMax(root.left);
	}
	
	public BSTNode delete(BSTNode root, int val) {
		if(root == null) {
			return null;
		}
		
		if(root.val == val) {
			if(root.left != null && root.right != null) {
				BSTNode nextNode = findNextMax(root.right);
				root.val = nextNode.val;
				root.right = delete(root.right, nextNode.val);
			}
			
			if(root.left == null && root.right == null) {
				root = null;
			} else if(root.left != null) {
				root = root.left;
			} else if(root.right != null) {
				root = root.right;
			}
			return root;
		}
		
		if(val > root.val) {
			root.right = delete(root.right, val);
		} else {
			root.left = delete(root.left, val);
		}
		return root;
	}
}
public class BST01_Tree {

	public static void main(String[] args) {
		BST tree = new BST();
		
		tree.insert(50);
		tree.insert(40);

		tree.insert(60);

		tree.insert(55);

		tree.delete(tree.root, 50);
		
		tree.inOrder(tree.root);
	}

}
