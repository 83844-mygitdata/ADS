package Questions;
import java.util.*;



 class employee{

	 
	 int empid;
	 String name;
	 double salary;
	public employee(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	public employee() {
		
	}
	@Override
	public String toString() {
		return "employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	
 
	
}
 

public class QuestionNo_4 {
	
	
	
	  public static int SearchByempId(employee[] arr, int empid) {
	        for (int i = 0; i < arr.length; i++) {
	            if ( arr[i].empid == empid) {
	                return i; 
	            }
	        }
	        return -1;
	    }
	    
	
	  public static int SearchByempName(employee[] arr, String name) {
		    for (int i = 0; i < arr.length; i++) {
		        if (arr[i].name.equals(name)) {
		            return i;
		        }
		    }
		    return -1;
		}

	
	
	public static int SearchByempSalary(employee[] arr, double salary) {
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i].salary == salary) {
                return i; 
            }
        }
        return -1;
    }
    
	
	
	
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        employee arr[] = new employee[5];
        arr[0] = new employee(1, "Akshata", 50000.0);
        arr[1] = new employee(2, "Tejas", 60000.0);
        arr[2] = new employee(3, "Mood", 55000.0);
        arr[3] = new employee(4, "ram", 70000.0);
        arr[4] = new employee(5, "Pranav", 48000.0);

        System.out.println("Enter name to search:");
        String name = sc.next();
        int index1 = SearchByempName(arr, name);
        if (index1 != -1)
            System.out.println(arr[index1]);

        System.out.println("**********************************************************************************************************");

        System.out.println("Enter id to search:");
        int empid = sc.nextInt();
        int index2 = SearchByempId(arr, empid);
        if (index2 != -1)
            System.out.println(arr[index2]);
        System.out.println("**********************************************************************************************************");

        System.out.println("Enter salary to search:");
        double salary = sc.nextDouble();
        int index3 = SearchByempSalary(arr, salary);
        if (index3 != -1)
            System.out.println(arr[index3]);

        System.out.println("**********************************************************************************************************");

        sc.close();
    }
}