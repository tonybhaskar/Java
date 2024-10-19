package recursions;

public class ReverseString {
	
	public static String recursiveReverseString(String str) {
		// Base case
		if(str.isEmpty()) {
			return str;
		}else {
			// Recursive case
			return recursiveReverseString(str.substring(1)) + str.charAt(0);
		}
	}

	public static void main(String[] args) {
		String s = "ECLIPSE";
		System.out.println("Original String: "+s);
		System.out.print("Reversed String: "+recursiveReverseString("ECLIPSE"));
	}

}
