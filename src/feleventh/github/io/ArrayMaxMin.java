package feleventh.github.io;

import java.util.Arrays;
import java.util.Collections;

public class ArrayMaxMin {
    public static void main(String[] args) {
    	Integer[] numbers = {1, 2, 5, 7, 3, 0};
    	int min = (int) Collections.min(Arrays.asList(numbers));
    	int max = (int) Collections.max(Arrays.asList(numbers));
    	System.out.println("最小值：" + min);
    	System.out.println("最大值：" + max);
    }
}
