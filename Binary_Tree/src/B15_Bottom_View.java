import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class B15_Bottom_View {

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
		bottom(one, res, 0);
		
		for (Integer key : res.keySet()) {
			System.out.print(key + " -> ");
		      System.out.println(res.get(key));
		  }
	}
	
	/*
	 * Pick last element of each vertical. Boundry traversal dont work here
	 */
	public static void bottom(B01_Node root, HashMap<Integer, List<Integer>> res,int vertical) {
		if(root == null) {
			return;
		}
		
			List<Integer> list = new ArrayList();
			list.add(root.data);
			res.put(vertical, list);
		
		bottom(root.left, res, vertical-1);
		bottom(root.right, res, vertical+1);
		
	}

}
