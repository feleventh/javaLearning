package feleventh.github.io;

public class SearchStringPosition {
	public static void main(String[] args){
		System.out.println(searchString("hello, word", "llo"));
	}
	public static int searchString(String str1, String str2){
		return str1.indexOf(str2);
	}
}
