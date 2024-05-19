package Questions;

import java.util.Arrays;

public class QuestionNo_2 {


	public static void InsertionSort(int arr[],int n) {
		 
	
		
	
		for(int i = 1; i < n; i++) {
		    int temp = arr[i];
		    int j = i - 1;
		
		    while(j >= 0 && arr[j] < temp) { 
		        arr[j + 1] = arr[j];
		        j--;
		    }
		    arr[j + 1] = temp;
		}

		
		
		
		
	}

	public static void main(String[] args) {
		
		int arr[]= {12,33,22,15,24};
		
		System.out.println("before");
		System.out.println(Arrays.toString(arr));
	    InsertionSort(arr, arr.length);
		System.out.println("After sort desc order ");
		System.out.println(Arrays.toString(arr));
		
		
		

	}

}
