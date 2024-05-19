package Questions;

import java.util.Scanner;

public class QuestionNo_5 {
	public static int revBinarySearch(int arr[], int k ,int n) {
		int left=0;
		int right=n-1;
		
		while(left<=right) {
			
			int mid=(left+right)/2;
			
			if(arr[mid]==k) {
				return mid;
				
			}else if(arr[mid]>k) {
				left =mid+1;
			}
			else {
				right=mid-1;
			}
				
			
		}
		return -1;
		
		
	}

	public static void main(String[] args) {
		
		int arr[]= {99,88,77,66,55,44,22};
		Scanner sc = new Scanner(System.in);
		System.out.println("key enter");
		int key=sc.nextInt();
		int index=revBinarySearch(arr,key,arr.length);
		if(index!=-1) {
			System.out.println("key found at index "+index);
		}else {
			
			System.out.println("key not found ");
		}
		
		
	}

}
