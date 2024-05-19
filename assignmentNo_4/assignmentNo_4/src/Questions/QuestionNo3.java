package Questions;

public class QuestionNo3 {

	static class Node {

		private int data;
		private Node next;

		public Node(int val) {
			data = val;
			next = null;
		}
	}

	Node head;
	Node tail;

	public QuestionNo3() {
		head = null;
		tail = null;

	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int val) {

		Node newNode = new Node(val);
		if (isEmpty()) {
			tail = newNode;
		}
		newNode.next = head;
		head = newNode;
	}

	public void addLast(int val) {

		Node newNode = new Node(val);
		if (isEmpty()) {
			head = tail = newNode;
		}
		tail.next = newNode;
		tail = newNode;

	}

	public void display() {
		if (isEmpty()) {

			System.out.println("List is empty");
			return;
		}

		Node trav = head;
		while (trav != tail.next) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
		System.out.println();

	}

	public void deleteFirst() {

		if (isEmpty()) {
			return;
		} else if (head == tail) {
			head = tail = null;
		} else {
			head = head.next;
		}

	}

	public void deleteLast() {

		if (isEmpty()) {
			return;
		} else if (head == tail) {
			head = tail = null;
		} else {
			Node trav = head;
			while (trav.next != tail) {
				trav = trav.next;

			}
			tail = trav;
			trav.next = null;

		}

	}

	
	public void addAfter(int data,int value) {
		
		Node trav=head;
		Node newNode= new Node(value);
		if(isEmpty()) {
			head= newNode;
			
		}
		
		while(trav!=null) {
			
			if(trav.data==data) {
				
				break;
			}
			else {
				trav= trav.next;
				
			}
		}
		
		System.out.print(trav.data);
		newNode.next=trav.next;
		trav.next=newNode;
		if(trav==tail) {
			tail=newNode;
		}
		
		
	}
	public void addBefore(int data, int value) {
    Node trav = head;
    Node prev = null;
    Node newNode = new Node(value);

    if (isEmpty()) {
        head = newNode;
        return; 
    }

    while (trav != null) {
        if (trav.data == data) {
          
            break;
        } else {
            prev = trav;
            trav = trav.next;
        }
    }

    if (prev == null) {
       
        newNode.next = head;
        head = newNode;
    } else {
       
        newNode.next = trav;
        prev.next = newNode;
    }
}


	public static void main(String[] args) {
		QuestionNo3 list= new QuestionNo3();
		list.addFirst(12);
		list.addFirst(10);
		list.addFirst(8);
		list.addFirst(6);
		
		list.addLast(14);
		list.display();
		list.addAfter(14, 100);
		//list.addBefore(14, 100);
	
	

	
	
	list.display();
	

	}

}
