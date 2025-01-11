// https://leetcode.com/problems/remove-nth-node-from-end-of-list/solutions/

// O(N)
// We have already taken k steps we need to take n-k steps which needs to keep track of
public class LL05_Remove_Last {

	public static void main(String[] args) {
		LList l1 = new LList();
		l1.insert(1);
		l1.insert(2);
		l1.insert(3);
		l1.insert(4);
		l1.insert(5);
		
		l1.head = remove(l1.head, 2);
		
		l1.print();
	}
	
	
	public static LLNode remove(LLNode head, int k) {
		
		LLNode i = head;
		LLNode j = head;
		
		for(int indx = 0; indx < k; indx++) {
			i = i.next;
		}
		
		if(i == null) {
			head = head.next;
			return head;
		}
		while(i.next != null) {
			i = i.next;
			j = j.next;
		}
		
		j.next = j.next.next;
		return head;
	}

}
