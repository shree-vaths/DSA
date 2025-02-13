// O(N)
// https://leetcode.com/problems/linked-list-cycle/description/
public class LL11_Find_Loop {

	public static void main(String[] args) {
		LList l1 = new LList();
		l1.insert(1);
		l1.insert(2);
		l1.insert(3);
		l1.insert(4);
		l1.insert(5);
		l1.insert(6);
		
		LLNode six = l1.getNode(6);
		
		six.next = l1.getNode(2);

		
		System.out.println(findLoop(l1.head));
	}
	
	public static boolean findLoop(LLNode head) {
		LLNode slow = head;
		LLNode fast = head;
		
		
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			
			if(slow == fast) {
				return true;
			}
		}
		
		return false;
	}

}
