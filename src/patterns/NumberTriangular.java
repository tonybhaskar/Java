package patterns;

/*
 *    1
 *   2 2
 *  3 3 3
 * 4 4 4 4
 */

public class NumberTriangular {

	public static void main(String[] args) {
		for(int i = 1; i<=4; i++) {
			for(int j=4-1; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(i);
				if(j<i)
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
