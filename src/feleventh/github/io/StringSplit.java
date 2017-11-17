package feleventh.github.io;

public class StringSplit {
    public static void main(String[] args){
    	String[] strs = stringSplit("hello,world", ",");
    	for(String s : strs){
    		System.out.println(s);
    	}
    
    }
    public static String[] stringSplit(String str, String delimeter){
    	return str.split(delimeter);
    }
}
