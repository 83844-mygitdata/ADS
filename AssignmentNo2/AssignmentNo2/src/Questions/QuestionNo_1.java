package Questions;

import java.util.Arrays;

public class QuestionNo_1 {
	
	public static int InsertionSort(int arr[],int n) {
		 
		int comparisions=0;
		
		for(int i=1;i<n;i++) {
			
			int temp=arr[i];
			int j= i-1;
			comparisions++;
			while(j>=0 && arr[j]>temp) {
				
				arr[j+1]=arr[j];
				j--;
				
			}
			arr[j+1]=temp;
			
		}
		
		
		return comparisions;
		
	}

	public static void main(String[] args) {
		
		int arr[]= {12,33,22,15,24};
		
		System.out.println("before");
		System.out.println(Arrays.toString(arr));
		int comp=InsertionSort(arr, arr.length);
		System.out.println("After");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("comparisions are -  "+ comp);
		

	}

}
