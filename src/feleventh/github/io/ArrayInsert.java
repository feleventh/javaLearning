package feleventh.github.io;

public class ArrayInsert {
    public static void main(String[] args) {
    	int[] a = {2,3,7};
    	int[] arr = elementInsert(a, 5, 1);
    	for(int i : arr) {
    		System.out.print(i + ", ");
    	}
    }
    public static int[] elementInsert(int arr[], int element, int index) {
    	int length = arr.length;
    	int destination[] = new int[length + 1];
    	System.arraycopy(arr, 0, destination, 0, index);
    	destination[index] = element;
    	System.arraycopy(arr, index, destination, index + 1, length - index);
    	return destination;
    }
}
