
class LLNode {
	int data;
	LLNode next;
	
	LLNode(int d) {
		this.data = d;
		next = null;
	}
	
	LLNode(int d, LLNode n) {
		this.data = d;
		next = n;
	}
}

class LList {
	LLNode head;
	int size;
	
	LList() {
		head = null;
		size = 0;
	}
	
	public LLNode getNode(int index) {
		LLNode tmp = head;
		
		if(index > size -1) {
			index = size-1;
		}
		for(int i = 0; i < index; i++) {
			tmp = tmp.next;
		}
		
		return tmp;
	}
	
	public void print() {
		LLNode tmp = head;

		while(tmp != null) {
			System.out.print(tmp.data + " -> ");
			tmp = tmp.next;
		}
	}
	// O(1)
	public void insertFirst(int val) {
		LLNode node = new LLNode(val);
		node.next = head;
		head = node;
		size++;
		
	}
	
	// O(N)
	public void insertPosition(int val, int position) {
		if(head == null || position == 1) {
			insertFirst(val);
			return;
		}
		
		LLNode tail = getNode(position-2);
		LLNode node = new LLNode(val, tail.next);
		tail.next = node;
		size++;
		
	}
	
	// O(N)
	public void insert(int val) {
		LLNode node = new LLNode(val);
		
		if(head == null) {
			head = node;
			size++;
			return;
		}
		LLNode tail = getNode(size-1);
		
		tail.next = node;
		size++;
	}
	
	// O(1)
	public void deleteFirst() {
		if(head != null) {
			head = head.next;
			size--;
		}
	}
	
	// O(N)
	public void deleteLast() {
		if(size == 1) {
			deleteFirst();
			return;
		}
		LLNode tail = getNode(size-2);
		tail.next = null;
		size--;
	}
	
	// O(N)
	public void deletePosition(int position) {
		if(position == 1) {
			deleteFirst();
			return;
		}
		
		if(position > size) {
			return;
		}
		
		LLNode prev = getNode(position-2);
		prev.next = prev.next.next;
		size--;
		return;
	}
	
	public LLNode find(int val) {
		LLNode tmp = head;
		while(tmp != null) {
			if(tmp.data == val) {
				return tmp;
			}
			tmp = tmp.next;
		}
		return tmp;
	}
}


public class LL01_List {

	public static void main(String[] args) {
		LList list = new LList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.deletePosition(4);
		list.print();
	}

}
