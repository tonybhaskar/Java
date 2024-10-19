package recursions;


// Like Sum of digits of 1234 is: 10 i.e., 1+2+3+4 = 10
public class SumOfDigits {
	
	public static int recursiveSumOfDigits(int n) {
		//base case
		if(n == 0) {
			return n;
		}else {
			//recursive case
			return (n%10)+recursiveSumOfDigits(n/10);
		}
	}

	public static void main(String[] args) {
		System.out.print(recursiveSumOfDigits(12345));
	}

}
