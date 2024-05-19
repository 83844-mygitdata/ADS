package Questions;

public class QuestionNo2 {
    static class Node {
        Node next;
        int data;

        public Node(int val) {
            data = val;
            next = null;
        }
    }

    Node tail;

    public QuestionNo2() {
        tail = null;
    }

    public boolean isEmpty() {
        return tail == null;
    }

    public void addFirst(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            tail = newNode;
            newNode.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
        }
    }

    public void display() {
        if (isEmpty()) {
            return;
        }
        if (tail == tail.next) {
            System.out.print(tail.data);
        } else {
            Node trav = tail.next;
            do {
                System.out.print(" " + trav.data);
                trav = trav.next;
            } while (trav != tail.next);

            System.out.println();
        }
    }

    public void addLast(int val) {
        Node newNode = new Node(val);
        if (isEmpty()) {
            tail = newNode;
            newNode.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void deleteFirst() {
        if (isEmpty()) {
            System.out.println("List is Empty");
            return;
        } else if (tail == tail.next) {
            tail = null;
        } else {
            tail.next = tail.next.next;
        }
    }

    public void deleteLast() {
        if (isEmpty()) {
            System.out.println("List is Empty");
            return;
        } else if (tail == tail.next) {
            tail = null;
        } else {
            Node trav = tail;
            while (trav.next != tail) {
                trav = trav.next;
            }
            trav.next = null;
            tail = trav;
        }
    }

    public void addAtIndex(int index, int value) {
        if (index < 0) {
            System.out.println("Invalid index");
            return;
        }
        Node newNode = new Node(value);
        if (isEmpty() && index > 0) {
            System.out.println("List is Empty.");
            return;
        }
        if (index == 0) {
            addFirst(value);
            return;
        }
        Node current = tail.next;
        int currentIndex = 0;
        while (current != tail && currentIndex < index - 1) {
            current = current.next;
            currentIndex++;
        }
        if (currentIndex != index - 1) {
            System.out.println("Index out of bounds.");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
        if (current == tail) {
            tail = newNode;
        }
    }

    public void deleteAtPos(int index) {
        if (isEmpty() || index < 0) {
            System.out.println("List is Empty");
            return;
        }
        if (index == 0) {
            deleteFirst();
            return;
        }
        Node current = tail.next;
        Node prev = null;
        int currentIndex = 0;
        while (current != tail && currentIndex < index) {
            prev = current;
            current = current.next;
            currentIndex++;
        }
        if (currentIndex != index) {
            System.out.println("Index out of bounds. Can't delete at index " + index);
            return;
        }
        prev.next = current.next;
        if (current == tail) {
            tail = prev;
        }
    }

    public static void main(String[] args) {
        QuestionNo2 list = new QuestionNo2();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(50);

        list.addLast(20);
        list.display();

        list.addAtIndex(2, 30);
        list.display();

        list.deleteAtPos(1);
        list.display();
    }
}
