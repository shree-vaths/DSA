
public class B10_Identical_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean isIdentical(B01_Node root1, B01_Node root2) {
		if(root1 == null && root2 == null) {
			return true;
		}
		
		if(root1 == null || root2 == null) {
			return false;
		}
		
		return root1.data == root2.data && isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);
	}

}
