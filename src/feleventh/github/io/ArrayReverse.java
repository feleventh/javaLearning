package feleventh.github.io;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayReverse {
    public static void main(String[] args) {
    	ArrayList<String> arrayList = new ArrayList<String>();
    	arrayList.add("A");
    	arrayList.add("B");
    	arrayList.add("C");
    	System.out.println(arrayList);
    	Collections.reverse(arrayList);
    	System.out.println(arrayList);
    }
}
