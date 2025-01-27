
public class LL19_Add_1 {

	public static void main(String[] args) {
		LList l1 = new LList();
		l1.insert(9);
		l1.insert(9);
		l1.insert(9);
		
		l1.head = reverse(l1.head);
		
		LLNode tmp = l1.head;
		LLNode prev = null;
		int carry = 1;
		
		while(tmp != null) {
			int sum = tmp.data + carry;
			tmp.data = sum % 10;
			carry = sum / 10;
			prev = tmp;
			tmp = tmp.next;
		}
		
		if(carry > 0) {
			prev.next = new LLNode(carry);
		}
		
		l1.head = reverse(l1.head);
		l1.print();
	}
	
	public static LLNode reverse(LLNode head) {
		LLNode prev = null;
		LLNode cur = head;
		LLNode fur = head.next;
		
		while(cur != null) {
			cur.next = prev;
			prev = cur;
			cur = fur;
			fur = fur != null ? fur.next : null;
		}
		
		return prev;
	}
	
	

}
