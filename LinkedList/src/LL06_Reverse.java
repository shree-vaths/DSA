// We can use stack while moving forward and then pop all items to create new list
// https://leetcode.com/problems/reverse-linked-list/submissions/1520398571/
public class LL06_Reverse {

	public static void main(String[] args) {
		LList l1 = new LList();
		l1.insert(1);
		l1.insert(2);
		l1.insert(3);
		l1.insert(4);
		l1.insert(5);
		l1.insert(6);
		
		l1.head = rev(l1.head);
		l1.print();
	}
	
	public static LLNode reverse(LLNode head) {
		LLNode prev = null;
		LLNode cur = head;
		LLNode next = head.next;
		
		while(cur != null) {
			cur.next = prev;
			prev = cur;
			cur = next;
			next = next != null ? next.next : null;
		}
		return prev;
	}
	
	public static LLNode rev(LLNode head) {
		if(head.next == null) {
			return head;
		}
		
		LLNode newHead = rev(head.next);
		LLNode front = head.next;
		front.next = head;
		head.next = null;
		return newHead;
	}

}
