import java.util.Arrays;

public class ReverseAllArrayFunctions {

 public static void main(String[] args) {

 int[] arr = {1, 2, 3, 4, 5};
	int total = 0;
        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
	total = arr[n - i - 1];
	}
	
        System.out.println("Reversed Array: " + (total));
        
    

  
    }
}












