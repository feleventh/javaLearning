package feleventh.github.io;

public class StringRemoveChar {
    public static void main(String[] args){
    	System.out.println(removeChar("heello", 2));
    	String s = "my.test.txt";
    	System.out.println(s.replace(".", "#"));
    	System.out.println(s.replaceAll(".", "#"));
    	System.out.println(s.replaceFirst(".", "#"));
    }
    /**
     * remove char in index
     * @param str
     * @param i
     * @return
     */
    public static String removeChar(String str, int i){
    	return str.substring(0, i) + str.substring(i + 1);
    }
}
