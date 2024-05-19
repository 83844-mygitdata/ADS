package Questions;

import Questions.QuestionNo1.Node;

public class QuestionNo5 {
	   
    static class Node{
        
        private int data;
        private Node next;
        
        public Node(int val) {
            data = val;
            next = null; 
        }
    }

    Node head;
    Node tail;
    public QuestionNo5() {
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

 
 
 
 public void insert(int val) {
	 if(isEmpty()) {
		 addFirst(val);
		 
	 }
	 else {
		 if(val>head.data) {
			 addLast(val);
		 }else {
			 addFirst(val);
		 }
	 }
 }
 
 
 
 
	public static void main(String[] args) {
		
		QuestionNo5 list = new QuestionNo5();
		list.insert(10);
		list.insert(5);
		list.insert(15);
		list.insert(20);
		list.insert(50);
		
		list.display();
		
	}

}
