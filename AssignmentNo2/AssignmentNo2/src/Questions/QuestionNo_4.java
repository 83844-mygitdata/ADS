package Questions;
import java.util.*;

class Queue {
    int arr[];
    private int front;
    private int rear;
    private final int size;

    public Queue(int size) {
        this.size = size;
        rear = front = 0; 
        arr = new int[size];
    }

    public void push(int val) {
       
        arr[rear] = val;
        rear++;
        System.out.println("Added " + val);
    }

    public void pop() {
     
      int removed= arr[front];
        front++;
        System.out.println("Removed "+ removed );
    }

    public int peek() {
       
        return arr[front];
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return rear == size;
    }

   
}

public class QuestionNo_4 {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        int choice;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("0.Exit ");
            System.out.println("1.push ");
            System.out.println("2.pop ");
            System.out.println("3.peek ");
           

            System.out.println("Enter choice");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Thank You");
                    break;

                case 1:
                    System.out.println("Enter value ");
                    int val = sc.nextInt();
                    if (!q.isFull()) {
                        q.push(val);
                    } else {
                        System.out.println("Queue is full");
                    }
                    break;

                case 2:
                    if (!q.isEmpty()) {
                        q.pop();
                    } else {
                        System.out.println("Queue is empty");
                    }
                    break;

                case 3:
                    if (!q.isEmpty()) {
                        System.out.println("Front element: " + q.peek());
                    } else {
                        System.out.println("Queue is empty");
                    }
                    break;

               

                default:
                    System.out.println("Invalid choice");
                    break;
            }

        } while (choice != 0);
    }
}
