package recursions;

public class FactorialCode {
	
	public static int recursiveFactorial(int n) {
		// Base case
		if(n == 1)
			return 1;
		
		// Recursive case
		return n * recursiveFactorial(n-1);
	}
	
	
	public static void main(String[] args) {
		System.out.print(recursiveFactorial(4));
	}

}
