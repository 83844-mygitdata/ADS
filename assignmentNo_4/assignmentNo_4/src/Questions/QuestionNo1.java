package Questions;

public class QuestionNo1 {
    
    static class Node{
        
        private int data;
        private Node next;
        
        public Node(int val) {
            data = val;
            next = null; // Added semicolon
        }
    }

    Node head;
    Node tail;
    public QuestionNo1() {
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
       tail.next=newNode;
       tail=newNode;
       
    }
    
    public void display() {
    	if(isEmpty()) {
    		
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
    	
    	if(isEmpty()) {
    		return;
    	}
    	else if(head==tail) {
    		head=tail=null;
    	}
    	else {
    		head= head.next;
    	}
    	
    }

 public void deleteLast() {
    	
    	if(isEmpty()) {
    		return;
    	}
    	else if(head==tail) {
    		head=tail=null;
    	}
    	else {
    		Node trav=head;
    		while(trav.next!=tail) {
    			trav =trav.next;
    			
    		}
    		tail=trav;
    		trav.next=null;
    		
    	}
    	
    }

	public static void main(String[] args) {
		
		QuestionNo1 list= new QuestionNo1();
		list.addFirst(12);
		list.addFirst(10);
		list.addFirst(8);
		list.addFirst(6);
		
		list.addLast(14);
		list.display();
		list.deleteFirst();
		list.deleteLast();
		
	list.display();
	}

}
