import java.util.*;

public class B23_PreOrder_InOrder {

	public static void main(String[] args) {
		int[] pre = {10, 20, 40, 50, 30, 60};
		
		int[] in = {40, 20, 50, 10, 60, 30};
		
		Map<Integer, Integer> arr = new HashMap();
		
		for(int i = 0; i < in.length; i++) {
			arr.put(in[i], i);
		}
		
		B01_Node root = construct(pre, in, arr, 0, in.length-1, 0, pre.length-1);
		
		levelOrder(root);
		
	}
	
	public static B01_Node construct(int[] pre, int[] in,Map<Integer, Integer> arr, int is,int ie,int ps, int pe) {
		if(is > ie || ps > pe) {
			return null;
		}
		
		B01_Node node = new B01_Node(pre[ps]);
		int iRoot = arr.get(pre[ps]);
		
		int leftChildren = iRoot - is;
		
		node.left = construct(pre, in, arr, is, iRoot - 1, ps+1, ps + leftChildren);
		
		node.right = construct(pre, in, arr, iRoot+1, ie, ps + leftChildren + 1, pe);
		
		return node;
	}
	
	public static void levelOrder(B01_Node root) {
		if(root == null) {
			return;
		}
		
		Queue<B01_Node> q = new LinkedList();
		q.add(root);
		while(!q.isEmpty()) {
			B01_Node node = q.remove();
			if(node.left != null) {
				q.add(node.left);
			}
			if(node.right != null) {
				q.add(node.right);
			}
			System.out.print(node.data + " ");
		}
		
	}
}
