import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class B24_Post_InOrder {

	public static void main(String[] args) {
		int[] post = {40, 50, 20, 60, 70, 30, 10};
		
		int[] in = {40, 20, 50, 10, 60, 30};
		
		Map<Integer, Integer> arr = new HashMap();
		
		for(int i = 0; i < in.length; i++) {
			arr.put(in[i], i);
		}
		
		B01_Node root = construct(post, in, arr, 0, in.length-1, 0, post.length-1);
		
		levelOrder(root);
		
	}
	
	public static B01_Node construct(int[] post, int[] in,Map<Integer, Integer> arr, int is,int ie,int ps, int pe) {
		if(is > ie || ps > pe) {
			return null;
		}
		
		B01_Node node = new B01_Node(post[pe]);
		int iRoot = arr.get(post[pe]);
		
		int leftChildren = iRoot - is;
		
		node.left = construct(post, in, arr, is, iRoot - 1, ps, ps + leftChildren-1);
		
		node.right = construct(post, in, arr, iRoot+1, ie, ps + leftChildren, pe-1);
		
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
