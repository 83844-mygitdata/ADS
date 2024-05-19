package Questions;

import java.util.Arrays;

public class QuestionNo_9 {
	
	public static int SelectionSort(int arr[], int n) {
		
		int count=0;
		
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				count++;
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int arr[]= {13,2,52,3,2,93,2};
		
		System.out.println("Before  ");
		System.out.println(Arrays.toString(arr));
		int comparisions= SelectionSort(arr, arr.length);
		System.out.println("After   ");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("comparisions   "+comparisions);
		
		
		
		
	}
}
