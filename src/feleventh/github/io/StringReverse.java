package feleventh.github.io;

public class StringReverse {
    public static void main(String[] args){
    	System.out.println(reverse("hello"));
    }
    public static String reverse(String str){
    	return new StringBuffer(str).reverse().toString();
    }
}
