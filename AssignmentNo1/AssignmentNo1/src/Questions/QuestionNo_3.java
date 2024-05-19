package Questions;



import java.util.Scanner;

public class QuestionNo_3 {


		
		public static int linearSearch(int arr[], int size, int target) {
			
			for(int i=0; i<size; i++) {
				if(arr[i] == target) {
					return i; 
				}
			}
			
			return -1;
		}
		
		public static int  binarySearch(int arr[], int size, int target) {
			int s = 0; 
			int e= size-1; 
			int comp =0;
			
			while(s<=e) {
				int mid = (s+e)/2; 
				comp++;
				
				if(target == arr[mid]) {
//					
					System.out.println("Total number of comparisons in BS: " + comp);
					return 2; 
				}else if(target > arr[mid]) {
					s = mid+1; 
				}else {
					e = mid -1; 
				}
			}
			System.out.println("Total number of comparisons in BS: " + comp);
			return -1; 
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in); 
				
			int arr[] = {11, 22, 33, 44, 55, 66}; 
			System.out.println("Enter the target to search: ");
			int target = sc.nextInt();
			
			int ans = linearSearch(arr, arr.length,  target); 
			
			if(ans!= -1) {
				System.out.println("Target found at index: "+ ans);
				System.out.println("Total number of comparisons done in LS: " +(ans+1));
				
			}
			else {
				System.out.println("Target doesn't exist");
				System.out.println("Total number of comparisons done in LS: "+ arr.length);
			}
			
			System.out.println("---------------Binary Search-----------");
			
			int ansBS = binarySearch(arr, arr.length, target); 
			
			if(ansBS == -1) {
				System.out.println("Target not found");
			}else {
				System.out.println("Target found ");
			}
			
			
		}

	}