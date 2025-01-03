import java.util.*;

class B11Pair {
	
	B01_Node node;
	int ver;
	
	B11Pair(B01_Node node, int j) {
		this.node = node;
		ver = j;
	}
}
public class B13_Vertical_Order {

	public static void main(String[] args) {
		B01_Node one = new B01_Node(1);
		B01_Node two = new B01_Node(2);
		B01_Node three = new B01_Node(3);
		B01_Node four = new B01_Node(4);
		B01_Node five = new B01_Node(5);
		B01_Node six = new B01_Node(6);
		B01_Node seven = new B01_Node(7);
		
		one.right = two;
		one.left = three;
		
		three.left = five;
		three.right = four;
		
		five.left = seven;
		five.right = six;
		
		HashMap<Integer, List<Integer>> res = new HashMap();
		vertical(one, res, 0);
		
		for (Integer key : res.keySet()) {
			System.out.print(key + " -> ");
		      System.out.println(res.get(key));
		  }
		
	}
	
	
	public static void vertical(B01_Node root, HashMap<Integer, List<Integer>> res,int vertical) {
		if(root == null) {
			return;
		}
		
		if(res.get(vertical) != null) {
			List<Integer> list = res.get(vertical);
			list.add(root.data);
			res.put(vertical, list);
		} else {
			List<Integer> list = new ArrayList();
			list.add(root.data);
			res.put(vertical, list);
		}
		
		vertical(root.left, res, vertical-1);
		vertical(root.right, res, vertical+1);
		
	}
	
	public static void vertical2(B01_Node root, HashMap<Integer, List<Integer>> res,int vertical) {
		if(root == null) {
			return;
		}
		
		Queue<B11Pair> q = new LinkedList();
		q.add(new B11Pair(root, 0));
		boolean leftToRight = true;
		
		while(!q.isEmpty()) {
			int size = q.size();
			for(int i = 0; i < size; i++) {
				B11Pair pair = q.remove();
				B01_Node node = pair.node;
				int v = pair.ver;
				
				if(node.left != null) {
					q.add(new B11Pair(node.left, v-1));
				}
				
				if(node.right != null) {
					q.add(new B11Pair(node.right, v+1));
				}
				
				if(res.get(v) != null) {
					List<Integer> list = res.get(v);
					list.add(node.data);
					res.put(v, list);
				} else {
					List<Integer> list = new ArrayList();
					list.add(node.data);
					res.put(v, list);
				}
			}
			
		}
	}

}
