package feleventh.github.io;

public class StringCompare {
	public static void main(String args[]){
		String a = "Hello World";
		String b = "hello world";
		System.out.println(compare("Hello World", "hello world"));
		System.out.println(compareIgnoreCase(a, b));
	}
	public static int compare(String former, String latter){
		return former.compareTo(latter);
	}
	public static int compareIgnoreCase(String former, String latter){
		return former.compareToIgnoreCase(latter);
	}
}
