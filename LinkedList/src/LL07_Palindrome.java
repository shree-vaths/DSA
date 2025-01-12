
public class LL07_Palindrome {

	public static void main(String[] args) {
		LList l1 = new LList();
		l1.insert(1);
		l1.insert(2);
		l1.insert(3);
		l1.insert(3);
		l1.insert(4);
		l1.insert(2);
		l1.insert(1);
		
		System.out.println(palindrome(l1.head));
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
	
	public static boolean palindrome(LLNode head) {
		LLNode slow = head;
		LLNode fast = head;
		
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		LLNode newHead = reverse(slow.next);
		
		LLNode n1 = head;
		LLNode n2 = newHead;
		
		while(n1 != null && n2 != null) {
			if(n1.data != n2.data) {
				return false;
			}
			n1 = n1.next;
			n2 = n2.next;
		}
		return true;
	}

}
