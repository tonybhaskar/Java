package recursions;

public class FibonacciCode {
	
	public static int recursiveFibonacci(int n) {
		//base case
		if(n <= 1) {
			return n;
		}else {
			// recursive case
			return recursiveFibonacci(n-1) + recursiveFibonacci(n-2); 
		}
	}

	public static void main(String[] args) {
		
		// due to the recursiveFibonacci is static we don't need to create obj here
		System.out.print(recursiveFibonacci(6));
	}

}
