/*
 * Pointer 1 travels: a + c + b
	Pointer 2 travels: b + c + a
	By the time both pointers have switched lists, they will have traveled the same distance (a + b + c) 
 */
public class LL20_Intersection_Point {

	public static void main(String[] args) {
		LList l1 = new LList();
		LLNode three = new LLNode(3);
		l1.head = three;
		
		LList l2 = new LList();
		LLNode two = new LLNode(2);
		l2.head = two;
		two.next = three;
		
		getIntersectionNode(l1.head, l2.head);
	}
	
	
	public static LLNode getIntersectionNode(LLNode h1, LLNode h2) {
        if(h1 == h2) {
            return h1;
        }

        if(h1 == null || h2 == null) {
            return null;
        }
        LLNode l1 = h1;
        LLNode l2 = h2;
        while(true) {
            l1 = l1.next;
            l2 = l2.next;

            if(l1 == l2) {
                System.out.println(l1);
                return l1;
            }

            if(l1 == null) {
                l1 = h2;
            }

            if(l2 == null) {
                l2 = h1;
            }
        }
	}

}
