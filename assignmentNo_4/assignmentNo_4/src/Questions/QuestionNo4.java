package Questions;

import Questions.QuestionNo1.Node;

public class QuestionNo4 {
    
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
    public QuestionNo4() {
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
 
 
 public void reverse() {
	 
	 Node prev=null;
	 Node curr = head;
	 while(curr!=null) {
		 Node temp = curr.next;
		 curr.next=prev;
		 prev=curr;
		 curr=temp;
		
	 }
	 head = prev;
	 
	 if (head != null) {
	        Node temp = head;
	        while (temp.next != null) {
	            temp = temp.next;
	        }
	        tail = temp;
	    }
 }

	public static void main(String[] args) {
		QuestionNo4 list= new QuestionNo4();
		list.addFirst(12);
		list.addFirst(10);
		list.addFirst(8);
		list.addFirst(6);
		
		list.addLast(14);
	
		list.deleteFirst();
		list.deleteLast();
		list.display();
		list.reverse();
		
	list.display();
		

	}

}
