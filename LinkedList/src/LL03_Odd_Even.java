// https://leetcode.com/problems/odd-even-linked-list/description/

// O(N)
public class LL03_Odd_Even {

	public static void main(String[] args) {
		LList l1 = new LList();
		l1.insert(2);
		l1.insert(4);
		l1.insert(9);
		l1.insert(10);
		
		LList l2 = new LList();
		l2.head = oddEven(l1.head);
		l2.print();
	}
	
	public static LLNode oddEven(LLNode node) {
		if(node == null || node.next == null) {
			return node;
		}
		LLNode odd = node;
		LLNode head = odd;
		LLNode even = head.next;
		LLNode joiningPT = even;
		
		while(even != null && even.next != null) {
			odd.next = odd.next.next;
			even.next = even.next.next;
			
			odd = odd.next;
			even = even.next;
		}
		
		odd.next = joiningPT;
		return head;
	}

}
