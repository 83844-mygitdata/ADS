package Questions;

import java.util.Scanner;

public class QuestionNo_6 {
	
	
	public static int LinearSearch(int arr[], int k,int n,int o) {
		int temp=0;
		int count=0;
		int mid=0;
		
		for(int i=0;i<n;i++) {
			
			if(arr[i]==k) {
				count++;
				mid=i;
			}
			if(count==o) {
				
				 return mid;
			
				}
			
		}
		
	
			return -1;
		
	}

	public static void main(String[] args) {
	
		
		int arr[]= {13,2,52,3,2,93,2};
		Scanner sc = new Scanner(System.in);
		System.out.println("key enter which you want to find ");
		int key=sc.nextInt();
		System.out.println("key occurence");
		int occurence=sc.nextInt();
		
		int index=LinearSearch(arr,key,arr.length,occurence);
		if(index!=-1) {
			System.out.println("key found at index "+index);
		}else {
			
			System.out.println("key not found  -1 ");
		}
		
		
		

	}

}
