package recursions;

public class PowerOfNumber {
	
	public static int recursivePowerOfNumber(int x, int n) {
		// Base case
		if(n == 0) {
			return 1;
		}else {
			// Recursive Case
			return x * recursivePowerOfNumber(x, n-1);
		}
	}

	public static void main(String[] args) {
		int x = 5, n = 2;
		System.out.print(recursivePowerOfNumber(x, n));
	}

}
