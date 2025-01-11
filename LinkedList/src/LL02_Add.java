// https://leetcode.com/problems/add-two-numbers/description/

// O(N)
public class LL02_Add {

	public static void main(String[] args) {
		LList l1 = new LList();
		l1.insert(2);
		l1.insert(4);
		l1.insert(9);

		LList l2 = new LList();
		l2.insert(5);
		l2.insert(6);
		l2.insert(4);
		
		LList l3 = new LList();
		l3.head = add(l1.head, l2.head);
		l3.print();
	}
	
	public static LLNode add(LLNode l1, LLNode l2) {
		int carry = 0;
		LLNode root = new LLNode(-1);
		LLNode cur = root;
		while(l1 != null || l2 != null || carry > 0) {
			int val1 = l1 != null ? l1.data : 0;
			
			int val2 = l2 != null ? l2.data : 0;
			
			int sum = val1 + val2 + carry;
			
			if(sum > 9) {
				carry = sum / 10;
			} else {
				carry = 0;
			}
			LLNode node = new LLNode(sum % 10);
			cur.next = node;
			cur = node;
			l1 =  l1 != null ? l1.next : null;
			l2 = l2 != null ? l2.next : null;
		}
		
		return root.next;
	}

}
