package Questions;
import java.util.*;
public class QuestionNo_2 {
	
	
	public static int LinnerSearch(int arr[],int k , int n)
	{
		
		for(int i= n-1; i>=0;i--) {
			if(arr[i]==k) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int arr[]= {13,2,52,3,49,93,2};
		Scanner sc = new Scanner(System.in);
		System.out.println("key enter");
		int key=sc.nextInt();
		int index=LinnerSearch(arr,key,arr.length);
		if(index!=-1) {
			System.out.println("key found at index "+index);
		}else {
			
			System.out.println("key not found ");
		}
		
	}

}
