// O(N)
public class LL16_Merge {

	public static void main(String[] args) {
		LList l1 = new LList();
		l1.insert(2);
		l1.insert(4);
		l1.insert(8);
		l1.insert(10);
		
		LList l2 = new LList();
		l2.insert(1);
		l2.insert(3);
		l2.insert(3);
		l2.insert(6);
		l2.insert(11);
		l2.insert(14);
		
		LList l3 = new LList();
		l3.head = merge(l1.head, l2.head);
		
		l3.print();
	}
	
	public static LLNode merge(LLNode h1, LLNode h2) {
		LLNode dummy = new LLNode(-1);
		LLNode tmp = dummy;
		LLNode t1 = h1;
		LLNode t2 = h2;
		
		while(t1 != null && t2 != null) {
			if(t1.data <= t2.data) {
				tmp.next = t1;
				t1 = t1.next;
				tmp = tmp.next;
			} else {
				tmp.next = t2;
				t2 = t2.next;
				tmp = tmp.next;
			}
		}
		
		if(t1 != null) {
			tmp.next = t1;
		}
		
		if(t2 != null) {
			tmp.next = t2;
		}
		
		return dummy.next;
	}

}
