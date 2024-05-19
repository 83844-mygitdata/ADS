package Questions;

import java.util.ArrayList;

public class QuestionNo_7 {
    
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
        ArrayList<Integer> list = new ArrayList<>();
      
        for(int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for(int j = 0; j < arr.length; j++) {
                if(i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if(isUnique) {
                list.add(arr[i]);
            }
        }
        
     
        if(!list.isEmpty()) {
            System.out.println("First Unique Element: " + list.get(0));
        } else {
            System.out.println("No unique element found.");
        }
    }
}
