package Questions;
import java.util.*;

class employee{
	
	int empid;
	double salary;
	String name;
	employee(){
		
	}
	public employee(int empid,  String name,double salary) {
		super();
		this.empid = empid;
		this.salary = salary;
		this.name = name;
	}
	@Override
	public String toString() {
		return "employee [empid=" + empid + ", salary=" + salary + ", name=" + name + "]";
	}
	
	
}
public class QuestionNo_3 {
	
	public static void SortByempSalary(employee[] arr) {
        
		for(int i=0;i<arr.length;i++) {
			 double Salary = arr[i].salary;
	            String Name = arr[i].name;
	            int Empid = arr[i].empid;
			int j=i-1;
			while(j>=0&& arr[j].salary>Salary) {
				arr[j + 1].salary = arr[j].salary;
                arr[j + 1].name = arr[j].name;
                arr[j + 1].empid = arr[j].empid;
                j--;
			}
			arr[j + 1].salary = Salary;
            arr[j + 1].name = Name;
            arr[j + 1].empid = Empid;
		}
    }
    
	
	

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		 employee arr[] = new employee[5];
	        arr[0] = new employee(1, "Akshata", 50000.0);
	        arr[1] = new employee(2, "Tejas", 60000.0);
	        arr[2] = new employee(3, "Mood", 55000.0);
	        arr[3] = new employee(4, "ram", 70000.0);
	        arr[4] = new employee(5, "Pranav", 48000.0);
	        
	        System.out.println("**********************************************************************************************************");

	        
	        System.out.println("Before sorting by salary ");
	        
	        for (employee emp : arr) {
	            System.out.println(emp);
	        }
	        
	       
	         SortByempSalary(arr);
	         System.out.println("After sorting by salary ");
	         for (employee emp : arr) {
	             System.out.println(emp);
	         }
	         

	        System.out.println("**********************************************************************************************************");


	}

}
