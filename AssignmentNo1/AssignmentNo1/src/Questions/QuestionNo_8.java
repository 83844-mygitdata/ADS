package Questions;
public class QuestionNo_8 {
	
	public static int findRank(int[] arr, int temp) {
        int count = 0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] <= temp) {
                count++;
            }
        }
        return count;
    }
	
    public static void main(String[] args) {
        int[] arr = {10, 20, 15, 3, 4, 4, 1};
        int temp =4;
        
        int rank = findRank(arr, temp);
        System.out.println("Rank of " + temp + " is: " + rank);
    }
    
    
}
