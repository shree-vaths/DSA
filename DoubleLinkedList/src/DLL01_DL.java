
class DLLNode {
	int data;
	DLLNode next;
	DLLNode prev;
	
	DLLNode(int val) {
		this.data = val;
		next = null;
		prev = null;
	}
}

class DLList {
	DLLNode head;
	int size;
	
	DLList() {
		head = null;
		size = 0;
	}
	
	public DLLNode findAtK(int position) {
		DLLNode tmp = head;
		if(position == 1) {
			return head;
		}
		int k = 1;
		
		while(k < position) {
			k++;
			tmp = tmp.next;
		}
		return tmp;
	}
	
	public void insertFirst(int val) {
		DLLNode node = new DLLNode(val);
		node.next = head;
		node.prev = null;
		if(head != null) {
			head.prev = node;
		}
		head = node;
		size++;
	}
	
	public void insertLast(int val) {
		if(head == null) {
			insertFirst(val);
			return;
		}
		DLLNode node = new DLLNode(val);
		DLLNode tmp = head;
		while(tmp.next != null) {
			tmp = tmp.next;
		}
		tmp.next = node;
		node.next = null;
		node.prev = tmp;
		size++;
	}
	
	public void insertAtk(int val, int position) {
		if(position == 1) {
			insertFirst(val);
			return;
		}
		if(position >= size) {
			insertLast(val);
			return;
		}
		
		DLLNode prevNode = findAtK(position-1);
		DLLNode futureNode = prevNode.next;
		DLLNode node = new DLLNode(val);
		node.next = futureNode;
		prevNode.next = node;
		node.prev = prevNode;
		futureNode.prev = node;
		size++;
	}
	public void display() {
		DLLNode tmp = head;
		while(tmp != null) {
			System.out.print(tmp.data + " -> ");
			tmp = tmp.next;
		}
		System.out.println();
	}
}
public class DLL01_DL {

	public static void main(String[] args) {
		DLList dl = new DLList();
		dl.insertFirst(1);
		dl.insertFirst(2);
		dl.insertLast(3);
		dl.insertLast(4);
		dl.display();

		dl.insertAtk(5, 3);
		dl.display();
		
		System.out.println(dl.findAtK(3).data);
	}

}
