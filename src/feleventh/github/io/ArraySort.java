package feleventh.github.io;
import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) throws Exception {
    	int[] arr = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
    	Arrays.sort(arr);
    	for(int i : arr) {
    		System.out.print(i + ", ");
    	}
    	System.out.println("дЊЫи2дк" + Arrays.binarySearch(arr, 2));
    }
}
